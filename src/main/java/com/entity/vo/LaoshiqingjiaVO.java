package com.entity.vo;

import com.entity.LaoshiqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师请假
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("laoshiqingjia")
public class LaoshiqingjiaVO implements Serializable {
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
     * 请假缘由
     */

    @TableField(value = "laoshiqingjia_text")
    private String laoshiqingjiaText;


    /**
     * 请假类型
     */

    @TableField(value = "laoshiqingjia_types")
    private Integer laoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "laoshiqingjia_time")
    private Date laoshiqingjiaTime;


    /**
     * 请假天数
     */

    @TableField(value = "laoshiqingjia_number")
    private Integer laoshiqingjiaNumber;


    /**
     * 申请状态
     */

    @TableField(value = "laoshiqingjia_yesno_types")
    private Integer laoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */

    @TableField(value = "laoshiqingjia_yesno_text")
    private String laoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "laoshiqingjia_shenhe_time")
    private Date laoshiqingjiaShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：请假缘由
	 */
    public String getLaoshiqingjiaText() {
        return laoshiqingjiaText;
    }


    /**
	 * 获取：请假缘由
	 */

    public void setLaoshiqingjiaText(String laoshiqingjiaText) {
        this.laoshiqingjiaText = laoshiqingjiaText;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getLaoshiqingjiaTypes() {
        return laoshiqingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setLaoshiqingjiaTypes(Integer laoshiqingjiaTypes) {
        this.laoshiqingjiaTypes = laoshiqingjiaTypes;
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
	 * 设置：请假时间
	 */
    public Date getLaoshiqingjiaTime() {
        return laoshiqingjiaTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setLaoshiqingjiaTime(Date laoshiqingjiaTime) {
        this.laoshiqingjiaTime = laoshiqingjiaTime;
    }
    /**
	 * 设置：请假天数
	 */
    public Integer getLaoshiqingjiaNumber() {
        return laoshiqingjiaNumber;
    }


    /**
	 * 获取：请假天数
	 */

    public void setLaoshiqingjiaNumber(Integer laoshiqingjiaNumber) {
        this.laoshiqingjiaNumber = laoshiqingjiaNumber;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getLaoshiqingjiaYesnoTypes() {
        return laoshiqingjiaYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setLaoshiqingjiaYesnoTypes(Integer laoshiqingjiaYesnoTypes) {
        this.laoshiqingjiaYesnoTypes = laoshiqingjiaYesnoTypes;
    }
    /**
	 * 设置：处理意见
	 */
    public String getLaoshiqingjiaYesnoText() {
        return laoshiqingjiaYesnoText;
    }


    /**
	 * 获取：处理意见
	 */

    public void setLaoshiqingjiaYesnoText(String laoshiqingjiaYesnoText) {
        this.laoshiqingjiaYesnoText = laoshiqingjiaYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getLaoshiqingjiaShenheTime() {
        return laoshiqingjiaShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setLaoshiqingjiaShenheTime(Date laoshiqingjiaShenheTime) {
        this.laoshiqingjiaShenheTime = laoshiqingjiaShenheTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
