package com.marketing.CONTROLLER;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.ENTITY.Lead;
import com.marketing.SERVICE.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	private LeadService leadservice;
	
//	@GetMapping
//	public List<Lead> getAllLeads(){
//		List<Lead> leads = leadservice.listAllLeads();
//		return leads;
//	}
	
	@PostMapping
	public void saveOneLead(Lead lead) {
		leadservice.saveLead(lead);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id") long id) {
		leadservice.deleteLeadById(id);
	}
}
