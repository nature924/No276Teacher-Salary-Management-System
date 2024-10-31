package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 薪资编号
     */
    private String xinziUuidNumber;


    /**
     * 月份
     */
    private String xinziMonth;


    /**
     * 基本工资
     */
    private Double jibenJine;


    /**
     * 奖金
     */
    private Double jiangjinJine;


    /**
     * 绩效
     */
    private Double jixiaoJine;


    /**
     * 补贴
     */
    private Double butieJine;


    /**
     * 应到天数
     */
    private Integer yingdaoNumber;


    /**
     * 实到天数
     */
    private Integer shidaoNumber;


    /**
     * 扣除金额
     */
    private Double kouchuJine;


    /**
     * 实发
     */
    private Double shifaJine;


    /**
     * 备注
     */
    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：薪资编号
	 */
    public String getXinziUuidNumber() {
        return xinziUuidNumber;
    }


    /**
	 * 设置：薪资编号
	 */
    public void setXinziUuidNumber(String xinziUuidNumber) {
        this.xinziUuidNumber = xinziUuidNumber;
    }
    /**
	 * 获取：月份
	 */
    public String getXinziMonth() {
        return xinziMonth;
    }


    /**
	 * 设置：月份
	 */
    public void setXinziMonth(String xinziMonth) {
        this.xinziMonth = xinziMonth;
    }
    /**
	 * 获取：基本工资
	 */
    public Double getJibenJine() {
        return jibenJine;
    }


    /**
	 * 设置：基本工资
	 */
    public void setJibenJine(Double jibenJine) {
        this.jibenJine = jibenJine;
    }
    /**
	 * 获取：奖金
	 */
    public Double getJiangjinJine() {
        return jiangjinJine;
    }


    /**
	 * 设置：奖金
	 */
    public void setJiangjinJine(Double jiangjinJine) {
        this.jiangjinJine = jiangjinJine;
    }
    /**
	 * 获取：绩效
	 */
    public Double getJixiaoJine() {
        return jixiaoJine;
    }


    /**
	 * 设置：绩效
	 */
    public void setJixiaoJine(Double jixiaoJine) {
        this.jixiaoJine = jixiaoJine;
    }
    /**
	 * 获取：补贴
	 */
    public Double getButieJine() {
        return butieJine;
    }


    /**
	 * 设置：补贴
	 */
    public void setButieJine(Double butieJine) {
        this.butieJine = butieJine;
    }
    /**
	 * 获取：应到天数
	 */
    public Integer getYingdaoNumber() {
        return yingdaoNumber;
    }


    /**
	 * 设置：应到天数
	 */
    public void setYingdaoNumber(Integer yingdaoNumber) {
        this.yingdaoNumber = yingdaoNumber;
    }
    /**
	 * 获取：实到天数
	 */
    public Integer getShidaoNumber() {
        return shidaoNumber;
    }


    /**
	 * 设置：实到天数
	 */
    public void setShidaoNumber(Integer shidaoNumber) {
        this.shidaoNumber = shidaoNumber;
    }
    /**
	 * 获取：扣除金额
	 */
    public Double getKouchuJine() {
        return kouchuJine;
    }


    /**
	 * 设置：扣除金额
	 */
    public void setKouchuJine(Double kouchuJine) {
        this.kouchuJine = kouchuJine;
    }
    /**
	 * 获取：实发
	 */
    public Double getShifaJine() {
        return shifaJine;
    }


    /**
	 * 设置：实发
	 */
    public void setShifaJine(Double shifaJine) {
        this.shifaJine = shifaJine;
    }
    /**
	 * 获取：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
