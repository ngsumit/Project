package com.cg.placement.entities;

import java.util.Set;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="placement1")

public class Placement implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="p_id")
	private int p_id;

	@ManyToOne
	@JoinColumn(name="college")
	private College college;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date")
	private String date ;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="year")
	private int year;
	
	public int getP_Id() {
		return p_id;
	}
	public void setP_Id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	}
