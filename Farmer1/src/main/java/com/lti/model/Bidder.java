package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "BIDDER")
public class Bidder {

	@Id
	@GeneratedValue
	@Column(name="bidder_Id")
	private int bidderId;
	@Column(name="bidder_full_name")
	private String bidderFullName;
	@Column(name="bidder_contact")
	private String bidderContact;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Login login;
	
	@OneToOne(mappedBy = "bidderDetails",cascade = CascadeType.ALL)
	DetailsBidder detailsBidder;

	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}

	public String getBidderFullName() {
		return bidderFullName;
	}

	public void setBidderFullName(String bidderFullName) {
		this.bidderFullName = bidderFullName;
	}

	public String getBidderContact() {
		return bidderContact;
	}

	public void setBidderContact(String bidderContact) {
		this.bidderContact = bidderContact;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public DetailsBidder getDetailsBidder() {
		return detailsBidder;
	}

	public void setDetailsBidder(DetailsBidder detailsBidder) {
		this.detailsBidder = detailsBidder;
	}

	@Override
	public String toString() {
		return "Bidder [bidderId=" + bidderId + ", bidderFullName=" + bidderFullName + ", bidderContact="
				+ bidderContact + ", login=" + login + ", detailsBidder=" + detailsBidder + "]";
	}	
	
}
