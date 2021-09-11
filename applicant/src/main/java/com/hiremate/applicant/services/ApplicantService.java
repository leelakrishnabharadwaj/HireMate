package com.hiremate.applicant.services;

import org.springframework.stereotype.Service;

import com.hiremate.applicant.models.Applicant;

@Service
public class ApplicantService {

	public String createApplicant(Applicant applicant) {
		return applicant.getUserName();
	}

}
