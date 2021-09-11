package com.hiremate.applicant.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Username;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String EmailId;
	private String MobileNumber;
	private String Address;
	private String City;
	private String District;
	private String State;
	private String PosetalCode;
	private String Country;

	public Applicant() {
	}

	public Applicant(Long id, String username, String firstName, String middleName, String lastName, String emailId,
			String mobileNumber, String address, String city, String district, String state, String posetalCode,
			String country) {
		super();
		Id = id;
		Username = username;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		EmailId = emailId;
		MobileNumber = mobileNumber;
		Address = address;
		City = city;
		District = district;
		State = state;
		PosetalCode = posetalCode;
		Country = country;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPosetalCode() {
		return PosetalCode;
	}

	public void setPosetalCode(String posetalCode) {
		PosetalCode = posetalCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Applicant [Id=" + Id + ", Username=" + Username + ", FirstName=" + FirstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", EmailId=" + EmailId + ", MobileNumber=" + MobileNumber
				+ ", Address=" + Address + ", City=" + City + ", District=" + District + ", State=" + State
				+ ", PosetalCode=" + PosetalCode + ", Country=" + Country + "]";
	}

}
