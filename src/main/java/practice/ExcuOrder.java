package practice;

/**
 * Created by Knight_JXNU on 2016/12/15.
 * 探究父类静态代码块、父类非静态代码块、父类构造方法、子类静态代码块、子类非静态代码块、子类构造方法执行顺序
 * 分析：所以 父类静态代码块->子类静态代码块->父类非静态代码块->父类构造方法->子类非静态代码块->子类构造方法
 * Console：
 father static
 son static
 father nostatic1
 father nostatic2
 create father
 son nostatic
 create son
 */
class Father{
    {
        System.out.println("father nostatic1");
    }
    static {
        System.out.println("father static");
    }
    public Father(){
        System.out.println("create father");
    }
    {
        System.out.println("father nostatic2");
    }
}
class Son extends Father{
    {
        System.out.println("son nostatic");
    }
    static {
        System.out.println("son static");
    }
    public Son(){
        System.out.println("create son");
    }
}
public class ExcuOrder {
    public static void main(String[] args){
        Son son = new Son();
    }
}
