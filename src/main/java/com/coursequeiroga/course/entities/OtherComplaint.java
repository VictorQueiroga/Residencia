package com.coursequeiroga.course.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_other_complaint")
public class OtherComplaint extends Complaint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int age;
	private String schoolLevel;
	private String ocuppation;
	private String eventAddress;
	private String eventAddressComplement;
	private String eventAddressProvince;
	private String eventCity;
	private String eventUF;
	private String eventCEP;
	private String eventPhone;
	private String eventEmail;
	
	

	public OtherComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OtherComplaint(Long id, String description, String observations, String complainerName,
			String complainerAddress, String complainerAddressComplement, String complainerAddressProvince,
			String complainerUF, String complainerCity, String complainerPhone, String complainerEmail, int age, String schoolLevel, String ocuppation, String eventAddress,
			String eventAddressComplement, String eventAddressProvince, String eventCity, String eventUF,
			String eventCEP, String eventPhone, String eventEmail) {
		super(description, observations, complainerName, complainerAddress, complainerAddressComplement,
				complainerAddressProvince, complainerUF, complainerCity, complainerPhone, complainerEmail);
		this.id = id;
		this.age = age;
		this.schoolLevel = schoolLevel;
		this.ocuppation = ocuppation;
		this.eventAddress = eventAddress;
		this.eventAddressComplement = eventAddressComplement;
		this.eventAddressProvince = eventAddressProvince;
		this.eventCity = eventCity;
		this.eventUF = eventUF;
		this.eventCEP = eventCEP;
		this.eventPhone = eventPhone;
		this.eventEmail = eventEmail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(String schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

	public String getOcuppation() {
		return ocuppation;
	}

	public void setOcuppation(String ocuppation) {
		this.ocuppation = ocuppation;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventAddressComplement() {
		return eventAddressComplement;
	}

	public void setEventAddressComplement(String eventAddressComplement) {
		this.eventAddressComplement = eventAddressComplement;
	}

	public String getEventAddressProvince() {
		return eventAddressProvince;
	}

	public void setEventAddressProvince(String eventAddressProvince) {
		this.eventAddressProvince = eventAddressProvince;
	}

	public String getEventCity() {
		return eventCity;
	}

	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}

	public String getEventUF() {
		return eventUF;
	}

	public void setEventUF(String eventUF) {
		this.eventUF = eventUF;
	}

	public String getEventCEP() {
		return eventCEP;
	}

	public void setEventCEP(String eventCEP) {
		this.eventCEP = eventCEP;
	}

	public String getEventPhone() {
		return eventPhone;
	}

	public void setEventPhone(String eventPhone) {
		this.eventPhone = eventPhone;
	}

	public String getEventEmail() {
		return eventEmail;
	}

	public void setEventEmail(String eventEmail) {
		this.eventEmail = eventEmail;
	}
	

}
