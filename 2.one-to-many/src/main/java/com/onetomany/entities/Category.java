package com.onetomany.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer category_id;
	private String category_type;
	@OneToMany(mappedBy = "category")
	private List<Animal> animalList;
	
	public Category() {
		
	}

	public Category(Integer category_id, String category_type, List<Animal> animalList) {
		this.category_id = category_id;
		this.category_type = category_type;
		this.animalList = animalList;
	}

	public Category(String category_type, List<Animal> animalList) {
		this.category_type = category_type;
		this.animalList = animalList;
	}

	public String getCategory_type() {
		return category_type;
	}

	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [category_id=");
		builder.append(category_id);
		builder.append(", category_type=");
		builder.append(category_type);
		builder.append(", animalList=");
		builder.append(animalList);
		builder.append("]");
		return builder.toString();
	}
	
	
}
