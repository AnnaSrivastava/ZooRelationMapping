package com.manytomany.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animal_id;
	private String type;
	private Integer total_no;
	@ManyToMany
	@JoinTable(name = "animal_food_item", joinColumns = {
			@JoinColumn(name = "animal_id", referencedColumnName = "animal_id") }, inverseJoinColumns = {
					@JoinColumn(name = "food_item_id", referencedColumnName = "food_item_id") })

	private List<FoodItem> foodItemList;

	public Animal() {

	}

	public Animal(Integer animal_id, String type, Integer total_no, List<FoodItem> foodItemList) {
		this.animal_id = animal_id;
		this.type = type;
		this.total_no = total_no;
		this.foodItemList = foodItemList;
	}

	public Animal(String type, Integer total_no, List<FoodItem> foodItemList) {
		super();
		this.type = type;
		this.total_no = total_no;
		this.foodItemList = foodItemList;
	}

	public Animal(String type, Integer total_no) {
		super();
		this.type = type;
		this.total_no = total_no;
	}

	public Integer getAnimal_id() {
		return animal_id;
	}

	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
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

	public List<FoodItem> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<FoodItem> foodItemList) {
		this.foodItemList = foodItemList;
	}

}
