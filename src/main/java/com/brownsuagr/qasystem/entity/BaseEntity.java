package com.brownsuagr.qasystem.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors
public class BaseEntity implements Serializable{
	private static final long serialVersionUID = -2699340226359222280L;
	private String createdUser;
	private String modifiedUser;
	private Date createdTime;
	private Date modifiedTime;

	
}
