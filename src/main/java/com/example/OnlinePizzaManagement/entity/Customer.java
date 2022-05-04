package com.example.OnlinePizzaManagement.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;

//import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;




@Entity
@Table(name="pizza_customer")
public class Customer 
{   
	
	public Customer()
	{
		
	}
	
	public Customer(Integer customerId, String customerName, Long customerMobile, String customerEmail,String customerAddress, String userName, String Password) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.userName = userName;
		this.Password = Password;
	}
	
	
	public Customer(String customerName, Long customerMobile, String customerEmail, String customerAddress,String userName, String Password) 
	{
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.userName = userName;
		this.Password = Password;
	}
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerId;
	@Column
	private String customerName;
	@Column
	//@Min(value=1,message="Please enter 10 digits")
	private Long customerMobile;
	@Column
	private String customerEmail;
	@Column
	private String customerAddress;

	@Column(unique=true)
	@NotEmpty(message="Username is required")
	private String userName;
	@Column(unique=true)
	@NotEmpty(message="Password is required")
	private String Password;
	
	
	// @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    // @JoinColumn(name="un_fk", referencedColumnName="username")
   // private User user;
	
	
	public Integer getCustomerId() 
	{
		return customerId;
	}

	public void setCustomerId(Integer customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public Long getCustomerMobile()
	{
		return customerMobile;
	}

	public void setCustomerMobile(Long customerMobile) 
	{
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() 
	{
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress()
	{
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress = customerAddress;
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return Password;
	}

	public void setPassword(String Password) 
	{
		this.Password = Password;
	}
/*
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	*/
	
    
	
}
