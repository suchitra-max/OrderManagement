package com.example.OrderServiceNew.Dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;
@Repository
@Entity
public class OrderEntity {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	@Column
	String name;
	@Column
	String date1;
	@Column
	String addr;
	
	public OrderEntity() {
		//super();
	}
	public OrderEntity(Long id, String name, String date1, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.date1 = date1;
		this.addr = addr;
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
	public String getDate() {
		return date1;
	}
	public void setDate(String date) {
		this.date1 = date;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}


}
