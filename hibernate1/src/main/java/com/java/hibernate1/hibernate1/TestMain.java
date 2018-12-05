package com.java.hibernate1.hibernate1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestMain {

	public static void main(String[] args) {
	    SessionFactory Factory = new Configuration().configure("/com/java/hibernate1/hibernate1/Hibernate.cfg.xml").addAnnotatedClass(studentInfo.class).buildSessionFactory();
		Session session = Factory.openSession();
		
		try {
			System.out.println("creating a student data...");
			studentInfo s1=new studentInfo(05, "harsh", "belure", "harshBelure2317@gmail.com");
		    StudentExtraActivity sa=new StudentExtraActivity(06, "Akash", "Belure", "Akkibelure2317@gmail.com",20,"cricket");
		    Transaction tr = session.beginTransaction();
		    System.out.println("saving a student information");
		   	session.save(s1);
			session.save(sa);
			session.flush();
			tr.commit();
			System.out.println("saved suceessfully...");
			session.saveOrUpdate(s1);
			session.close();
		} finally {
			Factory.close();
		}
		
	}
}