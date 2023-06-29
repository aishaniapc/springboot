package com.singleservice.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long candidateId;
	private String name;
	private Long phone;
	private String email;
	private String dob;
	private String aadhar;
	private String pan;
	private String location;
	private String internType;
	
	
	
	public Long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInternType() {
		return internType;
	}

	public void setInternType(String internType) {
		this.internType = internType;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(Long candidateId, String name, Long phone, String email, String dob, String aadhar, String pan,
			String location, String internType) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.aadhar = aadhar;
		this.pan = pan;
		this.location = location;
		this.internType = internType;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", dob=" + dob + ", aadhar=" + aadhar + ", pan=" + pan + ", location=" + location + ", internType="
				+ internType + "]";
	}
	
}
