package com.entity.vo;

import com.entity.ZaixianqianyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 在线签约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-06 10:07:31
 */
public class ZaixianqianyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源编号
	 */
	
	private String fangyuanbianhao;
		
	/**
	 * 房源类型
	 */
	
	private String fangyuanleixing;
		
	/**
	 * 房屋户型
	 */
	
	private String fangwuhuxing;
		
	/**
	 * 价钱
	 */
	
	private String jiaqian;
		
	/**
	 * 签约内容
	 */
	
	private String qianyueneirong;
		
	/**
	 * 购房时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goufangshijian;
		
	/**
	 * 中介账号
	 */
	
	private String zhongjiezhanghao;
		
	/**
	 * 中介姓名
	 */
	
	private String zhongjiexingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：房源编号
	 */
	 
	public void setFangyuanbianhao(String fangyuanbianhao) {
		this.fangyuanbianhao = fangyuanbianhao;
	}
	
	/**
	 * 获取：房源编号
	 */
	public String getFangyuanbianhao() {
		return fangyuanbianhao;
	}
				
	
	/**
	 * 设置：房源类型
	 */
	 
	public void setFangyuanleixing(String fangyuanleixing) {
		this.fangyuanleixing = fangyuanleixing;
	}
	
	/**
	 * 获取：房源类型
	 */
	public String getFangyuanleixing() {
		return fangyuanleixing;
	}
				
	
	/**
	 * 设置：房屋户型
	 */
	 
	public void setFangwuhuxing(String fangwuhuxing) {
		this.fangwuhuxing = fangwuhuxing;
	}
	
	/**
	 * 获取：房屋户型
	 */
	public String getFangwuhuxing() {
		return fangwuhuxing;
	}
				
	
	/**
	 * 设置：价钱
	 */
	 
	public void setJiaqian(String jiaqian) {
		this.jiaqian = jiaqian;
	}
	
	/**
	 * 获取：价钱
	 */
	public String getJiaqian() {
		return jiaqian;
	}
				
	
	/**
	 * 设置：签约内容
	 */
	 
	public void setQianyueneirong(String qianyueneirong) {
		this.qianyueneirong = qianyueneirong;
	}
	
	/**
	 * 获取：签约内容
	 */
	public String getQianyueneirong() {
		return qianyueneirong;
	}
				
	
	/**
	 * 设置：购房时间
	 */
	 
	public void setGoufangshijian(Date goufangshijian) {
		this.goufangshijian = goufangshijian;
	}
	
	/**
	 * 获取：购房时间
	 */
	public Date getGoufangshijian() {
		return goufangshijian;
	}
				
	
	/**
	 * 设置：中介账号
	 */
	 
	public void setZhongjiezhanghao(String zhongjiezhanghao) {
		this.zhongjiezhanghao = zhongjiezhanghao;
	}
	
	/**
	 * 获取：中介账号
	 */
	public String getZhongjiezhanghao() {
		return zhongjiezhanghao;
	}
				
	
	/**
	 * 设置：中介姓名
	 */
	 
	public void setZhongjiexingming(String zhongjiexingming) {
		this.zhongjiexingming = zhongjiexingming;
	}
	
	/**
	 * 获取：中介姓名
	 */
	public String getZhongjiexingming() {
		return zhongjiexingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
