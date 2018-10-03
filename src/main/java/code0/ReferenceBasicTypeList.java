package code0;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 探究for循环在外部定义对象，使用set改变对象值后，加入list会产生什么影响
 * @author knightjxnu
 * @version 1.0
 * @date 2018年10月3日
 */
public class ReferenceBasicTypeList{
    
   class Student{
       private Long ID;
       private long id;
       private String name;
    
    public Long getID(){
        return ID;
    }
    
    public long getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setID(Long iD){
        ID = iD;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student [ID=" + ID + ", id=" + id + ", name=" + name + "]";
    }
    
   }
   
    /**
    * TestReferenceBasicTypeList.
    */
    @Test
    public void testReferenceBasicTypeList(){
        List<Student> studentList = new ArrayList<ReferenceBasicTypeList.Student>();
        Student student = new Student();
        for(int i=0; i<2; i++) {
            student.setID(new Long(i));
            student.setId(new Long(i).longValue());
            student.setName(""+i);
            studentList.add(student);
        }
        for (Student student1 : studentList){
            System.out.println("result:"+student1.toString());
        }
        
    }

}
