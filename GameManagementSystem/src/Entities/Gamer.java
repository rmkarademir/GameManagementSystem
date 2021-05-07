package Entities;

import java.time.LocalDate;
import java.util.Date;

import Abstract.Entity;

public class Gamer implements Entity{
	private int id;
	private String firtsName;
	private String lastName;
	private String nationalyNumber;
	private LocalDate birthDate;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firtsName, String lastName, String nationalyNumber, LocalDate birthDate) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.nationalyNumber = nationalyNumber;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalyNumber() {
		return nationalyNumber;
	}

	public void setNationalyNumber(String nationalyNumber) {
		this.nationalyNumber = nationalyNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
