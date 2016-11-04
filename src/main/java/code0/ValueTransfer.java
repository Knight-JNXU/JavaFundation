package code0;
/**
 * Created by Knight_JXNU on 2016/9/21.
 * Java中的值传递
 * 基本类型（外加一个string）是值传递，对象（外加一个数组）是引用传递
 */
public class ValueTransfer {
    private static class Fish{
        public String name;

        public Fish(String name) {
            this.name = name;
        }
    }

    public static void main(String args[]){
        int i = 3;
        char c = 'C';
        String s = "hello!";
        Fish f = new Fish("fish");
        changeInt(i);
        changeChar(c);
        changString(s);
        changFish(f);
        System.out.println("i:" + i);
        System.out.println("c:" + c);
        System.out.println("s:" + s);
        System.out.println("f:" + f.name);
    }

    public static void changeInt(int i){
        i = 5;
    }
    public static void changeChar(char c){
        c = 'A';
    }
    public static void changString(String s){
        s = "hello world!";
    }
    public static void changFish(Fish f){
        f.name = "new fish!";
    }
}
