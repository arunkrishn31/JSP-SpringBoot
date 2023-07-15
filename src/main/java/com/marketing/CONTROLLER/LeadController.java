package com.marketing.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.ENTITY.Lead;
import com.marketing.SERVICE.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;

	// Handler Methods
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	}

	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) { // Model attribute helps get a data
																					// from form and mapping with the
																					// Lead
		leadService.saveLead(lead); // Model map is equal to set and get attribute like in Servlet
		model.addAttribute("msg", "Lead is saved");
		return "create_lead";
	}

	@RequestMapping("/allLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> Leads = leadService.listAllLeads();
		model.addAttribute("leads", Leads);
		return "lead_search_result";
	}

////	@RequestMapping("/saveLead")
//	public String saveOnelead(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String email,@RequestParam Long mobilenumber) {
//		This method is useful for two or three params only
//		Lead l=new Lead();
//		l.setFirstname(firstname);
//		l.setSecondname(lastname);
//		l.setEmail(email);
//		l.setMobilenumber(mobilenumber);
//		leadService.saveLead(1);
//		
//		return "create_lead";
//	}

//	DTO-Data Transfer Object
//	
//	@RequestMapping("/savelead")
//	public String saveOneLead(LeadData data,ModelMap model) {
//	Lead lead=new Lead();
//	lead.setFirstname(data.getFirstname());
//	lead.setSecondname(data.getSecondname());
//	lead.setEmail(data.getEmail());
//	lead.setMobilenumber(data.getMobilenumber());
//	leadService.saveLead(lead);
//	model.addAttribute("msg", "Data Saved to Backend");
//		return"create_lead";
//	}

	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id, ModelMap model) {

		leadService.deleteLeadById(id);
		List<Lead> Leads = leadService.listAllLeads();
		model.addAttribute("leads", Leads);

		return "lead_search_result";
	}

	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "Update_Lead";
	}

	@RequestMapping("/updateLead")
	public String updateOneLeaddata(LeadData data, ModelMap model) {
		Lead lead = new Lead();
		lead.setId(data.getId());
		lead.setFirstname(data.getFirstname());
		lead.setSecondname(data.getSecondname());
		lead.setEmail(data.getEmail());
		lead.setMobilenumber(data.getMobilenumber());

		leadService.saveLead(lead);

		List<Lead> Leads = leadService.listAllLeads();
		model.addAttribute("leads", Leads);
		return "lead_search_result";
	}
}
