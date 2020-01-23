package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

	@Component
	@Entity
	@Table(name="Login")
	public class Login {
		@Column(name="user_id")
		private String userId;
		private String email;
		private String password;
		
		
		@Id
		@GeneratedValue
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
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
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String userId, String email, String password) {
			super();
			this.userId = userId;
			this.email = email;
			this.password = password;
		}
		@Override
		public String toString() {
			return "Login [userId=" + userId + ", email=" + email + ", password=" + password + "]";
		}
		
	}



