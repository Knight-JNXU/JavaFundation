import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.Before;
import org.junit.Test;

public class JpaTest {
	
	@Test
	public void returnReturnResPath(){
//		System.out.println(Class.getResource());
	}
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init(){
	    StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
	    Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();
	    sessionFactory = metadata.getSessionFactoryBuilder().build();
	    session = sessionFactory.openSession();
	    transaction = session.beginTransaction();
	}
	
	@Test
	public void createTable(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysqlJPA");
		factory.close();
	}

}
