package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="sku")
	private String sku;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String Description;
	@Column(name="unitprice")
	private float unitPrice;
	@Column(name="active")
	private char active;
	@Column(name="unitsinstock")
	private int unitsInStock;
	@Column(name="datecreated")
	private Date dateCreated ;
	@Column(name="lastupdated")
	private Date lastUpdated;
	@Column(name="categoryid")
	private int categoryId;
	
	public Product() {
		
	}
	
	public Product(Integer id, String sku, String name, String description, float unitPrice, char active,
			int unitsInStock, Date dateCreated, Date lastUpdated, int categoryId) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.Description = description;
		this.unitPrice = unitPrice;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryId = categoryId;
	}
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", Description=" + Description + ", unitPrice="
				+ unitPrice + ", active=" + active + ", unitsInStock=" + unitsInStock + ", dateCreated=" + dateCreated
				+ ", lastUpdated=" + lastUpdated + ", categoryId=" + categoryId + "]";
	}
	
}
