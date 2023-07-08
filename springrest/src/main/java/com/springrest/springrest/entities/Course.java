package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	private Long id;
	private String Name;
	private String Descs;
	
	
	public Course(Long id, String name, String desc) {
		super();
		this.id = id;
		Name = name;
		Descs = desc;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesc() {
		return Descs;
	}

	public void setDesc(String desc) {
		Descs = desc;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", Name=" + Name + ", Desc=" + Descs + "]";
	}

	
}
