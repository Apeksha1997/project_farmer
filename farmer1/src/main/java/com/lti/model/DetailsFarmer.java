package com.lti.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETAILSFARMER")
public class DetailsFarmer {

	@Id
	@GeneratedValue
	@Column(name="farmer_details_id")
	private int farmerDetailsId;
	@Column(name="farmer_address_line1")
	private String farmerAddressLine1;
	@Column(name="farmer_address_line2")
	private String farmerAddressLine2;
	@Column(name="farmer_city")
	private String farmerCity;
	@Column(name="farmer_state")
	private String farmerState;
	@Column(name="farmer_pincode")
	private int farmerPinCode;
	@Column(name="farmer_land_area")
	private int farmerLandArea;
	@Column(name="farmer_land_address")
	private String farmerLandAddress;
	@Column(name="farmer_land_pincode")
	private int farmerLandPinCode;
	@Column(name="farmer_account_no")
	private int farmerAccountNo;
	@Column(name="farmer_ifsc_code")
	private String farmerIFSCCode;
	@Column(name="farmer_aadhaar")
	private String farmerAadhaar;
	@Column(name="farmer_pan")
	private String farmerPan;
	private String farmerCertificate;
	
	@ManyToOne
	@JoinColumn(name = "farmer_Id")
	Farmer farmerDetails;

	public int getFarmerDetailsId() {
		return farmerDetailsId;
	}

	public void setFarmerDetailsId(int farmerDetailsId) {
		this.farmerDetailsId = farmerDetailsId;
	}

	public String getFarmerAddressLine1() {
		return farmerAddressLine1;
	}

	public void setFarmerAddressLine1(String farmerAddressLine1) {
		this.farmerAddressLine1 = farmerAddressLine1;
	}

	public String getFarmerAddressLine2() {
		return farmerAddressLine2;
	}

	public void setFarmerAddressLine2(String farmerAddressLine2) {
		this.farmerAddressLine2 = farmerAddressLine2;
	}

	public String getFarmerCity() {
		return farmerCity;
	}

	public void setFarmerCity(String farmerCity) {
		this.farmerCity = farmerCity;
	}

	public String getFarmerState() {
		return farmerState;
	}

	public void setFarmerState(String farmerState) {
		this.farmerState = farmerState;
	}

	public int getFarmerPinCode() {
		return farmerPinCode;
	}

	public void setFarmerPinCode(int farmerPinCode) {
		this.farmerPinCode = farmerPinCode;
	}

	public int getFarmerLandArea() {
		return farmerLandArea;
	}

	public void setFarmerLandArea(int farmerLandArea) {
		this.farmerLandArea = farmerLandArea;
	}

	public String getFarmerLandAddress() {
		return farmerLandAddress;
	}

	public void setFarmerLandAddress(String farmerLandAddress) {
		this.farmerLandAddress = farmerLandAddress;
	}

	public int getFarmerLandPinCode() {
		return farmerLandPinCode;
	}

	public void setFarmerLandPinCode(int farmerLandPinCode) {
		this.farmerLandPinCode = farmerLandPinCode;
	}

	public int getFarmerAccountNo() {
		return farmerAccountNo;
	}

	public void setFarmerAccountNo(int farmerAccountNo) {
		this.farmerAccountNo = farmerAccountNo;
	}

	public String getFarmerIFSCCode() {
		return farmerIFSCCode;
	}

	public void setFarmerIFSCCode(String farmerIFSCCode) {
		this.farmerIFSCCode = farmerIFSCCode;
	}

	public String getFarmerAadhaar() {
		return farmerAadhaar;
	}

	public void setFarmerAadhaar(String farmerAadhaar) {
		this.farmerAadhaar = farmerAadhaar;
	}

	public String getFarmerPan() {
		return farmerPan;
	}

	public void setFarmerPan(String farmerPan) {
		this.farmerPan = farmerPan;
	}

	public String getFarmerCertificate() {
		return farmerCertificate;
	}

	public void setFarmerCertificate(String farmerCertificate) {
		this.farmerCertificate = farmerCertificate;
	}

	public Farmer getFarmerDetails() {
		return farmerDetails;
	}

	public void setFarmerDetails(Farmer farmerDetails) {
		this.farmerDetails = farmerDetails;
	}

	@Override
	public String toString() {
		return "DetailsFarmer [farmerDetailsId=" + farmerDetailsId + ", farmerAddressLine1=" + farmerAddressLine1
				+ ", farmerAddressLine2=" + farmerAddressLine2 + ", farmerCity=" + farmerCity + ", farmerState="
				+ farmerState + ", farmerPinCode=" + farmerPinCode + ", farmerLandArea=" + farmerLandArea
				+ ", farmerLandAddress=" + farmerLandAddress + ", farmerLandPinCode=" + farmerLandPinCode
				+ ", farmerAccountNo=" + farmerAccountNo + ", farmerIFSCCode=" + farmerIFSCCode + ", farmerAadhaar="
				+ farmerAadhaar + ", farmerPan=" + farmerPan + ", farmerCertificate=" + farmerCertificate
				+ ", farmerDetails=" + farmerDetails + "]";
	}
	
	
	
}
