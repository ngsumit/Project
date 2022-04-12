package com.cg.placement.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy="college",cascade = CascadeType.ALL)
	private Set<Placement> placement = new HashSet<>();
	
	private String collegeadmin;
	private String collegename;
	private String location;

	public Set<Placement> getPlacement() {
		return placement;
	}
	public void setPlacement(Set<Placement> placement) {
		this.placement = placement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
