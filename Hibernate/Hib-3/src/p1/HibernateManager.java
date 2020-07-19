package p1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
public class HibernateManager 
{
	Session session;
	private Transaction ref;
	public HibernateManager()
	{
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
        session =sessionFactory.openSession();	
        System.out.println("Connected to Pf....");
	}
	
	/*
	public void saveObj(Student s) //inserts a row into the table
	{
		//session.beginTransaction(); or
		Transaction tran = session.beginTransaction();
		session.save(s);
		//session.getTransaction().commit();  or
		tran.commit();
		System.out.println("Insertion success...");
	}
	
	public void readAll()
	{
		session.beginTransaction();
		Query q = session.createQuery("from Student");
		List li=q.list();
		Iterator itr = li.iterator();
		
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.getName()+"	"+s.getRoll());
		}
	}	
		*/
	
	public void readSpecific(String roll)
	{
		session.beginTransaction();
		Student s= (Student)session.get(Student.class, roll);
		System.out.println(s.getName()+"	"+s.getRoll());	
	}
	
	public void update(String roll,String newName)
	{
		ref=session.beginTransaction();
		Student s=(Student)session.get(Student.class, roll);
		s.setName(newName);
		session.update(s);
		ref.commit();
		System.out.println("Row Updated");
	}
}
