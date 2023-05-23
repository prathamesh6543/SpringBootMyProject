package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankdetails1")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bankaccountnumber;
	private String bankname;
	private String routingnumber;
	private String chequenumber;
	private String additionalinformation;

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankaccountnumber() {
		return bankaccountnumber;
	}

	public void setBankaccountnumber(String bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}

	public String getRoutingnumber() {
		return routingnumber;
	}

	public void setRoutingnumber(String routingnumber) {
		this.routingnumber = routingnumber;
	}

	public String getChequenumber() {
		return chequenumber;
	}

	public void setChequenumber(String chequenumber) {
		this.chequenumber = chequenumber;
	}

	public String getAdditionalinformation() {
		return additionalinformation;
	}

	public void setAdditionalinformation(String additionalinformation) {
		this.additionalinformation = additionalinformation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
