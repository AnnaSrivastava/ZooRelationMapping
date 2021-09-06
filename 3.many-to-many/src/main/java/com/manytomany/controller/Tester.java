package com.manytomany.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytomany.factory.HibernateSessionFactory;

public class Tester {
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		session.close();
		factory.close();
	}
}
