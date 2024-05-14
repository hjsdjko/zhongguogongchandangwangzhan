package com.dao;

import com.entity.GuanghuilichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanghuilichengView;

/**
 * 光辉历程 Dao 接口
 *
 * @author 
 */
public interface GuanghuilichengDao extends BaseMapper<GuanghuilichengEntity> {

   List<GuanghuilichengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
