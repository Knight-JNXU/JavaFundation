package dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Person;

/**
* @author knight
* @createtime : 2017年4月4日 下午7:46:13
* @description : 
* @result : 
*/
@Repository
@Transactional
public class PersonDao {
	
	@Autowired
	protected SessionFactory sessionFactory;
 
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insertPerson() {
		Session session = getSession();
		session.save(new Person(1, "lw", 1000.0005));
	}

}
