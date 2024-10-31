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
 * 老师考勤
 *
 * @author 
 * @email
 */
@TableName("laoshikaoqin")
public class LaoshikaoqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaoshikaoqinEntity() {

	}

	public LaoshikaoqinEntity(T t) {
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
     * 考勤结果
     */
    @ColumnInfo(comment="考勤结果",type="int(11)")
    @TableField(value = "laoshikaoqin_types")

    private Integer laoshikaoqinTypes;


    /**
     * 考勤备注
     */
    @ColumnInfo(comment="考勤备注",type="longtext")
    @TableField(value = "laoshikaoqin_content")

    private String laoshikaoqinContent;


    /**
     * 考勤日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="考勤日期",type="date")
    @TableField(value = "kaoqin_time")

    private Date kaoqinTime;


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

    @Override
    public String toString() {
        return "Laoshikaoqin{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", laoshikaoqinTypes=" + laoshikaoqinTypes +
            ", laoshikaoqinContent=" + laoshikaoqinContent +
            ", kaoqinTime=" + DateUtil.convertString(kaoqinTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
