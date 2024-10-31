package com.dao;

import com.entity.KeyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanView;

/**
 * 科研 Dao 接口
 *
 * @author 
 */
public interface KeyanDao extends BaseMapper<KeyanEntity> {

   List<KeyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
