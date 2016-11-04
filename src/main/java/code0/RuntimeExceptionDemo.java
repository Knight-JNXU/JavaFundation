package code0;

/**
 * Created by Knight_JXNU on 2016/10/11.
 * unchecked 、checked exception
 * runtime exception:
 * NullPointerException、ArrayIndexOutOfBoundsException、NumberFormatException
 * non-runtime exception:
 * IOException、EOFException、FileNotFoundException、SQLException
 */
public class RuntimeExceptionDemo {

//    public static void test2(){
//        try {
//            throw new Exception();
//        }finally {
//
//        }
//    }
    public static void test3() throws Exception{
        try {
            throw new Exception();
        }finally {

        }
    }

    private static void test(int[] arr){
        for(int i=0; i<arr.length; i++){
            try {
                if(arr[i]%2 == 0){
                    //因为 NullPointerException 属于 unchecked exception 即 运行时异常，
                    //所以不需要 catch exception 或 throws exception
                    throw new NullPointerException();
                }else{
                    System.out.print(i);
                }
            }finally {
                System.out.print("e");
            }
        }
    }

    public static void main(String[] args){
        try {
            test(new int[]{0, 1, 2, 3, 4, 5});
        }catch (Exception e){
            System.out.print("E");
        }
    }
}
