package cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Answer;
import com.mapping.Question;

public class Cascade {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
        Question q1=new Question();
        q1.setQuestion("Who are you....?");
        q1.setQuestionId(2161);
        
        Answer a1=new Answer(112,"Even I don't know");
        q1.setAns(a1);
        Transaction tx=session.beginTransaction();
        session.save(q1);
        session.save(a1);
        tx.commit();
		session.close();
		factory.close();
	}
}
