package manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeToProjectMapping {

	public static void main(String[] args) {
		 SessionFactory factory =new Configuration().configure().buildSessionFactory();
		 Employee emp1=new Employee();
		 Employee emp2=new Employee();
		 Employee emp3=new Employee();
		 
		 emp1.seteId(1111);
		 emp1.setName("Deepak");
		 emp1.setTech("Java");
		 
		 emp2.seteId(1121);
		 emp2.setName("Advika");
		 emp2.setTech("Frontend");
		 
		 emp3.seteId(1113);
		 emp3.setName("Anjali");
		 emp3.setTech("Backend");
		 
		 Project p1=new Project();
		 Project p2=new Project();
		 Project p3=new Project();
		 
		 p1.setpId(101);
		 p1.setpName("Ecom");
		 
		 p2.setpId(102);
		 p2.setpName("App");
		 
		 p3.setpId(103);
		 p3.setpName("Ai/ml");
		 
		 List<Project> proList=new ArrayList<>();
		 List<Employee> empList=new ArrayList<>();
		 
		 proList.add(p1);
		 proList.add(p2);
		 proList.add(p3);
		 
		 empList.add(emp1);
		 empList.add(emp2);
		 empList.add(emp3);
		 
		 emp1.setProList(proList);
		 p1.setEmpList(empList);
		 
		 Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		 
		 s.save(emp1);
		 s.save(emp2);
		 s.save(emp3);
		 s.save(p1);
		 s.save(p2);
		 s.save(p3);
		 
		 tx.commit();
	     s.close();
		 factory.close();
	}
}
