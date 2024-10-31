package com.entity.vo;

import com.entity.JiaoxuezhiliangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教学质量
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoxuezhiliang")
public class JiaoxuezhiliangVO implements Serializable {
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
     * 教学质量编号
     */

    @TableField(value = "jiaoxuezhiliang_uuid_number")
    private String jiaoxuezhiliangUuidNumber;


    /**
     * 考核地点
     */

    @TableField(value = "jiaoxuezhiliang_address")
    private String jiaoxuezhiliangAddress;


    /**
     * 考核附件
     */

    @TableField(value = "jiaoxuezhiliang_file")
    private String jiaoxuezhiliangFile;


    /**
     * 考核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiaoxuezhiliang_time")
    private Date jiaoxuezhiliangTime;


    /**
     * 考核结果
     */

    @TableField(value = "jiaoxuezhiliang_types")
    private Integer jiaoxuezhiliangTypes;


    /**
     * 考核内容
     */

    @TableField(value = "jiaoxuezhiliang_content")
    private String jiaoxuezhiliangContent;


    /**
     * 考核评语
     */

    @TableField(value = "jiaoxuezhiliang_pingyu_content")
    private String jiaoxuezhiliangPingyuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：教学质量编号
	 */
    public String getJiaoxuezhiliangUuidNumber() {
        return jiaoxuezhiliangUuidNumber;
    }


    /**
	 * 获取：教学质量编号
	 */

    public void setJiaoxuezhiliangUuidNumber(String jiaoxuezhiliangUuidNumber) {
        this.jiaoxuezhiliangUuidNumber = jiaoxuezhiliangUuidNumber;
    }
    /**
	 * 设置：考核地点
	 */
    public String getJiaoxuezhiliangAddress() {
        return jiaoxuezhiliangAddress;
    }


    /**
	 * 获取：考核地点
	 */

    public void setJiaoxuezhiliangAddress(String jiaoxuezhiliangAddress) {
        this.jiaoxuezhiliangAddress = jiaoxuezhiliangAddress;
    }
    /**
	 * 设置：考核附件
	 */
    public String getJiaoxuezhiliangFile() {
        return jiaoxuezhiliangFile;
    }


    /**
	 * 获取：考核附件
	 */

    public void setJiaoxuezhiliangFile(String jiaoxuezhiliangFile) {
        this.jiaoxuezhiliangFile = jiaoxuezhiliangFile;
    }
    /**
	 * 设置：考核时间
	 */
    public Date getJiaoxuezhiliangTime() {
        return jiaoxuezhiliangTime;
    }


    /**
	 * 获取：考核时间
	 */

    public void setJiaoxuezhiliangTime(Date jiaoxuezhiliangTime) {
        this.jiaoxuezhiliangTime = jiaoxuezhiliangTime;
    }
    /**
	 * 设置：考核结果
	 */
    public Integer getJiaoxuezhiliangTypes() {
        return jiaoxuezhiliangTypes;
    }


    /**
	 * 获取：考核结果
	 */

    public void setJiaoxuezhiliangTypes(Integer jiaoxuezhiliangTypes) {
        this.jiaoxuezhiliangTypes = jiaoxuezhiliangTypes;
    }
    /**
	 * 设置：考核内容
	 */
    public String getJiaoxuezhiliangContent() {
        return jiaoxuezhiliangContent;
    }


    /**
	 * 获取：考核内容
	 */

    public void setJiaoxuezhiliangContent(String jiaoxuezhiliangContent) {
        this.jiaoxuezhiliangContent = jiaoxuezhiliangContent;
    }
    /**
	 * 设置：考核评语
	 */
    public String getJiaoxuezhiliangPingyuContent() {
        return jiaoxuezhiliangPingyuContent;
    }


    /**
	 * 获取：考核评语
	 */

    public void setJiaoxuezhiliangPingyuContent(String jiaoxuezhiliangPingyuContent) {
        this.jiaoxuezhiliangPingyuContent = jiaoxuezhiliangPingyuContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
