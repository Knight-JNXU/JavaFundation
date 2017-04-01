package service;

import model.StudentModel;

/**
* @author knight
* @createtime : 2017年3月31日 下午10:43:31
* @description : SpringService用于做spring的junit测试
* @result : 
*/
public interface SpringService extends BaseService{
    
    void insertStudent(StudentModel studentModel) throws Exception;
    
}
