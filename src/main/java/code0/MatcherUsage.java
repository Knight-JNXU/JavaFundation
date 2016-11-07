package code0;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Knight_JXNU on 2016/11/7.
 */
public class MatcherUsage {
    @Test
    public void test(){
        String line = "This order was placed for QT3000! OK?";
        String patternStr = "(\\D*)(\\d+)(.*)";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher);
        //如果 matcher 中有匹配值，find 返回 true，否则 返回 false
        System.out.println(matcher.find());
        //Matcher groupCount 返回匹配值的数量
        System.out.println(matcher.groupCount());
        //group(n) 返回第 n+1 个匹配的值，n 省略的情况下默认返回第一个
        System.out.println(matcher.group(2));
    }
}
