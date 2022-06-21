package com.coursequeiroga.course.entities;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Complaint {


	
	
	
	private String description;
	private String observations;
	private String complainerName;
	private String complainerAddress;
	private String complainerAddressComplement;
	private String complainerAddressProvince;
	private String complainerCity;
	private String complainerUF;
	private String complainerPhone;
	private String complainerEmail;
	
	public Complaint() {
		
	}

	public Complaint(String description, String observations, String complainerName, String complainerAddress,
			String complainerAddressComplement, String complainerAddressProvince,String complainerUF,String complainerCity,
			String complainerPhone, String complainerEmail) {
		super();
		this.description = description;
		this.observations = observations;
		this.complainerName = complainerName;
		this.complainerAddress = complainerAddress;
		this.complainerAddressComplement = complainerAddressComplement;
		this.complainerAddressProvince = complainerAddressProvince;
		this.complainerUF = complainerUF;
		this.complainerCity = complainerCity;
		this.complainerPhone = complainerPhone;
		this.complainerEmail = complainerEmail;
	}

	public String getComplainerUF() {
		return complainerUF;
	}

	public void setComplainerUF(String complainerUF) {
		this.complainerUF = complainerUF;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getComplainerName() {
		return complainerName;
	}

	public void setComplainerName(String complainerName) {
		this.complainerName = complainerName;
	}

	public String getComplainerAddress() {
		return complainerAddress;
	}

	public void setComplainerAddress(String complainerAddress) {
		this.complainerAddress = complainerAddress;
	}

	public String getComplainerAddressComplement() {
		return complainerAddressComplement;
	}

	public void setComplainerAddressComplement(String complainerAddressComplement) {
		this.complainerAddressComplement = complainerAddressComplement;
	}

	public String getComplainerAddressProvince() {
		return complainerAddressProvince;
	}

	public void setComplainerAddressProvince(String complainerAddressProvince) {
		this.complainerAddressProvince = complainerAddressProvince;
	}

	public String getComplainerCity() {
		return complainerCity;
	}

	public void setComplainerCity(String complainerCity) {
		this.complainerCity = complainerCity;
	}

	public String getComplainerPhone() {
		return complainerPhone;
	}

	public void setComplainerPhone(String complainerPhone) {
		this.complainerPhone = complainerPhone;
	}

	public String getComplainerEmail() {
		return complainerEmail;
	}

	public void setComplainerEmail(String complainerEmail) {
		this.complainerEmail = complainerEmail;
	}


}
