package States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import sample.sample_project.Certificate;
import sample.sample_project.Student;
public class StatesDemo {
public static void main(String []args) {
	System.out.println("States Demo");
	SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Student stu=new Student();
	stu.setName("Aditi");
	stu.setCity("Jaipur");
	stu.setSid(10);
	stu.setCerti(new Certificate("as","2mon","Raman"));
	
	//student :Transient state
	
	Session session=f.openSession();
	session.save(stu);
	Transaction tx=session.beginTransaction();
	
	//student :Persisitent=session,database
	tx.commit();
	session.close();
	f.close();
}
}
