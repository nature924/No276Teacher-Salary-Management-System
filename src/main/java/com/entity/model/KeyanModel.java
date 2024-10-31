package com.entity.model;

import com.entity.KeyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 科研
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KeyanModel implements Serializable {
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
     * 科研编号
     */
    private String keyanUuidNumber;


    /**
     * 科研名称
     */
    private String keyanName;


    /**
     * 科研地点
     */
    private String keyanAddress;


    /**
     * 科研类型
     */
    private Integer keyanTypes;


    /**
     * 科研内容
     */
    private String keyanContent;


    /**
     * 科研开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date keyanKaishiTime;


    /**
     * 科研结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date keyanJieshuTime;


    /**
     * 成果附件
     */
    private String keyanChengguoFile;


    /**
     * 科研成果
     */
    private String keyanChengguoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：科研编号
	 */
    public String getKeyanUuidNumber() {
        return keyanUuidNumber;
    }


    /**
	 * 设置：科研编号
	 */
    public void setKeyanUuidNumber(String keyanUuidNumber) {
        this.keyanUuidNumber = keyanUuidNumber;
    }
    /**
	 * 获取：科研名称
	 */
    public String getKeyanName() {
        return keyanName;
    }


    /**
	 * 设置：科研名称
	 */
    public void setKeyanName(String keyanName) {
        this.keyanName = keyanName;
    }
    /**
	 * 获取：科研地点
	 */
    public String getKeyanAddress() {
        return keyanAddress;
    }


    /**
	 * 设置：科研地点
	 */
    public void setKeyanAddress(String keyanAddress) {
        this.keyanAddress = keyanAddress;
    }
    /**
	 * 获取：科研类型
	 */
    public Integer getKeyanTypes() {
        return keyanTypes;
    }


    /**
	 * 设置：科研类型
	 */
    public void setKeyanTypes(Integer keyanTypes) {
        this.keyanTypes = keyanTypes;
    }
    /**
	 * 获取：科研内容
	 */
    public String getKeyanContent() {
        return keyanContent;
    }


    /**
	 * 设置：科研内容
	 */
    public void setKeyanContent(String keyanContent) {
        this.keyanContent = keyanContent;
    }
    /**
	 * 获取：科研开始时间
	 */
    public Date getKeyanKaishiTime() {
        return keyanKaishiTime;
    }


    /**
	 * 设置：科研开始时间
	 */
    public void setKeyanKaishiTime(Date keyanKaishiTime) {
        this.keyanKaishiTime = keyanKaishiTime;
    }
    /**
	 * 获取：科研结束时间
	 */
    public Date getKeyanJieshuTime() {
        return keyanJieshuTime;
    }


    /**
	 * 设置：科研结束时间
	 */
    public void setKeyanJieshuTime(Date keyanJieshuTime) {
        this.keyanJieshuTime = keyanJieshuTime;
    }
    /**
	 * 获取：成果附件
	 */
    public String getKeyanChengguoFile() {
        return keyanChengguoFile;
    }


    /**
	 * 设置：成果附件
	 */
    public void setKeyanChengguoFile(String keyanChengguoFile) {
        this.keyanChengguoFile = keyanChengguoFile;
    }
    /**
	 * 获取：科研成果
	 */
    public String getKeyanChengguoContent() {
        return keyanChengguoContent;
    }


    /**
	 * 设置：科研成果
	 */
    public void setKeyanChengguoContent(String keyanChengguoContent) {
        this.keyanChengguoContent = keyanChengguoContent;
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
