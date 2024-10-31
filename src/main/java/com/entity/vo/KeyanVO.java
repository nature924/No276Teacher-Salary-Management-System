package com.entity.vo;

import com.entity.KeyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 科研
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("keyan")
public class KeyanVO implements Serializable {
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
     * 科研编号
     */

    @TableField(value = "keyan_uuid_number")
    private String keyanUuidNumber;


    /**
     * 科研名称
     */

    @TableField(value = "keyan_name")
    private String keyanName;


    /**
     * 科研地点
     */

    @TableField(value = "keyan_address")
    private String keyanAddress;


    /**
     * 科研类型
     */

    @TableField(value = "keyan_types")
    private Integer keyanTypes;


    /**
     * 科研内容
     */

    @TableField(value = "keyan_content")
    private String keyanContent;


    /**
     * 科研开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "keyan_kaishi_time")
    private Date keyanKaishiTime;


    /**
     * 科研结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "keyan_jieshu_time")
    private Date keyanJieshuTime;


    /**
     * 成果附件
     */

    @TableField(value = "keyan_chengguo_file")
    private String keyanChengguoFile;


    /**
     * 科研成果
     */

    @TableField(value = "keyan_chengguo_content")
    private String keyanChengguoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：科研编号
	 */
    public String getKeyanUuidNumber() {
        return keyanUuidNumber;
    }


    /**
	 * 获取：科研编号
	 */

    public void setKeyanUuidNumber(String keyanUuidNumber) {
        this.keyanUuidNumber = keyanUuidNumber;
    }
    /**
	 * 设置：科研名称
	 */
    public String getKeyanName() {
        return keyanName;
    }


    /**
	 * 获取：科研名称
	 */

    public void setKeyanName(String keyanName) {
        this.keyanName = keyanName;
    }
    /**
	 * 设置：科研地点
	 */
    public String getKeyanAddress() {
        return keyanAddress;
    }


    /**
	 * 获取：科研地点
	 */

    public void setKeyanAddress(String keyanAddress) {
        this.keyanAddress = keyanAddress;
    }
    /**
	 * 设置：科研类型
	 */
    public Integer getKeyanTypes() {
        return keyanTypes;
    }


    /**
	 * 获取：科研类型
	 */

    public void setKeyanTypes(Integer keyanTypes) {
        this.keyanTypes = keyanTypes;
    }
    /**
	 * 设置：科研内容
	 */
    public String getKeyanContent() {
        return keyanContent;
    }


    /**
	 * 获取：科研内容
	 */

    public void setKeyanContent(String keyanContent) {
        this.keyanContent = keyanContent;
    }
    /**
	 * 设置：科研开始时间
	 */
    public Date getKeyanKaishiTime() {
        return keyanKaishiTime;
    }


    /**
	 * 获取：科研开始时间
	 */

    public void setKeyanKaishiTime(Date keyanKaishiTime) {
        this.keyanKaishiTime = keyanKaishiTime;
    }
    /**
	 * 设置：科研结束时间
	 */
    public Date getKeyanJieshuTime() {
        return keyanJieshuTime;
    }


    /**
	 * 获取：科研结束时间
	 */

    public void setKeyanJieshuTime(Date keyanJieshuTime) {
        this.keyanJieshuTime = keyanJieshuTime;
    }
    /**
	 * 设置：成果附件
	 */
    public String getKeyanChengguoFile() {
        return keyanChengguoFile;
    }


    /**
	 * 获取：成果附件
	 */

    public void setKeyanChengguoFile(String keyanChengguoFile) {
        this.keyanChengguoFile = keyanChengguoFile;
    }
    /**
	 * 设置：科研成果
	 */
    public String getKeyanChengguoContent() {
        return keyanChengguoContent;
    }


    /**
	 * 获取：科研成果
	 */

    public void setKeyanChengguoContent(String keyanChengguoContent) {
        this.keyanChengguoContent = keyanChengguoContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
