package com.dao;

import com.entity.FangwuhuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuhuxingVO;
import com.entity.view.FangwuhuxingView;


/**
 * 房屋户型
 * 
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
public interface FangwuhuxingDao extends BaseMapper<FangwuhuxingEntity> {
	
	List<FangwuhuxingVO> selectListVO(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
	
	FangwuhuxingVO selectVO(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
	
	List<FangwuhuxingView> selectListView(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);

	List<FangwuhuxingView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
	
	FangwuhuxingView selectView(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
	
}
