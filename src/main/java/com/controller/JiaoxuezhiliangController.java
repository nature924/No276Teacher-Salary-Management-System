
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
 * 教学质量
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiaoxuezhiliang")
public class JiaoxuezhiliangController {
    private static final Logger logger = LoggerFactory.getLogger(JiaoxuezhiliangController.class);

    private static final String TABLE_NAME = "jiaoxuezhiliang";

    @Autowired
    private JiaoxuezhiliangService jiaoxuezhiliangService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private GonggaoService gonggaoService;//公告信息
    @Autowired
    private KeyanService keyanService;//科研
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
        PageUtils page = jiaoxuezhiliangService.queryPage(params);

        //字典表数据转换
        List<JiaoxuezhiliangView> list =(List<JiaoxuezhiliangView>)page.getList();
        for(JiaoxuezhiliangView c:list){
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
        JiaoxuezhiliangEntity jiaoxuezhiliang = jiaoxuezhiliangService.selectById(id);
        if(jiaoxuezhiliang !=null){
            //entity转view
            JiaoxuezhiliangView view = new JiaoxuezhiliangView();
            BeanUtils.copyProperties( jiaoxuezhiliang , view );//把实体数据重构到view中
            //级联表 老师
            //级联表
            LaoshiEntity laoshi = laoshiService.selectById(jiaoxuezhiliang.getLaoshiId());
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
    public R save(@RequestBody JiaoxuezhiliangEntity jiaoxuezhiliang, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiaoxuezhiliang:{}",this.getClass().getName(),jiaoxuezhiliang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老师".equals(role))
            jiaoxuezhiliang.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiaoxuezhiliangEntity> queryWrapper = new EntityWrapper<JiaoxuezhiliangEntity>()
            .eq("laoshi_id", jiaoxuezhiliang.getLaoshiId())
            .eq("jiaoxuezhiliang_address", jiaoxuezhiliang.getJiaoxuezhiliangAddress())
            .eq("jiaoxuezhiliang_types", jiaoxuezhiliang.getJiaoxuezhiliangTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxuezhiliangEntity jiaoxuezhiliangEntity = jiaoxuezhiliangService.selectOne(queryWrapper);
        if(jiaoxuezhiliangEntity==null){
            jiaoxuezhiliang.setInsertTime(new Date());
            jiaoxuezhiliang.setCreateTime(new Date());
            jiaoxuezhiliangService.insert(jiaoxuezhiliang);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoxuezhiliangEntity jiaoxuezhiliang, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,jiaoxuezhiliang:{}",this.getClass().getName(),jiaoxuezhiliang.toString());
        JiaoxuezhiliangEntity oldJiaoxuezhiliangEntity = jiaoxuezhiliangService.selectById(jiaoxuezhiliang.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("老师".equals(role))
//            jiaoxuezhiliang.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(jiaoxuezhiliang.getJiaoxuezhiliangFile()) || "null".equals(jiaoxuezhiliang.getJiaoxuezhiliangFile())){
                jiaoxuezhiliang.setJiaoxuezhiliangFile(null);
        }
        if("".equals(jiaoxuezhiliang.getJiaoxuezhiliangContent()) || "null".equals(jiaoxuezhiliang.getJiaoxuezhiliangContent())){
                jiaoxuezhiliang.setJiaoxuezhiliangContent(null);
        }
        if("".equals(jiaoxuezhiliang.getJiaoxuezhiliangPingyuContent()) || "null".equals(jiaoxuezhiliang.getJiaoxuezhiliangPingyuContent())){
                jiaoxuezhiliang.setJiaoxuezhiliangPingyuContent(null);
        }

            jiaoxuezhiliangService.updateById(jiaoxuezhiliang);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<JiaoxuezhiliangEntity> oldJiaoxuezhiliangList =jiaoxuezhiliangService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        jiaoxuezhiliangService.deleteBatchIds(Arrays.asList(ids));

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
            List<JiaoxuezhiliangEntity> jiaoxuezhiliangList = new ArrayList<>();//上传的东西
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
                            JiaoxuezhiliangEntity jiaoxuezhiliangEntity = new JiaoxuezhiliangEntity();
//                            jiaoxuezhiliangEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //老师 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangUuidNumber(data.get(0));                    //教学质量编号 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangAddress(data.get(0));                    //考核地点 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangFile(data.get(0));                    //考核附件 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangTime(sdf.parse(data.get(0)));          //考核时间 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangTypes(Integer.valueOf(data.get(0)));   //考核结果 要改的
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangContent("");//详情和图片
//                            jiaoxuezhiliangEntity.setJiaoxuezhiliangPingyuContent("");//详情和图片
//                            jiaoxuezhiliangEntity.setInsertTime(date);//时间
//                            jiaoxuezhiliangEntity.setCreateTime(date);//时间
                            jiaoxuezhiliangList.add(jiaoxuezhiliangEntity);


                            //把要查询是否重复的字段放入map中
                                //教学质量编号
                                if(seachFields.containsKey("jiaoxuezhiliangUuidNumber")){
                                    List<String> jiaoxuezhiliangUuidNumber = seachFields.get("jiaoxuezhiliangUuidNumber");
                                    jiaoxuezhiliangUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jiaoxuezhiliangUuidNumber = new ArrayList<>();
                                    jiaoxuezhiliangUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jiaoxuezhiliangUuidNumber",jiaoxuezhiliangUuidNumber);
                                }
                        }

                        //查询是否重复
                         //教学质量编号
                        List<JiaoxuezhiliangEntity> jiaoxuezhiliangEntities_jiaoxuezhiliangUuidNumber = jiaoxuezhiliangService.selectList(new EntityWrapper<JiaoxuezhiliangEntity>().in("jiaoxuezhiliang_uuid_number", seachFields.get("jiaoxuezhiliangUuidNumber")));
                        if(jiaoxuezhiliangEntities_jiaoxuezhiliangUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JiaoxuezhiliangEntity s:jiaoxuezhiliangEntities_jiaoxuezhiliangUuidNumber){
                                repeatFields.add(s.getJiaoxuezhiliangUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [教学质量编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jiaoxuezhiliangService.insertBatch(jiaoxuezhiliangList);
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

