package code0;

/**
 * Created by Knigh on 2016/12/10.
 * 探究 overide 的参数列表是否必须相同
 * result：
 * overide 的参数列表必须不同
 */
public class OverideIsSameParams {
    public void say(){}
    public void say(String str){}
//    public String say(){}  //编译错，overide 的参数列表必须不同

}
