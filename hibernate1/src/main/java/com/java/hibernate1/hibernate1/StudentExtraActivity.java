package com.java.hibernate1.hibernate1;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class StudentExtraActivity extends studentInfo {
	@Column(name="noOfStudent")
	private int noOfStudent;
	@Column(name="Sport")
	private String Sport;
	/**
	 * @param id
	 * @param frist_Name
	 * @param last_Name
	 * @param email
	 * @param noOfStudent
	 * @param sport
	 */
	public StudentExtraActivity(int id, String frist_Name, String last_Name, String email, int noOfStudent,
			String sport) {
		super(id, frist_Name, last_Name, email);
		this.noOfStudent = noOfStudent;
		Sport = sport;
	}

	
	
	public StudentExtraActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param noOfStudent
	 * @param sport
	 */
	public StudentExtraActivity(int noOfStudent, String sport) {
		super();
		this.noOfStudent = noOfStudent;
		Sport = sport;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public String getSport() {
		return Sport;
	}

	public void setSport(String sport) {
		Sport = sport;
	}

	@Override
	public String toString() {
		return "StudentExtraActivity [noOfStudent=" + noOfStudent + ", Sport=" + Sport + "]";
	}
	
	
	
}
