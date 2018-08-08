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
 *   @description : Votes 实体类
 *   ---------------------------------
 * 	 @author Lin_huanwen123
 *   @since 2018-08-08
 */
@TableName("t_votes")
public class Votes implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	@TableField("photo_id")
	private Integer photoId;
	@TableField("votes_user_id")
	private Integer votesUserId;
	@TableField("votes_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date votesTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public Integer getVotesUserId() {
		return votesUserId;
	}

	public void setVotesUserId(Integer votesUserId) {
		this.votesUserId = votesUserId;
	}

	public Date getVotesTime() {
		return votesTime;
	}

	public void setVotesTime(Date votesTime) {
		this.votesTime = votesTime;
	}


	@Override
	public String toString() {
		return "Votes{" +
			", id=" + id +
			", photoId=" + photoId +
			", votesUserId=" + votesUserId +
			", votesTime=" + votesTime +
			"}";
	}
}
