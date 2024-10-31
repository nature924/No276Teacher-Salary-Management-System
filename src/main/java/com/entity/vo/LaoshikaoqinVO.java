package com.entity.vo;

import com.entity.LaoshikaoqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师考勤
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("laoshikaoqin")
public class LaoshikaoqinVO implements Serializable {
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
     * 考勤结果
     */

    @TableField(value = "laoshikaoqin_types")
    private Integer laoshikaoqinTypes;


    /**
     * 考勤备注
     */

    @TableField(value = "laoshikaoqin_content")
    private String laoshikaoqinContent;


    /**
     * 考勤日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaoqin_time")
    private Date kaoqinTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：考勤结果
	 */
    public Integer getLaoshikaoqinTypes() {
        return laoshikaoqinTypes;
    }


    /**
	 * 获取：考勤结果
	 */

    public void setLaoshikaoqinTypes(Integer laoshikaoqinTypes) {
        this.laoshikaoqinTypes = laoshikaoqinTypes;
    }
    /**
	 * 设置：考勤备注
	 */
    public String getLaoshikaoqinContent() {
        return laoshikaoqinContent;
    }


    /**
	 * 获取：考勤备注
	 */

    public void setLaoshikaoqinContent(String laoshikaoqinContent) {
        this.laoshikaoqinContent = laoshikaoqinContent;
    }
    /**
	 * 设置：考勤日期
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 获取：考勤日期
	 */

    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
