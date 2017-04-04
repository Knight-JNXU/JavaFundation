package JunitTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.PersonDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:hibernate-conf.xml",
								"classpath*:spring-conf.xml"})
public class JpaTest {
	
	@Test
	public void createTable(){
		System.out.println("create over!");
	}
	
	@Autowired
	private PersonDao personDao;
	@Test
	public void insertPerson(){
		personDao.insertPerson();
		System.out.println("insert over!");
	}
	
}
