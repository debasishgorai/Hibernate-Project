package com.debasish.hibernateproject1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//Example of One to Many bi-directional
@Entity
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String hod;
	@ManyToOne
	@JoinColumn
	private College college;
	public Dept() {
	
	}
	public Dept(String name, String hod,College college) {
		super();
		this.name = name;
		this.hod = hod;
		this.college=college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", hod=" + hod + ", college=" + college + "]";
	}
}
