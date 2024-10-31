package com.dao;

import com.entity.TiaokeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TiaokeView;

/**
 * 调课申请 Dao 接口
 *
 * @author 
 */
public interface TiaokeDao extends BaseMapper<TiaokeEntity> {

   List<TiaokeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
