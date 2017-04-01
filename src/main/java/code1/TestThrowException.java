//package code1;
//
//import static junit.framework.TestCase.fail;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//import org.hamcrest.CoreMatchers;
//
//import junit.framework.TestCase;
//
///**
//* @author knight
//* @createtime : 下午3:53:42
//* @description : junit处理抛出异常的方法
//* @result : 
//*/
//public class TestThrowException{
//    @Test
//    public void testExceptionMessage0(){
//        try{
//            String str = null;
//            if(str.equals(""));
////            Assert.fail("It is a java.lang.NullPointerException!");
//            TestCase.fail();
//        }catch (NullPointerException nullPointerException){
////            nullPointerException.printStackTrace();
//            System.out.println(nullPointerException.getMessage());
//            Assert.assertThat(nullPointerException.getMessage(), CoreMatchers.is("null"));
//        }
//    }
//}
//
//
