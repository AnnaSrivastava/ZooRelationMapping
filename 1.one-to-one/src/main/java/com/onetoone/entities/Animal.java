package com.onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animal_id;
	private String type;
	private Integer total_no;
	
	@OneToOne(mappedBy = "animal")
	private Cage cage;
	public Animal() {
		
	}
	
	public Animal(Integer animal_id, String type, Integer total_no, Cage cage) {
		this.animal_id = animal_id;
		this.type = type;
		this.total_no = total_no;
		this.cage = cage;
	}

	public Animal(String type, Integer total_no) {
		this.type = type;
		this.total_no = total_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getTotal_no() {
		return total_no;
	}
	public void setTotal_no(Integer total_no) {
		this.total_no = total_no;
	}
	public Cage getCage() {
		return cage;
	}
	public void setCage(Cage cage) {
		this.cage = cage;
	}
	@Override
	public String toString() {
		return "Animal [animal_id=" + animal_id + ", type=" + type + ", total_no=" + total_no + "]";
	}
	
}
