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
 * 教学质量
 *
 * @author 
 * @email
 */
@TableName("jiaoxuezhiliang")
public class JiaoxuezhiliangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoxuezhiliangEntity() {

	}

	public JiaoxuezhiliangEntity(T t) {
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
     * 教学质量编号
     */
    @ColumnInfo(comment="教学质量编号",type="varchar(200)")
    @TableField(value = "jiaoxuezhiliang_uuid_number")

    private String jiaoxuezhiliangUuidNumber;


    /**
     * 考核地点
     */
    @ColumnInfo(comment="考核地点",type="varchar(200)")
    @TableField(value = "jiaoxuezhiliang_address")

    private String jiaoxuezhiliangAddress;


    /**
     * 考核附件
     */
    @ColumnInfo(comment="考核附件",type="varchar(200)")
    @TableField(value = "jiaoxuezhiliang_file")

    private String jiaoxuezhiliangFile;


    /**
     * 考核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="考核时间",type="timestamp")
    @TableField(value = "jiaoxuezhiliang_time")

    private Date jiaoxuezhiliangTime;


    /**
     * 考核结果
     */
    @ColumnInfo(comment="考核结果",type="int(11)")
    @TableField(value = "jiaoxuezhiliang_types")

    private Integer jiaoxuezhiliangTypes;


    /**
     * 考核内容
     */
    @ColumnInfo(comment="考核内容",type="longtext")
    @TableField(value = "jiaoxuezhiliang_content")

    private String jiaoxuezhiliangContent;


    /**
     * 考核评语
     */
    @ColumnInfo(comment="考核评语",type="longtext")
    @TableField(value = "jiaoxuezhiliang_pingyu_content")

    private String jiaoxuezhiliangPingyuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
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
	 * 获取：教学质量编号
	 */
    public String getJiaoxuezhiliangUuidNumber() {
        return jiaoxuezhiliangUuidNumber;
    }
    /**
	 * 设置：教学质量编号
	 */

    public void setJiaoxuezhiliangUuidNumber(String jiaoxuezhiliangUuidNumber) {
        this.jiaoxuezhiliangUuidNumber = jiaoxuezhiliangUuidNumber;
    }
    /**
	 * 获取：考核地点
	 */
    public String getJiaoxuezhiliangAddress() {
        return jiaoxuezhiliangAddress;
    }
    /**
	 * 设置：考核地点
	 */

    public void setJiaoxuezhiliangAddress(String jiaoxuezhiliangAddress) {
        this.jiaoxuezhiliangAddress = jiaoxuezhiliangAddress;
    }
    /**
	 * 获取：考核附件
	 */
    public String getJiaoxuezhiliangFile() {
        return jiaoxuezhiliangFile;
    }
    /**
	 * 设置：考核附件
	 */

    public void setJiaoxuezhiliangFile(String jiaoxuezhiliangFile) {
        this.jiaoxuezhiliangFile = jiaoxuezhiliangFile;
    }
    /**
	 * 获取：考核时间
	 */
    public Date getJiaoxuezhiliangTime() {
        return jiaoxuezhiliangTime;
    }
    /**
	 * 设置：考核时间
	 */

    public void setJiaoxuezhiliangTime(Date jiaoxuezhiliangTime) {
        this.jiaoxuezhiliangTime = jiaoxuezhiliangTime;
    }
    /**
	 * 获取：考核结果
	 */
    public Integer getJiaoxuezhiliangTypes() {
        return jiaoxuezhiliangTypes;
    }
    /**
	 * 设置：考核结果
	 */

    public void setJiaoxuezhiliangTypes(Integer jiaoxuezhiliangTypes) {
        this.jiaoxuezhiliangTypes = jiaoxuezhiliangTypes;
    }
    /**
	 * 获取：考核内容
	 */
    public String getJiaoxuezhiliangContent() {
        return jiaoxuezhiliangContent;
    }
    /**
	 * 设置：考核内容
	 */

    public void setJiaoxuezhiliangContent(String jiaoxuezhiliangContent) {
        this.jiaoxuezhiliangContent = jiaoxuezhiliangContent;
    }
    /**
	 * 获取：考核评语
	 */
    public String getJiaoxuezhiliangPingyuContent() {
        return jiaoxuezhiliangPingyuContent;
    }
    /**
	 * 设置：考核评语
	 */

    public void setJiaoxuezhiliangPingyuContent(String jiaoxuezhiliangPingyuContent) {
        this.jiaoxuezhiliangPingyuContent = jiaoxuezhiliangPingyuContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：上传时间
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
        return "Jiaoxuezhiliang{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", jiaoxuezhiliangUuidNumber=" + jiaoxuezhiliangUuidNumber +
            ", jiaoxuezhiliangAddress=" + jiaoxuezhiliangAddress +
            ", jiaoxuezhiliangFile=" + jiaoxuezhiliangFile +
            ", jiaoxuezhiliangTime=" + DateUtil.convertString(jiaoxuezhiliangTime,"yyyy-MM-dd") +
            ", jiaoxuezhiliangTypes=" + jiaoxuezhiliangTypes +
            ", jiaoxuezhiliangContent=" + jiaoxuezhiliangContent +
            ", jiaoxuezhiliangPingyuContent=" + jiaoxuezhiliangPingyuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
