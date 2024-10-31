package com.entity.vo;

import com.entity.XinziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 薪资
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinzi")
public class XinziVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 薪资编号
     */

    @TableField(value = "xinzi_uuid_number")
    private String xinziUuidNumber;


    /**
     * 月份
     */

    @TableField(value = "xinzi_month")
    private String xinziMonth;


    /**
     * 基本工资
     */

    @TableField(value = "jiben_jine")
    private Double jibenJine;


    /**
     * 奖金
     */

    @TableField(value = "jiangjin_jine")
    private Double jiangjinJine;


    /**
     * 绩效
     */

    @TableField(value = "jixiao_jine")
    private Double jixiaoJine;


    /**
     * 补贴
     */

    @TableField(value = "butie_jine")
    private Double butieJine;


    /**
     * 应到天数
     */

    @TableField(value = "yingdao_number")
    private Integer yingdaoNumber;


    /**
     * 实到天数
     */

    @TableField(value = "shidao_number")
    private Integer shidaoNumber;


    /**
     * 扣除金额
     */

    @TableField(value = "kouchu_jine")
    private Double kouchuJine;


    /**
     * 实发
     */

    @TableField(value = "shifa_jine")
    private Double shifaJine;


    /**
     * 备注
     */

    @TableField(value = "xinzi_content")
    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：薪资编号
	 */
    public String getXinziUuidNumber() {
        return xinziUuidNumber;
    }


    /**
	 * 获取：薪资编号
	 */

    public void setXinziUuidNumber(String xinziUuidNumber) {
        this.xinziUuidNumber = xinziUuidNumber;
    }
    /**
	 * 设置：月份
	 */
    public String getXinziMonth() {
        return xinziMonth;
    }


    /**
	 * 获取：月份
	 */

    public void setXinziMonth(String xinziMonth) {
        this.xinziMonth = xinziMonth;
    }
    /**
	 * 设置：基本工资
	 */
    public Double getJibenJine() {
        return jibenJine;
    }


    /**
	 * 获取：基本工资
	 */

    public void setJibenJine(Double jibenJine) {
        this.jibenJine = jibenJine;
    }
    /**
	 * 设置：奖金
	 */
    public Double getJiangjinJine() {
        return jiangjinJine;
    }


    /**
	 * 获取：奖金
	 */

    public void setJiangjinJine(Double jiangjinJine) {
        this.jiangjinJine = jiangjinJine;
    }
    /**
	 * 设置：绩效
	 */
    public Double getJixiaoJine() {
        return jixiaoJine;
    }


    /**
	 * 获取：绩效
	 */

    public void setJixiaoJine(Double jixiaoJine) {
        this.jixiaoJine = jixiaoJine;
    }
    /**
	 * 设置：补贴
	 */
    public Double getButieJine() {
        return butieJine;
    }


    /**
	 * 获取：补贴
	 */

    public void setButieJine(Double butieJine) {
        this.butieJine = butieJine;
    }
    /**
	 * 设置：应到天数
	 */
    public Integer getYingdaoNumber() {
        return yingdaoNumber;
    }


    /**
	 * 获取：应到天数
	 */

    public void setYingdaoNumber(Integer yingdaoNumber) {
        this.yingdaoNumber = yingdaoNumber;
    }
    /**
	 * 设置：实到天数
	 */
    public Integer getShidaoNumber() {
        return shidaoNumber;
    }


    /**
	 * 获取：实到天数
	 */

    public void setShidaoNumber(Integer shidaoNumber) {
        this.shidaoNumber = shidaoNumber;
    }
    /**
	 * 设置：扣除金额
	 */
    public Double getKouchuJine() {
        return kouchuJine;
    }


    /**
	 * 获取：扣除金额
	 */

    public void setKouchuJine(Double kouchuJine) {
        this.kouchuJine = kouchuJine;
    }
    /**
	 * 设置：实发
	 */
    public Double getShifaJine() {
        return shifaJine;
    }


    /**
	 * 获取：实发
	 */

    public void setShifaJine(Double shifaJine) {
        this.shifaJine = shifaJine;
    }
    /**
	 * 设置：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
