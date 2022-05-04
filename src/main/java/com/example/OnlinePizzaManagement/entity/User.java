package com.example.OnlinePizzaManagement.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements java.io.Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User()
	{
		
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/*
	public User(String username, String password, Customer customer) {
		super();
		this.username = username;
		this.password = password;
		this.customer = customer;
	}
	*/


	@Id
	private String username;
	@Column
	private String password;
	//@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="user")
	//@JoinColumn(name="Fk",referencedColumnName="customerId")
	//private Customer customer;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
