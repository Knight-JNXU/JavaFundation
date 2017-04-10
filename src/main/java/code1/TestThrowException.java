package code1;

import junit.framework.TestCase;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsNull;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.fail;


/**
* @author knight
* @createtime : 下午3:53:42
* @description : junit处理抛出异常的方法
* @result :
*/
public class TestThrowException{

    @Test(expected = NullPointerException.class)
    public void testExceptionMessage0(){
            String str = null;
            if(str.equals(""));
    }

    @Test
    public void testExceptionMessage1(){
        try {
            String str = null;
            if(str.equals(""));
            fail("Expected an NullPointerException to be thrown");
        }catch (NullPointerException anNullPointerException){
            System.out.println(anNullPointerException.getMessage());
            Assert.assertThat(anNullPointerException.getMessage(), is(nullValue()));
        }

    }

    @Test
    public void testExceptionMessage2(){
        try {
            new ArrayList<Object>().get(0);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
            System.out.println(anIndexOutOfBoundsException.getMessage());
            Assert.assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
        }
    }

    @Rule
    public ExpectedException shouldThrown = ExpectedException.none();
    @Test
    public void testExceptionMessage3() throws NullPointerException{
        String str = null;
        shouldThrown.expect(NullPointerException.class);
        shouldThrown.expectMessage(new IsNull<String>());
        if(str.equals(""));
    }
    @Test
    public void testExceptionMessage4() throws IndexOutOfBoundsException{
        shouldThrown.expect(IndexOutOfBoundsException.class);
        shouldThrown.expectMessage("Index: 0, Size: 0");
        new ArrayList<Object>().get(0);
    }
}


