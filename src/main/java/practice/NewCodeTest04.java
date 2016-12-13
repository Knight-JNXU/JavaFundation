package practice;

/**
 * Created by Knight_JXNU on 2016/12/13.
 * 主要是考for循环的执行顺序
 * Console:
 * ABDCBDCB
 */
public class NewCodeTest04 {
    static boolean out(char c){
        System.out.print(c);
        return true;
    }
    public static void main(String[] args){
        int i=0;
        for(out('A'); out('B')&&(i<2); out('C')){
            i++;
            out('D');
        }
    }
}
