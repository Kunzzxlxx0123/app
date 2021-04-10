package com.spring.server.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "DA_PRODUCT_CATEGORY",
			joinColumns = {@JoinColumn(name="PRODUCT_ID")},
			inverseJoinColumns = {@JoinColumn(name="CATEGORY_ID")})
	private Set<Category> categories = new HashSet<Category>();

	public Product(String name, Long price, Long number, long likeCount, Long creator, Date created_date,
			Date modified_date, Long modifitor, Set<Category> categories) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.likeCount = likeCount;
		this.creator = creator;
		this.created_date = created_date;
		this.modified_date = modified_date;
		this.modifitor = modifitor;
		this.categories = categories;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public Long getModifitor() {
		return modifitor;
	}

	public void setModifitor(Long modifitor) {
		this.modifitor = modifitor;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
}
