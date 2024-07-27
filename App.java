package sample.sample_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 System.out.println( "Project  Started!" );
         SessionFactory factory =new Configuration().configure().buildSessionFactory();
         //System.out.println(factory);
         Student stud=new Student();
         stud.setSid(1);
         stud.setCity("Jabalpur");
         stud.setName("Aditi");
         System.out.println(stud);
         Adress ad1=new Adress();
         ad1.setStreet("st-1");
         ad1.setCity("Jabalpur");
         ad1.setAdded(new Date());
         ad1.setX(12.09);
         FileInputStream imgF=new FileInputStream("src/main/java/tree.png");
         byte[] imgData=new byte[imgF.available()];
         imgF.read(imgData);
         ad1.setImg(imgData);
         Session session=factory.openSession();
         
         
         Transaction tx=session.beginTransaction();
         session.save(stud);
         session.save(ad1);
         tx.commit();
        
         session.close();
         System.out.println("Done");
         
    }
}
