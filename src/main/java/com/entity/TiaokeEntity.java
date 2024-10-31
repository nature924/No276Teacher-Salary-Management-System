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
 * 调课申请
 *
 * @author 
 * @email
 */
@TableName("tiaoke")
public class TiaokeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TiaokeEntity() {

	}

	public TiaokeEntity(T t) {
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
     * 调课申请编号
     */
    @ColumnInfo(comment="调课申请编号",type="varchar(200)")
    @TableField(value = "tiaoke_uuid_number")

    private String tiaokeUuidNumber;


    /**
     * 申请标题
     */
    @ColumnInfo(comment="申请标题",type="varchar(200)")
    @TableField(value = "tiaoke_name")

    private String tiaokeName;


    /**
     * 调课申请类型
     */
    @ColumnInfo(comment="调课申请类型",type="int(11)")
    @TableField(value = "tiaoke_types")

    private Integer tiaokeTypes;


    /**
     * 原上课时间
     */
    @ColumnInfo(comment="原上课时间",type="varchar(200)")
    @TableField(value = "tiaoke_yuan")

    private String tiaokeYuan;


    /**
     * 申请调整时间
     */
    @ColumnInfo(comment="申请调整时间",type="varchar(200)")
    @TableField(value = "tiaoke_xian")

    private String tiaokeXian;


    /**
     * 申请缘由
     */
    @ColumnInfo(comment="申请缘由",type="longtext")
    @TableField(value = "tiaoke_content")

    private String tiaokeContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "tiaoke_yesno_types")

    private Integer tiaokeYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="longtext")
    @TableField(value = "tiaoke_yesno_text")

    private String tiaokeYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "tiaoke_shenhe_time")

    private Date tiaokeShenheTime;


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
	 * 获取：调课申请编号
	 */
    public String getTiaokeUuidNumber() {
        return tiaokeUuidNumber;
    }
    /**
	 * 设置：调课申请编号
	 */

    public void setTiaokeUuidNumber(String tiaokeUuidNumber) {
        this.tiaokeUuidNumber = tiaokeUuidNumber;
    }
    /**
	 * 获取：申请标题
	 */
    public String getTiaokeName() {
        return tiaokeName;
    }
    /**
	 * 设置：申请标题
	 */

    public void setTiaokeName(String tiaokeName) {
        this.tiaokeName = tiaokeName;
    }
    /**
	 * 获取：调课申请类型
	 */
    public Integer getTiaokeTypes() {
        return tiaokeTypes;
    }
    /**
	 * 设置：调课申请类型
	 */

    public void setTiaokeTypes(Integer tiaokeTypes) {
        this.tiaokeTypes = tiaokeTypes;
    }
    /**
	 * 获取：原上课时间
	 */
    public String getTiaokeYuan() {
        return tiaokeYuan;
    }
    /**
	 * 设置：原上课时间
	 */

    public void setTiaokeYuan(String tiaokeYuan) {
        this.tiaokeYuan = tiaokeYuan;
    }
    /**
	 * 获取：申请调整时间
	 */
    public String getTiaokeXian() {
        return tiaokeXian;
    }
    /**
	 * 设置：申请调整时间
	 */

    public void setTiaokeXian(String tiaokeXian) {
        this.tiaokeXian = tiaokeXian;
    }
    /**
	 * 获取：申请缘由
	 */
    public String getTiaokeContent() {
        return tiaokeContent;
    }
    /**
	 * 设置：申请缘由
	 */

    public void setTiaokeContent(String tiaokeContent) {
        this.tiaokeContent = tiaokeContent;
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
	 * 获取：申请状态
	 */
    public Integer getTiaokeYesnoTypes() {
        return tiaokeYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setTiaokeYesnoTypes(Integer tiaokeYesnoTypes) {
        this.tiaokeYesnoTypes = tiaokeYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getTiaokeYesnoText() {
        return tiaokeYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setTiaokeYesnoText(String tiaokeYesnoText) {
        this.tiaokeYesnoText = tiaokeYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getTiaokeShenheTime() {
        return tiaokeShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setTiaokeShenheTime(Date tiaokeShenheTime) {
        this.tiaokeShenheTime = tiaokeShenheTime;
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
        return "Tiaoke{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", tiaokeUuidNumber=" + tiaokeUuidNumber +
            ", tiaokeName=" + tiaokeName +
            ", tiaokeTypes=" + tiaokeTypes +
            ", tiaokeYuan=" + tiaokeYuan +
            ", tiaokeXian=" + tiaokeXian +
            ", tiaokeContent=" + tiaokeContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", tiaokeYesnoTypes=" + tiaokeYesnoTypes +
            ", tiaokeYesnoText=" + tiaokeYesnoText +
            ", tiaokeShenheTime=" + DateUtil.convertString(tiaokeShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
