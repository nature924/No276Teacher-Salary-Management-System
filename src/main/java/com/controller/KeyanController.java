
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 科研
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/keyan")
public class KeyanController {
    private static final Logger logger = LoggerFactory.getLogger(KeyanController.class);

    private static final String TABLE_NAME = "keyan";

    @Autowired
    private KeyanService keyanService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private GonggaoService gonggaoService;//公告信息
    @Autowired
    private JiaoxuezhiliangService jiaoxuezhiliangService;//教学质量
    @Autowired
    private LaoshiService laoshiService;//老师
    @Autowired
    private LaoshikaoqinService laoshikaoqinService;//老师考勤
    @Autowired
    private LaoshiqingjiaService laoshiqingjiaService;//老师请假
    @Autowired
    private TiaokeService tiaokeService;//调课申请
    @Autowired
    private XinziService xinziService;//薪资
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = keyanService.queryPage(params);

        //字典表数据转换
        List<KeyanView> list =(List<KeyanView>)page.getList();
        for(KeyanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KeyanEntity keyan = keyanService.selectById(id);
        if(keyan !=null){
            //entity转view
            KeyanView view = new KeyanView();
            BeanUtils.copyProperties( keyan , view );//把实体数据重构到view中
            //级联表 老师
            //级联表
            LaoshiEntity laoshi = laoshiService.selectById(keyan.getLaoshiId());
            if(laoshi != null){
            BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "laoshiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setLaoshiId(laoshi.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KeyanEntity keyan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,keyan:{}",this.getClass().getName(),keyan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老师".equals(role))
            keyan.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<KeyanEntity> queryWrapper = new EntityWrapper<KeyanEntity>()
            .eq("laoshi_id", keyan.getLaoshiId())
            .eq("keyan_name", keyan.getKeyanName())
            .eq("keyan_address", keyan.getKeyanAddress())
            .eq("keyan_types", keyan.getKeyanTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanEntity keyanEntity = keyanService.selectOne(queryWrapper);
        if(keyanEntity==null){
            keyan.setInsertTime(new Date());
            keyan.setCreateTime(new Date());
            keyanService.insert(keyan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KeyanEntity keyan, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,keyan:{}",this.getClass().getName(),keyan.toString());
        KeyanEntity oldKeyanEntity = keyanService.selectById(keyan.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("老师".equals(role))
//            keyan.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(keyan.getKeyanContent()) || "null".equals(keyan.getKeyanContent())){
                keyan.setKeyanContent(null);
        }
        if("".equals(keyan.getKeyanChengguoFile()) || "null".equals(keyan.getKeyanChengguoFile())){
                keyan.setKeyanChengguoFile(null);
        }
        if("".equals(keyan.getKeyanChengguoContent()) || "null".equals(keyan.getKeyanChengguoContent())){
                keyan.setKeyanChengguoContent(null);
        }

            keyanService.updateById(keyan);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<KeyanEntity> oldKeyanList =keyanService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        keyanService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer laoshiId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<KeyanEntity> keyanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            KeyanEntity keyanEntity = new KeyanEntity();
//                            keyanEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //老师 要改的
//                            keyanEntity.setKeyanUuidNumber(data.get(0));                    //科研编号 要改的
//                            keyanEntity.setKeyanName(data.get(0));                    //科研名称 要改的
//                            keyanEntity.setKeyanAddress(data.get(0));                    //科研地点 要改的
//                            keyanEntity.setKeyanTypes(Integer.valueOf(data.get(0)));   //科研类型 要改的
//                            keyanEntity.setKeyanContent("");//详情和图片
//                            keyanEntity.setKeyanKaishiTime(sdf.parse(data.get(0)));          //科研开始时间 要改的
//                            keyanEntity.setKeyanJieshuTime(sdf.parse(data.get(0)));          //科研结束时间 要改的
//                            keyanEntity.setKeyanChengguoFile(data.get(0));                    //成果附件 要改的
//                            keyanEntity.setKeyanChengguoContent("");//详情和图片
//                            keyanEntity.setInsertTime(date);//时间
//                            keyanEntity.setCreateTime(date);//时间
                            keyanList.add(keyanEntity);


                            //把要查询是否重复的字段放入map中
                                //科研编号
                                if(seachFields.containsKey("keyanUuidNumber")){
                                    List<String> keyanUuidNumber = seachFields.get("keyanUuidNumber");
                                    keyanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> keyanUuidNumber = new ArrayList<>();
                                    keyanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("keyanUuidNumber",keyanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //科研编号
                        List<KeyanEntity> keyanEntities_keyanUuidNumber = keyanService.selectList(new EntityWrapper<KeyanEntity>().in("keyan_uuid_number", seachFields.get("keyanUuidNumber")));
                        if(keyanEntities_keyanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KeyanEntity s:keyanEntities_keyanUuidNumber){
                                repeatFields.add(s.getKeyanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [科研编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        keyanService.insertBatch(keyanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

