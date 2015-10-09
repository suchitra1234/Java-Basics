package com.test;
import com.test.Product;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClientForSave {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Product p = new Product();
		p.setProdId(1);
		p.setProdName("samsung");
		p.setPrice(12000);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved Successfully ....!!");
		tx.commit();
		session.close();
		factory.close();
	

	}

}
