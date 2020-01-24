package com.lti.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "login")
public class Login {
	@Id
	@GeneratedValue
	@Column(name="user_Id")
	private int userId;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="login")
	private List<Farmer> farmers;
	
	public List<Farmer> getFarmers() {
		return farmers;
	}
	public void setFarmers(List<Farmer> farmers) {
		this.farmers = farmers;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(int userId, String email, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
	}
	public Login(int userId, String email, String password, List<Farmer> farmers) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.farmers = farmers;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", email=" + email + ", password=" + password + "]";
	}
	
	
}

