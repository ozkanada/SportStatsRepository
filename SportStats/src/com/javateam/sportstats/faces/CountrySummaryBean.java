package com.javateam.sportstats.faces;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.javateam.sportstats.entity.Country;

@ManagedBean
@RequestScoped
public class CountrySummaryBean {
	private List<Country> countries;

	public CountrySummaryBean() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
