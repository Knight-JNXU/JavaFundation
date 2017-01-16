package code.dao;

import code.common.Constant;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Knight_JXNU on 2017/1/16.
 */
public class BaseJDBC {
    private Connection connection = null;
    private Statement statement = null;

    /**
     * 开启链接
     */
    private void openConnection() {
        try {
            Class.forName(Constant.MYSQL_JDBC_DRIVER);
            connection = DriverManager.getConnection(Constant.MYSQL_URL, Constant.USER_NAME, Constant.USER_PASS);
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 创建table
     */
    @Test
    public void createTable(){
        openConnection();
        try {
            if(statement.execute("create table student(id int primary key, name varchar(30));")){
                System.out.println("The table was created successfully!");
            }else {
                System.out.println("Failed to create the table!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 插入数据
     */
    @Test
    public void insert(){
        openConnection();
        try {
            int result = statement.executeUpdate("INSERT INTO student(id, name) VALUES (1, 'lw')");
            System.out.println("insert "+result+" datas!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 修改数据
     */
    @Test
    public void update(){
        openConnection();
        try {
            int result = statement.executeUpdate("update student set name='lw' where id=1");
            System.out.println("update "+result+" datas!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 查询语句
     */
    @Test
    public void select(){
        openConnection();
        try {
            ResultSet resultSets = statement.executeQuery("select * from student");
            while (resultSets.next()){
                int id = resultSets.getInt("id");
                String name = resultSets.getString("name");
                System.out.println("id:"+id+",name:"+name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 删除语句
     */
    @Test
    public void delete(){
        openConnection();
        try {
            int result = statement.executeUpdate("DELETE FROM student WHERE id=1");
            System.out.println("drop "+result+" datas!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void drop(){
        openConnection();
        try {
            int result = statement.executeUpdate("DROP TABLE student");
            System.out.println("delete "+result+" datas!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}