package com.lti.model;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE")
public class Insurance {

	@Id
	@GeneratedValue
	@Column(name="insurance_id")
	private int insuranceId;
	
	@GeneratedValue
	@Column(name="policy_no")
	private int policyNo;
	@Column(name="season")
	private String Season;
	@Column(name="year")
	private LocalDate year;
	@Column(name="crop_name")
	private String cropName;
	@Column(name="sum_insured")
	private int sumInsured;
	@Column(name="area")
	private int area;
	@Column(name="insurance_company")
	private String insuranceCompany;
	@Column(name="name_of_insurance")
	private String nameOfInsuree;
	@Column(name="cause_of_loss")
	private String causeOfLoss;
	@Column(name="date_of_loss")
	private LocalDate dateOfLoss;
	@Column(name="claim_status")
	private String claimStatus;
	
	@ManyToOne
	@JoinColumn(name = "farmer_Id")
	Farmer farmers;

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getSeason() {
		return Season;
	}

	public void setSeason(String season) {
		Season = season;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getNameOfInsuree() {
		return nameOfInsuree;
	}

	public void setNameOfInsuree(String nameOfInsuree) {
		this.nameOfInsuree = nameOfInsuree;
	}

	public String getCauseOfLoss() {
		return causeOfLoss;
	}

	public void setCauseOfLoss(String causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}

	public LocalDate getDateOfLoss() {
		return dateOfLoss;
	}

	public void setDateOfLoss(LocalDate dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public Farmer getFarmers() {
		return farmers;
	}

	public void setFarmers(Farmer farmers) {
		this.farmers = farmers;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", policyNo=" + policyNo + ", Season=" + Season + ", year="
				+ year + ", cropName=" + cropName + ", sumInsured=" + sumInsured + ", area=" + area
				+ ", insuranceCompany=" + insuranceCompany + ", nameOfInsuree=" + nameOfInsuree + ", causeOfLoss="
				+ causeOfLoss + ", dateOfLoss=" + dateOfLoss + ", claimStatus=" + claimStatus + ", farmers=" + farmers
				+ "]";
	}

}
