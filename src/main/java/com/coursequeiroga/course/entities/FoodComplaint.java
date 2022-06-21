package com.coursequeiroga.course.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_food_complaint")
public class FoodComplaint extends Complaint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String victimAddress;
	private String victimAddressComplement;
	private String victimAddressProvince;
	private String victimClosestCity;
	private String victimUF;
	private String victimCEP;
	private String victimPhone;
	
	private int qtdEaters;
	private int qtdSick;
	private int qtdHospitalizations;
	private int qtdDeads;
	
	private String placeMedicalCare;
	

	public FoodComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FoodComplaint(Long id, String description, String observations, String complainerName,
			String complainerAddress, String complainerAddressComplement, String complainerAddressProvince,
			String complainerUF, String complainerCity, String complainerPhone, String complainerEmail, String victimAddress, String victimAddressComplement, String victimAddressProvince,
			String victimClosestCity, String victimUF, String victimCEP, String victimPhone, int qtdEaters, int qtdSick,
			int qtdHospitalizations, int qtdDeads, String placeMedicalCare) {
		super(description, observations, complainerName, complainerAddress, complainerAddressComplement,
				complainerAddressProvince, complainerUF, complainerCity, complainerPhone, complainerEmail);
		this.id = id;
		this.victimAddress = victimAddress;
		this.victimAddressComplement = victimAddressComplement;
		this.victimAddressProvince = victimAddressProvince;
		this.victimClosestCity = victimClosestCity;
		this.victimUF = victimUF;
		this.victimCEP = victimCEP;
		this.victimPhone = victimPhone;
		this.qtdEaters = qtdEaters;
		this.qtdSick = qtdSick;
		this.qtdHospitalizations = qtdHospitalizations;
		this.qtdDeads = qtdDeads;
		this.placeMedicalCare = placeMedicalCare;
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getVictimAddress() {
		return victimAddress;
	}

	public void setVictimAddress(String victimAddress) {
		this.victimAddress = victimAddress;
	}

	public String getVictimAddressComplement() {
		return victimAddressComplement;
	}

	public void setVictimAddressComplement(String victimAddressComplement) {
		this.victimAddressComplement = victimAddressComplement;
	}

	public String getVictimAddressProvince() {
		return victimAddressProvince;
	}

	public void setVictimAddressProvince(String victimAddressProvince) {
		this.victimAddressProvince = victimAddressProvince;
	}

	public String getVictimClosestCity() {
		return victimClosestCity;
	}

	public void setVictimClosestCity(String victimClosestCity) {
		this.victimClosestCity = victimClosestCity;
	}

	public String getVictimUF() {
		return victimUF;
	}

	public void setVictimUF(String victimUF) {
		this.victimUF = victimUF;
	}

	public String getVictimCEP() {
		return victimCEP;
	}

	public void setVictimCEP(String victimCEP) {
		this.victimCEP = victimCEP;
	}

	public String getVictimPhone() {
		return victimPhone;
	}

	public void setVictimPhone(String victimPhone) {
		this.victimPhone = victimPhone;
	}

	public int getQtdEaters() {
		return qtdEaters;
	}

	public void setQtdEaters(int qtdEaters) {
		this.qtdEaters = qtdEaters;
	}

	public int getQtdSick() {
		return qtdSick;
	}

	public void setQtdSick(int qtdSick) {
		this.qtdSick = qtdSick;
	}

	public int getQtdHospitalizations() {
		return qtdHospitalizations;
	}

	public void setQtdHospitalizations(int qtdHospitalizations) {
		this.qtdHospitalizations = qtdHospitalizations;
	}

	public int getQtdDeads() {
		return qtdDeads;
	}

	public void setQtdDeads(int qtdDeads) {
		this.qtdDeads = qtdDeads;
	}

	public String getPlaceMedicalCare() {
		return placeMedicalCare;
	}

	public void setPlaceMedicalCare(String placeMedicalCare) {
		this.placeMedicalCare = placeMedicalCare;
	}
	
	
}
