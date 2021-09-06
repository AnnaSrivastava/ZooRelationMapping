package com.onetomany.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.entities.Animal;
import com.onetomany.entities.Category;
import com.onetomany.factory.HibernateSessionFactory;

public class Tester {
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();

		@SuppressWarnings("unchecked")
		List<Category> categories = session.createQuery("from Category c join fetch c.animals Animal").getResultList();
		for (Category category : categories) {
			System.out.println(category);
			for (Animal animal : category.getAnimalList()) {
				System.out.println(animal);
			}
		}

		session.close();
		factory.close();
	}
}
