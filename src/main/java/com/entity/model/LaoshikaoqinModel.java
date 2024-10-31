package com.entity.model;

import com.entity.LaoshikaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师考勤
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshikaoqinModel implements Serializable {
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
     * 考勤结果
     */
    private Integer laoshikaoqinTypes;


    /**
     * 考勤备注
     */
    private String laoshikaoqinContent;


    /**
     * 考勤日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaoqinTime;


    /**
     * 录入时间
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
	 * 获取：考勤结果
	 */
    public Integer getLaoshikaoqinTypes() {
        return laoshikaoqinTypes;
    }


    /**
	 * 设置：考勤结果
	 */
    public void setLaoshikaoqinTypes(Integer laoshikaoqinTypes) {
        this.laoshikaoqinTypes = laoshikaoqinTypes;
    }
    /**
	 * 获取：考勤备注
	 */
    public String getLaoshikaoqinContent() {
        return laoshikaoqinContent;
    }


    /**
	 * 设置：考勤备注
	 */
    public void setLaoshikaoqinContent(String laoshikaoqinContent) {
        this.laoshikaoqinContent = laoshikaoqinContent;
    }
    /**
	 * 获取：考勤日期
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 设置：考勤日期
	 */
    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
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
