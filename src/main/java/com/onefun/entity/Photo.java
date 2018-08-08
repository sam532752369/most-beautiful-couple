package com.onefun.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import io.swagger.annotations.ApiModelProperty;

/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : Photo 实体类
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@TableName("t_photo")
public class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 用户id
     */
	@ApiModelProperty("用户id")
	@TableField("user_id")
	private Integer userId;
    /**
     * 图片链接
     */
	@ApiModelProperty("图片链接")
	private String url;
    /**
     * 联系人
     */
	@ApiModelProperty("联系人")
	private String username;
    /**
     * 电话号码
     */
	@ApiModelProperty("电话号码")
	private String phone;
    /**
     * 介绍
     */
	@ApiModelProperty("介绍")
	private String introduction;
    /**
     * 票数
     */
	@ApiModelProperty("票数")
	@TableField("votes_count")
	private Integer votesCount;
    /**
     * 添加时间
     */
	@ApiModelProperty("添加时间")
	@TableField("add_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date addTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getVotesCount() {
		return votesCount;
	}

	public void setVotesCount(Integer votesCount) {
		this.votesCount = votesCount;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}


	@Override
	public String toString() {
		return "Photo{" +
			", id=" + id +
			", userId=" + userId +
			", url=" + url +
			", username=" + username +
			", phone=" + phone +
			", introduction=" + introduction +
			", votesCount=" + votesCount +
			", addTime=" + addTime +
			"}";
	}
}
