package com.spring.server.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jdk.jfr.Timestamp;

@Entity
@Table(name = "DA_PRODUCT")
public class Product {

	
	@Id
	@Column(name = "PD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "PD_NAME")
	private String name;
	
	@Column(name = "PD_PRICE")
	private Long price;
	
	@Column(name = "PD_NUMBER")
	private Long number;
	
	@Column(name = "PD_LIKE")
	private long likeCount;
	
	@Column(name = "CREATED_BY")
	@CreatedBy
	private Long creator;
	
	@Column(name = "CREATED_DATE")
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	
	
	@Column(name = "LAST_MODIFIED_DATE")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified_date;
	
	@Column(name = "LAST_MODIFIED_BY")
	@LastModifiedBy
	private Long modifitor;
	
	
}
