package client;



import org.hibernate.Session;

import domain.Message;
import util.HibernateUtil;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Message message = new Message("thrid message form code");
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
	}
}