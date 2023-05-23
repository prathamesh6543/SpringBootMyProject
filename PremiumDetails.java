package com.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Build the Restful web service to get all the policy premium details for specific duration
@Entity
@Table(name = "premiumdetails")
public class PremiumDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premiumid;
	private String policyid;
	private String policyholdername;
	private String installmentpreminumamount;
	private String policycommencementdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremiumid() {
		return premiumid;
	}

	public void setPremiumid(String premiumid) {
		this.premiumid = premiumid;
	}

	public String getPolicyid() {
		return policyid;
	}

	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

	public String getPolicyholdername() {
		return policyholdername;
	}

	public void setPolicyholdername(String policyholdername) {
		this.policyholdername = policyholdername;
	}

	public String getInstallmentpreminumamount() {
		return installmentpreminumamount;
	}

	public void setInstallmentpreminumamount(String installmentpreminumamount) {
		this.installmentpreminumamount = installmentpreminumamount;
	}

	public String getPolicycommencementdate() {
		return policycommencementdate;
	}

	public void setPolicycommencementdate(String policycommencementdate) {
		this.policycommencementdate = policycommencementdate;
	}

}
