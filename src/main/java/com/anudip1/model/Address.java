package com.anudip1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="address_id")
    private int id;
	@Column(name="address_city")
    private String city;
	@OneToMany(mappedBy="address")
	private List<Customer> customer;
	public Address(int id, String city, List<Customer> customer) {
		super();
		this.id = id;
		this.city = city;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
