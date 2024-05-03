package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuhuxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuhuxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuhuxingView;


/**
 * 房屋户型
 *
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
public interface FangwuhuxingService extends IService<FangwuhuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuhuxingVO> selectListVO(Wrapper<FangwuhuxingEntity> wrapper);
   	
   	FangwuhuxingVO selectVO(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
   	
   	List<FangwuhuxingView> selectListView(Wrapper<FangwuhuxingEntity> wrapper);
   	
   	FangwuhuxingView selectView(@Param("ew") Wrapper<FangwuhuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuhuxingEntity> wrapper);
   	
}

