package com.nitere.cloud.commons.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class DomainImpl implements Serializable{

	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime = new Date();

	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime = new Date();
	
	@Column(name = "remark", length = 500, nullable = true)
	private String remark;

	@Column(name = "create_by", nullable = true)
	private String creator;

	@Column(name = "update_by", nullable = true)
	private String updator;

	/** 首次插入前自動設置時間 */
	@PrePersist
	protected void onCreate() {
		Date now = new Date();
		this.createTime = now;
		this.updateTime = now;
	}

	/** 更新前自動更新修改時間 */
	@PreUpdate
	protected void onUpdate() {
		this.updateTime = new Date();
	}

}