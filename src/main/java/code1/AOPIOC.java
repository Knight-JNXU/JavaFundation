package code1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.StudentModel;
import service.SpringService;
import service.SpringServiceImpl;
import service.SpringServiceImpl2;

/**
* @author knight
* @createtime : 2017年3月31日 下午10:43:31
* @description : spring中使用junit
* @result : 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-junit-conf.xml")
//@Rollback(true)
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) 
//注意在新的spring版本中，@TransactionConfiguration注解被@Commit和@Rollback取代了，详情见官方文档
public class AOPIOC{
    
    @Autowired
    private SpringService springService;
    @Autowired
    private SpringServiceImpl springServiceImpl;
    
    @Test
    public void testSpringServiceImplinsertStudent1() throws Exception{
        springServiceImpl.insertStudent(new StudentModel());
    }
    @Test
    public void testSpringServiceImplinsertStudent2() throws Exception{
        springService.insertStudent(new StudentModel());
    }
    @Autowired
    private SpringServiceImpl2 springServiceImpl2;
    @Test
    public void testSpringServiceImplinsertStudent3() throws Exception{
        springServiceImpl2.insertStudent(new StudentModel());
    }
}
