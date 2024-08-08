package com.hql;


import java.util.Arrays;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import sample.sample_project.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "from Student";
		Query q = session.createQuery(query);
		List<Student> stuList = q.list();
		for (Student s : stuList) {
			System.out.println(s.getName());
		}
		Transaction tx = (Transaction) session.beginTransaction();
		//Deleteing data
		 String qu1="from Student as s where s.city=:x ands.name:=n";
		Query q1 = session.createQuery("delete from Student where city=:c");
		q1.setParameter("c", "Jabalpur");
		int c = q1.executeUpdate();
		System.out.println(c);
		
		//Join
		Query q3=session.createQuery("select e.eId,e.name,e.tech,p.Id,p.pName from Employee as e INNER JOIN e.proList as p");
		List<Object[]> list=q3.getResultList();
		for(Object []arr:list) {
			System.out.println(Arrays.toString(arr));
		}
		tx.commit();
		session.close();
		factory.close();

	}
}
