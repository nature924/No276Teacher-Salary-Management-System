package com.entity.model;

import com.entity.LaoshiqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshiqingjiaModel implements Serializable {
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
     * 请假缘由
     */
    private String laoshiqingjiaText;


    /**
     * 请假类型
     */
    private Integer laoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date laoshiqingjiaTime;


    /**
     * 请假天数
     */
    private Integer laoshiqingjiaNumber;


    /**
     * 申请状态
     */
    private Integer laoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    private String laoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date laoshiqingjiaShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：请假缘由
	 */
    public String getLaoshiqingjiaText() {
        return laoshiqingjiaText;
    }


    /**
	 * 设置：请假缘由
	 */
    public void setLaoshiqingjiaText(String laoshiqingjiaText) {
        this.laoshiqingjiaText = laoshiqingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getLaoshiqingjiaTypes() {
        return laoshiqingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setLaoshiqingjiaTypes(Integer laoshiqingjiaTypes) {
        this.laoshiqingjiaTypes = laoshiqingjiaTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getLaoshiqingjiaTime() {
        return laoshiqingjiaTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setLaoshiqingjiaTime(Date laoshiqingjiaTime) {
        this.laoshiqingjiaTime = laoshiqingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getLaoshiqingjiaNumber() {
        return laoshiqingjiaNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setLaoshiqingjiaNumber(Integer laoshiqingjiaNumber) {
        this.laoshiqingjiaNumber = laoshiqingjiaNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getLaoshiqingjiaYesnoTypes() {
        return laoshiqingjiaYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setLaoshiqingjiaYesnoTypes(Integer laoshiqingjiaYesnoTypes) {
        this.laoshiqingjiaYesnoTypes = laoshiqingjiaYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getLaoshiqingjiaYesnoText() {
        return laoshiqingjiaYesnoText;
    }


    /**
	 * 设置：处理意见
	 */
    public void setLaoshiqingjiaYesnoText(String laoshiqingjiaYesnoText) {
        this.laoshiqingjiaYesnoText = laoshiqingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLaoshiqingjiaShenheTime() {
        return laoshiqingjiaShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setLaoshiqingjiaShenheTime(Date laoshiqingjiaShenheTime) {
        this.laoshiqingjiaShenheTime = laoshiqingjiaShenheTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
