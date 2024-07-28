package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Map {

	public static void main(String[] args) {
        SessionFactory factory =new Configuration().configure().buildSessionFactory();
        Question ques1=new Question();
        ques1.setQuestionId(1);
        ques1.setQuestion("What is a programming language?");
        Answer ans1=new Answer();
        ans1.setAnswer_id(11);
        ans1.setAnswer("A programming language is a set of instructions");
        ques1.setAns(ans1);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(ques1);
        tx.commit();
        session.close();
        factory.close();
	}
}
