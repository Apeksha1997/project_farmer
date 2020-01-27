package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


import com.fasterxml.jackson.annotation.JsonBackReference;
@Component
@Entity
//@SequenceGenerator(name="seq", sequenceName="farmer_seq")
@Table(name = "farmer")
public class Farmer {

	@Id
//	@GeneratedValue
	@Column(name="farmer_Id")
	private int farmerId;
	@Column(name="farmer_Full_Name")
	private String farmerFullName;
	@Column(name="farmer_contact_details")
	private String farmerContact;
	
	//@JsonBackReference
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_Id")
	private Login login;
//	
//	@OneToOne(mappedBy = "farmerDetails",cascade = CascadeType.ALL)
//	private DetailsFarmer detailsFarmer;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerFullName() {
		return farmerFullName;
	}

	public void setFarmerFullName(String farmerFullName) {
		this.farmerFullName = farmerFullName;
	}

	public String getFarmerContact() {
		return farmerContact;
	}

	public void setFarmerContact(String farmerContact) {
		this.farmerContact = farmerContact;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
//
//	public DetailsFarmer getDetailsFarmer() {
//		return detailsFarmer;
//	}
//
//	public void setDetailsFarmer(DetailsFarmer detailsFarmer) {
//		this.detailsFarmer = detailsFarmer;
//	}

	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Farmer(int farmerId, String farmerFullName, String farmerContact, Login login, DetailsFarmer detailsFarmer) {
		super();
		this.farmerId = farmerId;
		this.farmerFullName = farmerFullName;
		this.farmerContact = farmerContact;
		this.login = login;
//		this.detailsFarmer = detailsFarmer;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", farmerFullName=" + farmerFullName + ", farmerContact="
				+ farmerContact + ", login=" + login + ", detailsFarmer=" + "]";
	}
	

}