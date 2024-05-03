package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongjieView;


/**
 * 中介
 *
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
public interface ZhongjieService extends IService<ZhongjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongjieVO> selectListVO(Wrapper<ZhongjieEntity> wrapper);
   	
   	ZhongjieVO selectVO(@Param("ew") Wrapper<ZhongjieEntity> wrapper);
   	
   	List<ZhongjieView> selectListView(Wrapper<ZhongjieEntity> wrapper);
   	
   	ZhongjieView selectView(@Param("ew") Wrapper<ZhongjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongjieEntity> wrapper);
   	
}

