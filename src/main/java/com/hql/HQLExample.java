package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sample.sample_project.Student;
public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		String query="from Student";
		Query q=session.createQuery(query);
		List<Student> stuList=q.list();
		for(Student s:stuList) {
			System.out.println(s.getName());
		}
		session.close();
		factory.close();
		
	}
}
