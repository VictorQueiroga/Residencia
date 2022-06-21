package com.coursequeiroga.course.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_animal_complaint")
public class AnimalComplaint extends Complaint implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String animalRace;
	private int animalQuantity;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant eventDate;
	
	private String eventAddress;
	private String eventAddressComplement;
	private String eventAddressProvince;
	private String eventCity;
	private String eventUF;
	private String eventCEP;
	private String eventPhone;
	private String eventEmail;
	


	public AnimalComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AnimalComplaint(Long id, String description, String observations, String complainerName,
			String complainerAddress, String complainerAddressComplement, String complainerAddressProvince,
			String complainerUF, String complainerCity, String complainerPhone, String complainerEmail, String animalRace, int animalQuantity, Instant eventDate, String eventAddress,
			String eventAddressComplement, String eventAddressProvince, String eventCity, String eventUF,
			String eventCEP, String eventPhone, String eventEmail) {
		super(description, observations, complainerName, complainerAddress, complainerAddressComplement,
				complainerAddressProvince, complainerUF, complainerCity, complainerPhone, complainerEmail);
		this.id = id;
		this.animalRace = animalRace;
		this.animalQuantity = animalQuantity;
		this.eventDate = eventDate;
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


	public String getAnimalRace() {
		return animalRace;
	}


	public void setAnimalRace(String animalRace) {
		this.animalRace = animalRace;
	}


	public int getAnimalQuantity() {
		return animalQuantity;
	}


	public void setAnimalQuantity(int animalQuantity) {
		this.animalQuantity = animalQuantity;
	}


	public Instant getEventDate() {
		return eventDate;
	}


	public void setEventDate(Instant eventDate) {
		this.eventDate = eventDate;
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
