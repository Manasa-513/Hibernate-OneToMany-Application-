package com.anudip1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer 
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="customer_id")
  private int id;
  @Column(name="customer_name")
  private String name;
  @ManyToOne
  @JoinColumn(name="address_id")
  private Address address;
public Customer(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
