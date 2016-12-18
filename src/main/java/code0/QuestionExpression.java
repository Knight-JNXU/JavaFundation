package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/12/18.
 * 探究问号表达式
 * console:
 * true
 * 分析：
 * 表达式格式：expression?result1:result2
 * 当expression为真的时候，返回result1，否则返回result2
 */
public class QuestionExpression {
    @Test
    public void test(){
        System.out.println(true?1:0);
    }
}
