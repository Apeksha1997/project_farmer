package com.lti.model;



import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "CROP")
public class Crop {

	@Id
	@GeneratedValue
	@Column(name="crop_Id")
	private int cropId;
	@Column(name="crop_type")
	private String cropType;
	@Column(name="crop_name")
	private String cropName;
	@Column(name="crop_fertilizer_type")
	private String cropFertilizerType;
	@Column(name="crop_quantity")
	private int cropQuantity;
	@Column(name="crop_soil_ph_certificate")
	private String cropSoilPHCertificate;
	@Column(name="crop_last_date_for_bid")
	private LocalDate cropLastDateForBid;
	@Column(name="crop_basic_price")
	private int cropBasicPrice;
	@Column(name="crop_sold_price")
	private int cropSoldPrice;
	@Column(name="crop_current_bid")
	private int cropCurrentBid;
	@Column(name="crop_active_status")
	private String cropActiveStatus;
	@Column(name="crop_sold_status")
	private String cropSoldStatus;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "farmer_Id")
	Farmer farmerCrop;
	
	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getCropFertilizerType() {
		return cropFertilizerType;
	}

	public void setCropFertilizerType(String cropFertilizerType) {
		this.cropFertilizerType = cropFertilizerType;
	}

	public int getCropQuantity() {
		return cropQuantity;
	}

	public void setCropQuantity(int cropQuantity) {
		this.cropQuantity = cropQuantity;
	}

	public String getCropSoilPHCertificate() {
		return cropSoilPHCertificate;
	}

	public void setCropSoilPHCertificate(String cropSoilPHCertificate) {
		this.cropSoilPHCertificate = cropSoilPHCertificate;
	}

	public LocalDate getCropLastDateForBid() {
		return cropLastDateForBid;
	}

	public void setCropLastDateForBid(LocalDate cropLastDateForBid) {
		this.cropLastDateForBid = cropLastDateForBid;
	}

	public int getCropBasicPrice() {
		return cropBasicPrice;
	}

	public void setCropBasicPrice(int cropBasicPrice) {
		this.cropBasicPrice = cropBasicPrice;
	}

	public int getCropSoldPrice() {
		return cropSoldPrice;
	}

	public void setCropSoldPrice(int cropSoldPrice) {
		this.cropSoldPrice = cropSoldPrice;
	}

	public int getCropCurrentBid() {
		return cropCurrentBid;
	}

	public void setCropCurrentBid(int cropCurrentBid) {
		this.cropCurrentBid = cropCurrentBid;
	}

	public String getCropActiveStatus() {
		return cropActiveStatus;
	}

	public void setCropActiveStatus(String cropActiveStatus) {
		this.cropActiveStatus = cropActiveStatus;
	}

	public String getCropSoldStatus() {
		return cropSoldStatus;
	}

	public void setCropSoldStatus(String cropSoldStatus) {
		this.cropSoldStatus = cropSoldStatus;
	}

	public Farmer getFarmerCrop() {
		return farmerCrop;
	}

	public void setFarmerCrop(Farmer farmerCrop) {
		this.farmerCrop = farmerCrop;
	}

	@Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", cropType=" + cropType + ", cropName=" + cropName + ", cropFertilizerType="
				+ cropFertilizerType + ", cropQuantity=" + cropQuantity + ", cropSoilPHCertificate="
				+ cropSoilPHCertificate + ", cropLastDateForBid=" + cropLastDateForBid + ", cropBasicPrice="
				+ cropBasicPrice + ", cropSoldPrice=" + cropSoldPrice + ", cropCurrentBid=" + cropCurrentBid
				+ ", cropActiveStatus=" + cropActiveStatus + ", cropSoldStats=" + cropSoldStatus + ", farmerCrop="
				+ farmerCrop + "]";
	}

}

