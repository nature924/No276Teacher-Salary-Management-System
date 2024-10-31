package com.entity.model;

import com.entity.JiaoxuezhiliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教学质量
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoxuezhiliangModel implements Serializable {
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
     * 教学质量编号
     */
    private String jiaoxuezhiliangUuidNumber;


    /**
     * 考核地点
     */
    private String jiaoxuezhiliangAddress;


    /**
     * 考核附件
     */
    private String jiaoxuezhiliangFile;


    /**
     * 考核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaoxuezhiliangTime;


    /**
     * 考核结果
     */
    private Integer jiaoxuezhiliangTypes;


    /**
     * 考核内容
     */
    private String jiaoxuezhiliangContent;


    /**
     * 考核评语
     */
    private String jiaoxuezhiliangPingyuContent;


    /**
     * 上传时间
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
