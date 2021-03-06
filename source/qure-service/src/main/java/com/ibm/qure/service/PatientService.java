package com.ibm.qure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.qure.exceptions.ApplicationException;
import com.ibm.qure.exceptions.QureApplicationException;
import com.ibm.qure.model.Patient;
import com.ibm.qure.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository patientRepo;

	public PatientService() {
	}

	public boolean create(Patient patient) throws ApplicationException, QureApplicationException {
		try {
			patientRepo.save(patient);
			return true;
		} catch (Exception e) {
			throw new QureApplicationException("Server Error. Please try after sometime. Cause: " + e.getMessage(), e);
		}
	}

	public Patient get(String email) {
		return patientRepo.findByEmail(email);
	}

	public Patient getById(String id) {
		return patientRepo.findByPatientId(id);
	}

	public List<Patient> getAll() {
		return patientRepo.findAll();
	}

	public boolean update(Patient patient) {
		patientRepo.save(patient);
		return true;
	}

	public boolean delete(String id) {
		patientRepo.deleteById(id);
		return true;
	}

}
