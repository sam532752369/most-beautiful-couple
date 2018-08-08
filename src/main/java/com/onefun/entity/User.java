package com.onefun.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import io.swagger.annotations.ApiModelProperty;

/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : User 实体类
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户openid
     */
	@ApiModelProperty("用户openid")
	private String openid;
    /**
     * 用户昵称
     */
	@ApiModelProperty("用户昵称")
	private String nickname;
    /**
     * 用户头像
     */
	@ApiModelProperty("用户头像")
	private String avatarurl;
    /**
     * 用户性别:值为1时是男性，值为2时是女性，值为0时是未知
     */
	@ApiModelProperty("用户性别:值为1时是男性，值为2时是女性，值为0时是未知")
	private Integer gender;
    /**
     * 城市
     */
	@ApiModelProperty("城市")
	private String city;
    /**
     * 省
     */
	@ApiModelProperty("省")
	private String province;
    /**
     * 国家
     */
	@ApiModelProperty("国家")
	private String country;
    /**
     * 红包总金额
     */
	@ApiModelProperty("红包总金额")
	private BigDecimal money;
    /**
     * 未领红包个数
     */
	@ApiModelProperty("未领红包个数")
	@TableField("redpacket_count")
	private Integer redpacketCount;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatarurl() {
		return avatarurl;
	}

	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Integer getRedpacketCount() {
		return redpacketCount;
	}

	public void setRedpacketCount(Integer redpacketCount) {
		this.redpacketCount = redpacketCount;
	}


	@Override
	public String toString() {
		return "User{" +
			", id=" + id +
			", openid=" + openid +
			", nickname=" + nickname +
			", avatarurl=" + avatarurl +
			", gender=" + gender +
			", city=" + city +
			", province=" + province +
			", country=" + country +
			", money=" + money +
			", redpacketCount=" + redpacketCount +
			"}";
	}
}
