package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 科研
 *
 * @author 
 * @email
 */
@TableName("keyan")
public class KeyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanEntity() {

	}

	public KeyanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 老师
     */
    @ColumnInfo(comment="老师",type="int(11)")
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 科研编号
     */
    @ColumnInfo(comment="科研编号",type="varchar(200)")
    @TableField(value = "keyan_uuid_number")

    private String keyanUuidNumber;


    /**
     * 科研名称
     */
    @ColumnInfo(comment="科研名称",type="varchar(200)")
    @TableField(value = "keyan_name")

    private String keyanName;


    /**
     * 科研地点
     */
    @ColumnInfo(comment="科研地点",type="varchar(200)")
    @TableField(value = "keyan_address")

    private String keyanAddress;


    /**
     * 科研类型
     */
    @ColumnInfo(comment="科研类型",type="int(11)")
    @TableField(value = "keyan_types")

    private Integer keyanTypes;


    /**
     * 科研内容
     */
    @ColumnInfo(comment="科研内容",type="longtext")
    @TableField(value = "keyan_content")

    private String keyanContent;


    /**
     * 科研开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="科研开始时间",type="timestamp")
    @TableField(value = "keyan_kaishi_time")

    private Date keyanKaishiTime;


    /**
     * 科研结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="科研结束时间",type="timestamp")
    @TableField(value = "keyan_jieshu_time")

    private Date keyanJieshuTime;


    /**
     * 成果附件
     */
    @ColumnInfo(comment="成果附件",type="varchar(200)")
    @TableField(value = "keyan_chengguo_file")

    private String keyanChengguoFile;


    /**
     * 科研成果
     */
    @ColumnInfo(comment="科研成果",type="longtext")
    @TableField(value = "keyan_chengguo_content")

    private String keyanChengguoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Keyan{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", keyanUuidNumber=" + keyanUuidNumber +
            ", keyanName=" + keyanName +
            ", keyanAddress=" + keyanAddress +
            ", keyanTypes=" + keyanTypes +
            ", keyanContent=" + keyanContent +
            ", keyanKaishiTime=" + DateUtil.convertString(keyanKaishiTime,"yyyy-MM-dd") +
            ", keyanJieshuTime=" + DateUtil.convertString(keyanJieshuTime,"yyyy-MM-dd") +
            ", keyanChengguoFile=" + keyanChengguoFile +
            ", keyanChengguoContent=" + keyanChengguoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
