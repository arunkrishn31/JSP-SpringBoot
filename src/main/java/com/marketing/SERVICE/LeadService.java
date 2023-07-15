package com.marketing.SERVICE;

import java.util.List;

import com.marketing.ENTITY.Lead;

public interface LeadService {
	
	public void saveLead(Lead lead);

	public List<Lead> listAllLeads();

	public void deleteLeadById(long id);

	public Lead getOneLead(long id);


}
