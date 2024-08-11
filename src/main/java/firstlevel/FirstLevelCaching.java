package firstlevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sample.sample_project.Student;

public class FirstLevelCaching {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
        Student stu=session.get(Student.class, 1);
        System.out.println(stu.getName()+" "+stu.getSid());
        Student stu2=session.get(Student.class, 1);
        System.out.println(stu2.getName()+" "+stu2.getSid());
        //checks if a object is in cache memory of session
        System.out.println(session.contains(stu2));
		session.close();
		factory.close();
	}
}
