package com.dao;

import com.entity.ZhongjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongjieVO;
import com.entity.view.ZhongjieView;


/**
 * 中介
 * 
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
public interface ZhongjieDao extends BaseMapper<ZhongjieEntity> {
	
	List<ZhongjieVO> selectListVO(@Param("ew") Wrapper<ZhongjieEntity> wrapper);
	
	ZhongjieVO selectVO(@Param("ew") Wrapper<ZhongjieEntity> wrapper);
	
	List<ZhongjieView> selectListView(@Param("ew") Wrapper<ZhongjieEntity> wrapper);

	List<ZhongjieView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongjieEntity> wrapper);
	
	ZhongjieView selectView(@Param("ew") Wrapper<ZhongjieEntity> wrapper);
	
}
