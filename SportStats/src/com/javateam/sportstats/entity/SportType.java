package com.javateam.sportstats.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="sporttype")
public class SportType {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long typeId;
	private String typeName;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="sportType")
	private List<League> league = new ArrayList<League>();
		
	public SportType(Long typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public SportType() {
	}
	
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public List<League> getLeague() {
		return league;
	}
	public void setLeague(List<League> league) {
		this.league = league;
	}
	
}
