package com.dao;

import com.entity.LaoshikaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LaoshikaoqinView;

/**
 * 老师考勤 Dao 接口
 *
 * @author 
 */
public interface LaoshikaoqinDao extends BaseMapper<LaoshikaoqinEntity> {

   List<LaoshikaoqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
