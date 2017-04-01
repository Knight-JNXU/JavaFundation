package code1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.StudentModel;
import service.SpringService;

/**
* @author knight
* @createtime : 2017年3月31日 下午10:43:31
* @description : spring中使用junit
* @result : 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-junit-conf.xml")
@Rollback(true)
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) 
//注意在新的spring版本中，@TransactionConfiguration注解被@Commit和@Rollback取代了，详情见官方文档
public class SpringJunit0{
    
    @Autowired
    private SpringService springService;
    
    @Test
    public void testSpringServiceImplinsertStudent(){
        try{
            springService.insertStudent(new StudentModel());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
