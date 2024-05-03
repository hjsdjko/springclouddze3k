package com.entity.view;

import com.entity.ZhongjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 中介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
@TableName("zhongjie")
public class ZhongjieView  extends ZhongjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongjieView(){
	}
 
 	public ZhongjieView(ZhongjieEntity zhongjieEntity){
 	try {
			BeanUtils.copyProperties(this, zhongjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
