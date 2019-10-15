package com.hibernate.assign.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.assign.model.Employee;
import com.hibernate.assign.util.HibernateUtil;

class EmployeeDemo {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Employee employee = new Employee("John Doe", "HR", 34000);
		Employee employee1 =new Employee("guu" ,"ht",4300)  ;
		session.save(employee);		
		session.save(employee1);
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();


		//		Session session = HibernateUtil.getSession();
		//		
		//		Employee employee = (Employee) session.load(Employee.class, 2);
		//		System.out.println("hii");
		//		System.out.println(employee);
		//		
		//		session.close();
		//		HibernateUtil.closeSessionFactory();

		//		Session session = HibernateUtil.getSession();
		//		Transaction tx = session.beginTransaction();
		//		
		//	    Employee employee = (Employee) session.get(Employee.class, 1);
		//		if(employee != null)
		//			employee.setEmployeeSalary(45000);
		//		
		//		tx.commit();
		//		session.close();
		//		HibernateUtil.closeSessionFactory();

		//		Session session = HibernateUtil.getSession();
		//		Transaction tx = session.beginTransaction();
		//		
		//		Employee employee = (Employee) session.get(Employee.class, 1);
		//		if(employee != null)
		//			session.delete(employee);
		//		
		//		tx.commit();
		//		session.close();
		//		HibernateUtil.closeSessionFactory();
	}
}









