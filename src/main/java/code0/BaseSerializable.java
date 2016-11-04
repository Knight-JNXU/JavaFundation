package code0;

import java.io.*;

/**
 * Created by Knight_JXNU on 2016/11/3.
 * java 序列化
 */
public class BaseSerializable {

    class Student implements Serializable{
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private static String filePath = "E:/studentout.txt";

    @org.junit.Test
    public void xuLieHua(){
        Student s = new Student("liuwen");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(s);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void fanXuLieHua(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            Student s = (Student) ois.readObject();
            System.out.println(s.getName());
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
