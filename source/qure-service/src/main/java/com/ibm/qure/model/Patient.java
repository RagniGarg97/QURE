package com.ibm.qure.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient extends Person {
	@Id
	private String patientId;

	private List<Appointment> appointmentList;

	public Patient() {
		// default constructor
	}

	public Patient(String firstName, String lastName, String email, Date dateOfBirth, String gender, String phone, int userLevel,
			Address address, String ssn) {
		super(firstName, lastName, email, dateOfBirth, gender, phone, address, userLevel);

		appointmentList = new ArrayList<Appointment>();
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
}
