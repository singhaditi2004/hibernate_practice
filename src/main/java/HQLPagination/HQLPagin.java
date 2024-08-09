package HQLPagination;
 

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sample.sample_project.Student;

public class HQLPagin {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Query query=s.createQuery("from Student s where s.certi.course=:c");
		query.setParameter("c","Data Science");
	    //implementing Pagination(it is similar to LIMIT)
		//query.setFirstResult(0);
		//query.setMaxResults(10);
		List<Student> list=query.list();
		for(Student st:list) {
			System.out.println(st.getName()+" "+st.getSid());
		}
		s.close();
		factory.close();
 	}
}
