package com.onetoone.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetoone.entities.Animal;
import com.onetoone.entities.Cage;
import com.onetoone.factory.HibernateSessionFactory;

public class Tester {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Giraffe", 8);
		Animal animal2 = new Animal("Tiger", 6);
		Animal animal3 = new Animal("Elephant", 7);
		Animal animal4 = new Animal("Blackbuck", 3);
		Animal animal5 = new Animal("Lion", 2);

		Cage cage1 = new Cage("G1", "North");
		Cage cage2 = new Cage("T1", "South");
		Cage cage3 = new Cage("E1", "East");
		Cage cage4 = new Cage("B1", "West");
		Cage cage5 = new Cage("L1", "North");

		cage1.setAnimal(animal1);
		cage2.setAnimal(animal2);
		cage3.setAnimal(animal3);
		cage4.setAnimal(animal4);
		cage5.setAnimal(animal5);

		animal1.setCage(cage1);
		animal2.setCage(cage2);
		animal3.setCage(cage3);
		animal4.setCage(cage4);
		animal5.setCage(cage5);

		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
	
		List<Cage> cages = session.createQuery("select c from Cage c").getResultList();
		for(Cage c: cages) {
			System.out.println("-------------Cages-----------");
			System.out.println(c);
		}
		tx.commit();
		session.close();
		factory.close();

	}
}
