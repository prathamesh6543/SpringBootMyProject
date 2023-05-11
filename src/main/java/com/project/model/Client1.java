package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class Client1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String clientid;
	private String Claimid;
	private String Policyid;
	private boolean Claimstatus;
	private String Claimamount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getClaimid() {
		return Claimid;
	}
	public void setClaimid(String claimid) {
		Claimid = claimid;
	}
	public String getPolicyid() {
		return Policyid;
	}
	public void setPolicyid(String policyid) {
		Policyid = policyid;
	}
	public boolean isClaimstatus() {
		return Claimstatus;
	}
	public void setClaimstatus(boolean claimstatus) {
		Claimstatus = claimstatus;
	}
	public String getClaimamount() {
		return Claimamount;
	}
	public void setClaimamount(String claimamount) {
		Claimamount = claimamount;
	}
}
