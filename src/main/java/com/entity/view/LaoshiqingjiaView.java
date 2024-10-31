package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LaoshiqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 老师请假
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("laoshiqingjia")
public class LaoshiqingjiaView extends LaoshiqingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 请假类型的值
	*/
	@ColumnInfo(comment="请假类型的字典表值",type="varchar(200)")
	private String laoshiqingjiaValue;
	/**
	* 申请状态的值
	*/
	@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
	private String laoshiqingjiaYesnoValue;

	//级联表 老师
		/**
		* 老师编号
		*/

		@ColumnInfo(comment="老师编号",type="varchar(200)")
		private String laoshiUuidNumber;
		/**
		* 老师姓名
		*/

		@ColumnInfo(comment="老师姓名",type="varchar(200)")
		private String laoshiName;
		/**
		* 老师手机号
		*/

		@ColumnInfo(comment="老师手机号",type="varchar(200)")
		private String laoshiPhone;
		/**
		* 老师身份证号
		*/

		@ColumnInfo(comment="老师身份证号",type="varchar(200)")
		private String laoshiIdNumber;
		/**
		* 老师头像
		*/

		@ColumnInfo(comment="老师头像",type="varchar(200)")
		private String laoshiPhoto;
		/**
		* 老师邮箱
		*/

		@ColumnInfo(comment="老师邮箱",type="varchar(200)")
		private String laoshiEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public LaoshiqingjiaView() {

	}

	public LaoshiqingjiaView(LaoshiqingjiaEntity laoshiqingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, laoshiqingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 请假类型的值
	*/
	public String getLaoshiqingjiaValue() {
		return laoshiqingjiaValue;
	}
	/**
	* 设置： 请假类型的值
	*/
	public void setLaoshiqingjiaValue(String laoshiqingjiaValue) {
		this.laoshiqingjiaValue = laoshiqingjiaValue;
	}
	//当前表的
	/**
	* 获取： 申请状态的值
	*/
	public String getLaoshiqingjiaYesnoValue() {
		return laoshiqingjiaYesnoValue;
	}
	/**
	* 设置： 申请状态的值
	*/
	public void setLaoshiqingjiaYesnoValue(String laoshiqingjiaYesnoValue) {
		this.laoshiqingjiaYesnoValue = laoshiqingjiaYesnoValue;
	}


	//级联表的get和set 老师

		/**
		* 获取： 老师编号
		*/
		public String getLaoshiUuidNumber() {
			return laoshiUuidNumber;
		}
		/**
		* 设置： 老师编号
		*/
		public void setLaoshiUuidNumber(String laoshiUuidNumber) {
			this.laoshiUuidNumber = laoshiUuidNumber;
		}

		/**
		* 获取： 老师姓名
		*/
		public String getLaoshiName() {
			return laoshiName;
		}
		/**
		* 设置： 老师姓名
		*/
		public void setLaoshiName(String laoshiName) {
			this.laoshiName = laoshiName;
		}

		/**
		* 获取： 老师手机号
		*/
		public String getLaoshiPhone() {
			return laoshiPhone;
		}
		/**
		* 设置： 老师手机号
		*/
		public void setLaoshiPhone(String laoshiPhone) {
			this.laoshiPhone = laoshiPhone;
		}

		/**
		* 获取： 老师身份证号
		*/
		public String getLaoshiIdNumber() {
			return laoshiIdNumber;
		}
		/**
		* 设置： 老师身份证号
		*/
		public void setLaoshiIdNumber(String laoshiIdNumber) {
			this.laoshiIdNumber = laoshiIdNumber;
		}

		/**
		* 获取： 老师头像
		*/
		public String getLaoshiPhoto() {
			return laoshiPhoto;
		}
		/**
		* 设置： 老师头像
		*/
		public void setLaoshiPhoto(String laoshiPhoto) {
			this.laoshiPhoto = laoshiPhoto;
		}

		/**
		* 获取： 老师邮箱
		*/
		public String getLaoshiEmail() {
			return laoshiEmail;
		}
		/**
		* 设置： 老师邮箱
		*/
		public void setLaoshiEmail(String laoshiEmail) {
			this.laoshiEmail = laoshiEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "LaoshiqingjiaView{" +
			", laoshiqingjiaValue=" + laoshiqingjiaValue +
			", laoshiqingjiaYesnoValue=" + laoshiqingjiaYesnoValue +
			", laoshiUuidNumber=" + laoshiUuidNumber +
			", laoshiName=" + laoshiName +
			", laoshiPhone=" + laoshiPhone +
			", laoshiIdNumber=" + laoshiIdNumber +
			", laoshiPhoto=" + laoshiPhoto +
			", laoshiEmail=" + laoshiEmail +
			"} " + super.toString();
	}
}
