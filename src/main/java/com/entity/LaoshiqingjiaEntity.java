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
 * 老师请假
 *
 * @author 
 * @email
 */
@TableName("laoshiqingjia")
public class LaoshiqingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaoshiqingjiaEntity() {

	}

	public LaoshiqingjiaEntity(T t) {
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
    @ColumnInfo(comment="老师",type="int(200)")
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 请假缘由
     */
    @ColumnInfo(comment="请假缘由",type="longtext")
    @TableField(value = "laoshiqingjia_text")

    private String laoshiqingjiaText;


    /**
     * 请假类型
     */
    @ColumnInfo(comment="请假类型",type="int(11)")
    @TableField(value = "laoshiqingjia_types")

    private Integer laoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="请假时间",type="timestamp")
    @TableField(value = "laoshiqingjia_time")

    private Date laoshiqingjiaTime;


    /**
     * 请假天数
     */
    @ColumnInfo(comment="请假天数",type="int(200)")
    @TableField(value = "laoshiqingjia_number")

    private Integer laoshiqingjiaNumber;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "laoshiqingjia_yesno_types")

    private Integer laoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    @ColumnInfo(comment="处理意见",type="longtext")
    @TableField(value = "laoshiqingjia_yesno_text")

    private String laoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "laoshiqingjia_shenhe_time")

    private Date laoshiqingjiaShenheTime;


    /**
     * 创建时间  listShow
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Laoshiqingjia{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", laoshiqingjiaText=" + laoshiqingjiaText +
            ", laoshiqingjiaTypes=" + laoshiqingjiaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", laoshiqingjiaTime=" + DateUtil.convertString(laoshiqingjiaTime,"yyyy-MM-dd") +
            ", laoshiqingjiaNumber=" + laoshiqingjiaNumber +
            ", laoshiqingjiaYesnoTypes=" + laoshiqingjiaYesnoTypes +
            ", laoshiqingjiaYesnoText=" + laoshiqingjiaYesnoText +
            ", laoshiqingjiaShenheTime=" + DateUtil.convertString(laoshiqingjiaShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
