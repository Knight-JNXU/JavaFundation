package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.StudentModel;

/**
 * @author knight
 * @createtime : 2017年3月31日 下午10:43:31
 * @description : SpringServiceImpl用于做spring的junit测试
 * @result :
 */
@Service("springService2")
@Transactional
public class SpringServiceImpl2{

    public void insertStudent(StudentModel studentModel) throws Exception{
        //这里为了简便，就直接使用一个boolean变量了，如果是真实的业务场景是需要写判断条件的
        boolean judgeInsertSuccess = true;
        if(judgeInsertSuccess){
            System.out.println("use dao to insert data!");
        }else{
            throw new Exception("insert student exception!");
        }
    }

}
