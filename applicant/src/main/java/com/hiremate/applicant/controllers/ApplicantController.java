package com.hiremate.applicant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiremate.applicant.models.Applicant;
import com.hiremate.applicant.services.ApplicantService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/applicant")
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;
	
	@PostMapping("/createApplicant")
	public String createApplicant(@RequestBody Applicant applicant) {
		System.out.println(applicant.toString());	
		return applicantService.createApplicant(applicant);
	}

}
