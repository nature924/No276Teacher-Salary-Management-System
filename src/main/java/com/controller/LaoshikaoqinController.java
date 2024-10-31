
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
 * 老师考勤
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/laoshikaoqin")
public class LaoshikaoqinController {
    private static final Logger logger = LoggerFactory.getLogger(LaoshikaoqinController.class);

    private static final String TABLE_NAME = "laoshikaoqin";

    @Autowired
    private LaoshikaoqinService laoshikaoqinService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private GonggaoService gonggaoService;//公告信息
    @Autowired
    private JiaoxuezhiliangService jiaoxuezhiliangService;//教学质量
    @Autowired
    private KeyanService keyanService;//科研
    @Autowired
    private LaoshiService laoshiService;//老师
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
        PageUtils page = laoshikaoqinService.queryPage(params);

        //字典表数据转换
        List<LaoshikaoqinView> list =(List<LaoshikaoqinView>)page.getList();
        for(LaoshikaoqinView c:list){
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
        LaoshikaoqinEntity laoshikaoqin = laoshikaoqinService.selectById(id);
        if(laoshikaoqin !=null){
            //entity转view
            LaoshikaoqinView view = new LaoshikaoqinView();
            BeanUtils.copyProperties( laoshikaoqin , view );//把实体数据重构到view中
            //级联表 老师
            //级联表
            LaoshiEntity laoshi = laoshiService.selectById(laoshikaoqin.getLaoshiId());
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
    public R save(@RequestBody LaoshikaoqinEntity laoshikaoqin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,laoshikaoqin:{}",this.getClass().getName(),laoshikaoqin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老师".equals(role))
            laoshikaoqin.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<LaoshikaoqinEntity> queryWrapper = new EntityWrapper<LaoshikaoqinEntity>()
            .eq("laoshi_id", laoshikaoqin.getLaoshiId())
            .eq("kaoqin_time", new SimpleDateFormat("yyyy-MM-dd").format(laoshikaoqin.getKaoqinTime()))
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LaoshikaoqinEntity laoshikaoqinEntity = laoshikaoqinService.selectOne(queryWrapper);
        if(laoshikaoqinEntity==null){
            laoshikaoqin.setInsertTime(new Date());
            laoshikaoqin.setCreateTime(new Date());
            laoshikaoqinService.insert(laoshikaoqin);
            return R.ok();
        }else {
            return R.error(511,"该老师该天已有考勤记录");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LaoshikaoqinEntity laoshikaoqin, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,laoshikaoqin:{}",this.getClass().getName(),laoshikaoqin.toString());
        LaoshikaoqinEntity oldLaoshikaoqinEntity = laoshikaoqinService.selectById(laoshikaoqin.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("老师".equals(role))
//            laoshikaoqin.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(laoshikaoqin.getLaoshikaoqinContent()) || "null".equals(laoshikaoqin.getLaoshikaoqinContent())){
                laoshikaoqin.setLaoshikaoqinContent(null);
        }

            laoshikaoqinService.updateById(laoshikaoqin);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<LaoshikaoqinEntity> oldLaoshikaoqinList =laoshikaoqinService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        laoshikaoqinService.deleteBatchIds(Arrays.asList(ids));

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
            List<LaoshikaoqinEntity> laoshikaoqinList = new ArrayList<>();//上传的东西
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
                            LaoshikaoqinEntity laoshikaoqinEntity = new LaoshikaoqinEntity();
//                            laoshikaoqinEntity.setLaoshiId(Integer.valueOf(data.get(0)));   //老师 要改的
//                            laoshikaoqinEntity.setLaoshikaoqinTypes(Integer.valueOf(data.get(0)));   //考勤结果 要改的
//                            laoshikaoqinEntity.setLaoshikaoqinContent("");//详情和图片
//                            laoshikaoqinEntity.setKaoqinTime(sdf.parse(data.get(0)));          //考勤日期 要改的
//                            laoshikaoqinEntity.setInsertTime(date);//时间
//                            laoshikaoqinEntity.setCreateTime(date);//时间
                            laoshikaoqinList.add(laoshikaoqinEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        laoshikaoqinService.insertBatch(laoshikaoqinList);
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

