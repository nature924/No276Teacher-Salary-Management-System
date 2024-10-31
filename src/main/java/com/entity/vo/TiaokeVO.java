package com.entity.vo;

import com.entity.TiaokeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 调课申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tiaoke")
public class TiaokeVO implements Serializable {
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
     * 调课申请编号
     */

    @TableField(value = "tiaoke_uuid_number")
    private String tiaokeUuidNumber;


    /**
     * 申请标题
     */

    @TableField(value = "tiaoke_name")
    private String tiaokeName;


    /**
     * 调课申请类型
     */

    @TableField(value = "tiaoke_types")
    private Integer tiaokeTypes;


    /**
     * 原上课时间
     */

    @TableField(value = "tiaoke_yuan")
    private String tiaokeYuan;


    /**
     * 申请调整时间
     */

    @TableField(value = "tiaoke_xian")
    private String tiaokeXian;


    /**
     * 申请缘由
     */

    @TableField(value = "tiaoke_content")
    private String tiaokeContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "tiaoke_yesno_types")
    private Integer tiaokeYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "tiaoke_yesno_text")
    private String tiaokeYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "tiaoke_shenhe_time")
    private Date tiaokeShenheTime;


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
	 * 设置：调课申请编号
	 */
    public String getTiaokeUuidNumber() {
        return tiaokeUuidNumber;
    }


    /**
	 * 获取：调课申请编号
	 */

    public void setTiaokeUuidNumber(String tiaokeUuidNumber) {
        this.tiaokeUuidNumber = tiaokeUuidNumber;
    }
    /**
	 * 设置：申请标题
	 */
    public String getTiaokeName() {
        return tiaokeName;
    }


    /**
	 * 获取：申请标题
	 */

    public void setTiaokeName(String tiaokeName) {
        this.tiaokeName = tiaokeName;
    }
    /**
	 * 设置：调课申请类型
	 */
    public Integer getTiaokeTypes() {
        return tiaokeTypes;
    }


    /**
	 * 获取：调课申请类型
	 */

    public void setTiaokeTypes(Integer tiaokeTypes) {
        this.tiaokeTypes = tiaokeTypes;
    }
    /**
	 * 设置：原上课时间
	 */
    public String getTiaokeYuan() {
        return tiaokeYuan;
    }


    /**
	 * 获取：原上课时间
	 */

    public void setTiaokeYuan(String tiaokeYuan) {
        this.tiaokeYuan = tiaokeYuan;
    }
    /**
	 * 设置：申请调整时间
	 */
    public String getTiaokeXian() {
        return tiaokeXian;
    }


    /**
	 * 获取：申请调整时间
	 */

    public void setTiaokeXian(String tiaokeXian) {
        this.tiaokeXian = tiaokeXian;
    }
    /**
	 * 设置：申请缘由
	 */
    public String getTiaokeContent() {
        return tiaokeContent;
    }


    /**
	 * 获取：申请缘由
	 */

    public void setTiaokeContent(String tiaokeContent) {
        this.tiaokeContent = tiaokeContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getTiaokeYesnoTypes() {
        return tiaokeYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setTiaokeYesnoTypes(Integer tiaokeYesnoTypes) {
        this.tiaokeYesnoTypes = tiaokeYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getTiaokeYesnoText() {
        return tiaokeYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setTiaokeYesnoText(String tiaokeYesnoText) {
        this.tiaokeYesnoText = tiaokeYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getTiaokeShenheTime() {
        return tiaokeShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setTiaokeShenheTime(Date tiaokeShenheTime) {
        this.tiaokeShenheTime = tiaokeShenheTime;
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
