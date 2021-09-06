package com.manytomany.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class FoodItem {
	private Integer food_item_id;
	private String name;
	private String quantiy;
	@ManyToMany
	private List<Animal> animalList;
	public FoodItem() {
		
	}
	
	public FoodItem(Integer food_item_id, String name, String quantiy, List<Animal> animalList) {
		this.food_item_id = food_item_id;
		this.name = name;
		this.quantiy = quantiy;
		this.animalList = animalList;
	}
	
	public FoodItem(String name, String quantiy) {
		this.name = name;
		this.quantiy = quantiy;
	}

	public Integer getFood_item_id() {
		return food_item_id;
	}

	public void setFood_item_id(Integer food_item_id) {
		this.food_item_id = food_item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(String quantiy) {
		this.quantiy = quantiy;
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
		builder.append("FoodItem [food_item_id=");
		builder.append(food_item_id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", quantiy=");
		builder.append(quantiy);
		builder.append(", animalList=");
		builder.append(animalList);
		builder.append("]");
		return builder.toString();
	}
	
}
