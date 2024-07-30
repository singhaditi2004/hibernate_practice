package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OwnerToDeviceMap {
  
	public static void main(String []args) {
		 SessionFactory factory =new Configuration().configure().buildSessionFactory();
	        Owner own1=new Owner();
	        own1.setOwnerId(1);
	        own1.setOwnerName("Aditi");
	        
	        Device dev1=new Device();
	        dev1.setDeviceId(11);
	        dev1.setDeviceName("HP");
	        dev1.setOwner(own1);
	        
	        Device dev2=new Device();
	        dev2.setDeviceId(12);
	        dev2.setDeviceName("Poco");
	        dev2.setOwner(own1);
	        
	        Device dev3=new Device();
	        dev3.setDeviceId(13);
	        dev3.setDeviceName("Ipad");
	        dev3.setOwner(own1);
	        
	        List<Device> listDev=new ArrayList<>();
	        listDev.add(dev1);
	        listDev.add(dev2);
	        listDev.add(dev3);
	        
	        own1.setDevices(listDev);
	        
	        Session session=factory.openSession();
	        Transaction tx=session.beginTransaction();
	        session.save(own1);
	        
	        tx.commit();
	        session.close();
	        factory.close();
	}
}
