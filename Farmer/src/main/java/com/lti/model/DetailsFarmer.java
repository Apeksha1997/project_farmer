package com.lti.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Scope;
	import org.springframework.stereotype.Component;

	@Entity
	@Table(name="DetailsFarmer")
	@Component("DetailsFarmer")
	@Scope(scopeName="prototype")
	public class DetailsFarmer{
		@Id
		@GeneratedValue
		private int farmerDetailsId;
		private String farmerAddressLine1;
		private String farmerAddressLine2;
		private String farmerCity;
		private String farmerState;
		private int farmerPincode;
		private String farmerLandArea;
		private String farmerLandAddress;
		private int farmerLandPincode;
		private int farmerAccountNumber;
		private String farmerIfscCode;
		private String farmerAdharCard;
		private String farmerPan;
		private String farmerCertificate;
		
		@Autowired
		@ManyToOne
		@JoinColumn(name = "farmerId")
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
		public int getFarmerPincode() {
			return farmerPincode;
		}
		public void setFarmerPincode(int farmerPincode) {
			this.farmerPincode = farmerPincode;
		}
		public String getFarmerLandArea() {
			return farmerLandArea;
		}
		public void setFarmerLandArea(String farmerLandArea) {
			this.farmerLandArea = farmerLandArea;
		}
		public String getFarmerLandAddress() {
			return farmerLandAddress;
		}
		public void setFarmerLandAddress(String farmerLandAddress) {
			this.farmerLandAddress = farmerLandAddress;
		}
		public int getFarmerLandPincode() {
			return farmerLandPincode;
		}
		public void setFarmerLandPincode(int farmerLandPincode) {
			this.farmerLandPincode = farmerLandPincode;
		}
		public int getFarmerAccountNumber() {
			return farmerAccountNumber;
		}
		public void setFarmerAccountNumber(int farmerAccountNumber) {
			this.farmerAccountNumber = farmerAccountNumber;
		}
		public String getFarmerIfscCode() {
			return farmerIfscCode;
		}
		public void setFarmerIfscCode(String farmerIfscCode) {
			this.farmerIfscCode = farmerIfscCode;
		}
		public String getFarmerAdharCard() {
			return farmerAdharCard;
		}
		public void setFarmerAdharCard(String farmerAdharCard) {
			this.farmerAdharCard = farmerAdharCard;
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
		
		public DetailsFarmer() {
			super();
		
		}
		public DetailsFarmer(int farmerDetailsId, String farmerAddressLine1, String farmerAddressLine2, String farmerCity,
				String farmerState, int farmerPincode, String farmerLandArea, String farmerLandAddress,
				int farmerLandPincode, int farmerAccountNumber, String farmerIfscCode, String farmerAdharCard,
				String farmerPan, String farmerCertificate) {
			super();
			this.farmerDetailsId = farmerDetailsId;
			this.farmerAddressLine1 = farmerAddressLine1;
			this.farmerAddressLine2 = farmerAddressLine2;
			this.farmerCity = farmerCity;
			this.farmerState = farmerState;
			this.farmerPincode = farmerPincode;
			this.farmerLandArea = farmerLandArea;
			this.farmerLandAddress = farmerLandAddress;
			this.farmerLandPincode = farmerLandPincode;
			this.farmerAccountNumber = farmerAccountNumber;
			this.farmerIfscCode = farmerIfscCode;
			this.farmerAdharCard = farmerAdharCard;
			this.farmerPan = farmerPan;
			this.farmerCertificate = farmerCertificate;
		}
		@Override
		public String toString() {
			return "DetailsFarmer [farmerDetailsId=" + farmerDetailsId + ", farmerAddressLine1=" + farmerAddressLine1
					+ ", farmerAddressLine2=" + farmerAddressLine2 + ", farmerCity=" + farmerCity + ", farmerState="
					+ farmerState + ", farmerPincode=" + farmerPincode + ", farmerLandArea=" + farmerLandArea
					+ ", farmerLandAddress=" + farmerLandAddress + ", farmerLandPincode=" + farmerLandPincode
					+ ", farmerAccountNumber=" + farmerAccountNumber + ", farmerIfscCode=" + farmerIfscCode
					+ ", farmerAdharCard=" + farmerAdharCard + ", farmerPan=" + farmerPan + ", farmerCertificate="
					+ farmerCertificate + ", farmerDetails=" + farmerDetails + "]";
		}
		public void setFarmerDetails(Farmer farmer) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}


