package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ClaimDetails")
public class Claim {
 //id,claim id,policy id,claim status,claim amount 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String claimId ;
	private String policyId ; 
	private String claimstatus;
	private String claimamount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getClaimstatus() {
		return claimstatus;
	}
	public void setClaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}
	public String getClaimamount() {
		return claimamount;
	}
	public void setClaimamount(String claimamount) {
		this.claimamount = claimamount;
	//}
	//@Override
	//public String toString() {
		//return "Claim [id=" + id + ", claimId=" + claimId + ", policyId=" + policyId + ", claimstatus=" + claimstatus
				//+ ", claimamount=" + claimamount + "]";
	//}
	
	}
}
