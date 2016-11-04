package code0;

import org.junit.Test;

import java.io.*;

/**
 * Created by Knight_JXNU on 2016/11/4.
 * java object clone
 */
public class ObjectClone {

    private static class MyUtil{
        //发现只有 static 的 inner class 才能添加 static 方法
        public static <T> T clone(T obj) throws Exception{
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(obj);

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bin);
            return (T)ois.readObject();
        }
    }

    private static class Person implements Serializable{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void test() throws Exception {
        Person p0 = new Person("liuwen");
        System.out.println("p0:" + p0);
        Person p1 = MyUtil.clone(p0);
        System.out.println("p1:" + p1);
        //修改 clone 的 object 属性不会影响原来的 object 属性
        p1.setName("sw");
        System.out.println("p0:" + p0);
        System.out.println("p1:" + p1);
    }

}
