import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class JpaTest {
	
	@Test
	public void returnReturnResPath(){
//		System.out.println(Class.getResource());
	}
	
	@Test
	public void createTable(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysqlJPA");
		factory.close();
	}

}
