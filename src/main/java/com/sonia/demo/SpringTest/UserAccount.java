package com.sonia.demo.SpringTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANKACCOUNT")
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="balance")
	private Double balance;
	
	@Column(name="address")
	private String address;
	
	
	protected UserAccount() {
		
	}
	public UserAccount(Long id, String name,  Double balance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
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
	

	
	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", address=" + address + "]";
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
