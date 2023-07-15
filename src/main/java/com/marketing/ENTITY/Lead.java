package com.marketing.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name = "leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	@Column(name="First_Name",nullable = false,length = 30)
	private String firstname;
	@Column(name="Second_Name",nullable = false,length = 30)
	private String secondname;
	@Column(name="E_mail",nullable = false,unique = false)
	private String email;
	@Column(name="Mobile_Number",nullable = false,unique = false)
	private long mobilenumber;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "Lead [id=" + id + ", firstname=" + firstname + ", secondname=" + secondname + ", email=" + email
				+ ", mobilenumber=" + mobilenumber + "]";
	}
	
	

}
