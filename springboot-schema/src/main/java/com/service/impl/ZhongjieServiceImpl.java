package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhongjieDao;
import com.entity.ZhongjieEntity;
import com.service.ZhongjieService;
import com.entity.vo.ZhongjieVO;
import com.entity.view.ZhongjieView;

@Service("zhongjieService")
public class ZhongjieServiceImpl extends ServiceImpl<ZhongjieDao, ZhongjieEntity> implements ZhongjieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongjieEntity> page = this.selectPage(
                new Query<ZhongjieEntity>(params).getPage(),
                new EntityWrapper<ZhongjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongjieEntity> wrapper) {
		  Page<ZhongjieView> page =new Query<ZhongjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongjieVO> selectListVO(Wrapper<ZhongjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongjieVO selectVO(Wrapper<ZhongjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongjieView> selectListView(Wrapper<ZhongjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongjieView selectView(Wrapper<ZhongjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
