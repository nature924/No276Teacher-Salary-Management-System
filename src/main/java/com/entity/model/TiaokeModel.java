package com.entity.model;

import com.entity.TiaokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 调课申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TiaokeModel implements Serializable {
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
     * 调课申请编号
     */
    private String tiaokeUuidNumber;


    /**
     * 申请标题
     */
    private String tiaokeName;


    /**
     * 调课申请类型
     */
    private Integer tiaokeTypes;


    /**
     * 原上课时间
     */
    private String tiaokeYuan;


    /**
     * 申请调整时间
     */
    private String tiaokeXian;


    /**
     * 申请缘由
     */
    private String tiaokeContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer tiaokeYesnoTypes;


    /**
     * 审核意见
     */
    private String tiaokeYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date tiaokeShenheTime;


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
