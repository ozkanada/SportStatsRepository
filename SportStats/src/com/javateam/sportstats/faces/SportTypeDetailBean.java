package com.javateam.sportstats.faces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.javateam.sportstats.entity.SportType;
import com.javateam.sportstats.repository.SportTypeRepository;

@ManagedBean
@RequestScoped
public class SportTypeDetailBean {
	private SportType sportType;

	public SportTypeDetailBean() {
		//SportTypeRepository repository=new SportTypeRepository();
		sportType=new SportType(1L, "Futbol");
		//sportType=repository.find(Long.parseLong("1"));
		//repository.close();
	}
	
	public SportType getSportType() {
		return sportType;
	}

	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}	
	
}
