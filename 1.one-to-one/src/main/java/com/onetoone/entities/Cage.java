package com.onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cage_id;
	private String cage_no;
	private String cage_location;
	
	@OneToOne
	@JoinColumn(name = "animal_id")
	private Animal animal;

	public Cage() {
		
	}
	
	public Cage(Integer cage_id, String cage_no, String cage_location, Animal animal) {
		this.cage_id = cage_id;
		this.cage_no = cage_no;
		this.cage_location = cage_location;
		this.animal = animal;
	}

	public Cage(String cage_no, String cage_location) {
		this.cage_no = cage_no;
		this.cage_location = cage_location;
	}

	public String getCage_no() {
		return cage_no;
	}

	public void setCage_no(String cage_no) {
		this.cage_no = cage_no;
	}

	public String getCage_location() {
		return cage_location;
	}

	public void setCage_location(String cage_location) {
		this.cage_location = cage_location;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cage [cage_id=");
		builder.append(cage_id);
		builder.append(", cage_no=");
		builder.append(cage_no);
		builder.append(", cage_location=");
		builder.append(cage_location);
		builder.append(", animal=");
		builder.append(animal);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
