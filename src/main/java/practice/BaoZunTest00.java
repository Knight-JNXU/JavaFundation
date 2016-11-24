package practice;

import org.junit.Test;

/**
 * Created by Knigh on 2016/11/24.
 * 宝尊笔试题
 */
public class BaoZunTest00 {
    private class Animal{
        public void shout(){
            System.out.println("animal");
        }
    }
    private class Dog extends Animal{
        public void shout(){
            System.out.println("dog");
        }
    }
    private class Cat extends Animal{
        public void shout(){
            System.out.println("cat");
        }
    }
    @Test
    public void test(){
        Animal animal = new Dog();
        Cat cat = (Cat) animal;
        cat.shout();
    }
}
