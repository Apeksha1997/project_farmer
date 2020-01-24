package com.lti.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BIDDETAILS")
public class BidDetails {

	@Id
	@GeneratedValue
	@Column(name="bid_Id")
	private int bidId;
	@Column(name="bid_amount")
	private int bidAmount;
	@Column(name="bid_status")
	private String bidStatus;
	
	@ManyToOne
	@JoinColumn(name = "bidder_Id")
	Bidder bidderBid;
	
	@ManyToOne
	@JoinColumn(name = "crop_Id")
	Crop cropBid;

	public int getBidId() {
		return bidId;
	}

	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	public int getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}

	public Bidder getBidderBid() {
		return bidderBid;
	}

	public void setBidderBid(Bidder bidderBid) {
		this.bidderBid = bidderBid;
	}

	public Crop getCropBid() {
		return cropBid;
	}

	public void setCropBid(Crop cropBid) {
		this.cropBid = cropBid;
	}

	@Override
	public String toString() {
		return "Bid [bidId=" + bidId + ", bidAmount=" + bidAmount + ", bidStatus=" + bidStatus + ", bidderBid="
				+ bidderBid + ", cropBid=" + cropBid + "]";
	}
	
	
	
}
