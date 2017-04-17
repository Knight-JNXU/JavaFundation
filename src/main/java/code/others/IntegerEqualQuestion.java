package code.others;

/**
* @author knight
* @createtime : 下午1:16:15
* @description : 
* @result : 
*/
public class IntegerEqualQuestion{
    public static void main(String[] args){
        int start = -129;
        int end = 128;
        Integer temp1;
        Integer temp2;
        for(int i=start; i<=end; i++){
            temp1 = i;
            temp2 = i;
            System.out.println("new Integer(" + i + "):" + (temp1==temp2));
        }
    }
   
}
