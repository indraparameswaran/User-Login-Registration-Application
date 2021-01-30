package com.users;

import javax.servlet.RequestDispatcher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserLoginDao {

	public static boolean validate(String userName, String password) {

		try {

			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			Transaction transaction = null;

			transaction = session.beginTransaction();

			UserLogin user = null;
			
			//getting user object
			user = (UserLogin) session.createQuery("FROM UserLogin ul WHERE ul.user_name = :userName").setParameter("userName", userName).uniqueResult();

			if (user != null && user.getPassword().equals(password)) {
				return true;
			}
			transaction.commit();

			session.close();

		} catch (Exception ex) {
			throw ex;
		}
		return false;
	}
	
	public static boolean register(String firstName, String lastName, String userName, String password) {

		try {

			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			Transaction transaction = null;

			transaction = session.beginTransaction();

			UserLogin user = new UserLogin();
			
			user.setFirst_name(firstName);
			user.setLast_name(lastName);
			user.setUser_name(userName);
			user.setPassword(password);
			
			
			session.save(user);
			transaction.commit();

			session.close();
			
			return true;
			

		} catch (Exception ex) {
			return false;
		}
		
	}
	

}
