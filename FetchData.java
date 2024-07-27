package sample.sample_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
public static void main(String []args) {
	 SessionFactory factory =new Configuration().configure().buildSessionFactory();
	 Session session=factory.openSession();
	 Student getStud=(Student)session.get(Student.class, 1);
	 System.out.println(getStud);
	    session.close();
	    factory.close();
}
}
