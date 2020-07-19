package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class StudentApp {

	private static Session session;

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.setName("Aishani");
		s1.setRoll("2");
		HibernateManager hm = new HibernateManager();
		hm.saveObj(s1);
		hm.readAll();
	}
	
}
