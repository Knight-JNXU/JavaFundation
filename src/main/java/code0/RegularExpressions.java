package code0;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Knight_JXNU on 2016/11/7.
 * java 正则表达式的应用
 * 参考资料：菜鸟教程 http://www.runoob.com/java/java-regular-expressions.html
 */
public class RegularExpressions {
    @Test
    public void test(){
        // '\' 转义字符
        System.out.println("转义匹配'(' : "+MatchTimes("\\(", "(sdklfjalj)"));
        // '^' 以...开头的匹配
        System.out.println("以'('开头匹配 : "+MatchTimes("^\\(", "s(dklfjalj)"));
        // '$' 以...结尾的匹配
        System.out.println("以'j'结尾匹配 : "+MatchTimes("j$", "s(dklfjal)j"));
        // '*' 零次或多次匹配前面的字符或子表达式
        System.out.println("匹配za(零个或多个a) : "+MatchTimes("za*", "jfdsalzz"));
        System.out.println("匹配za(零个或多个a) : "+MatchTimes("za*", "jfdsalza"));
        // '+' 1次或多次匹配前面的字符或子表达式
        System.out.println("匹配za(零个或多个a) : "+MatchTimes("za+", "jfdsalz"));
        System.out.println("匹配za(零个或多个a) : "+MatchTimes("za+", "jfdsalza"));
        // '?' 零次或一次匹配前面的字符或子表达式
        System.out.println("匹配0个或1个za : "+MatchTimes("za?", "jfdsalza"));
        // '{n}' n为非负数，正好匹配n次
        System.out.println("匹配2次a : "+MatchTimes("a{2}", "djfalaaj"));
        // '{n,}' 至少匹配n次
        System.out.println("至少匹配2次a : "+MatchTimes("a{2,}", "djfalaajaaahaaaa"));
        // '{n,m}' 至少匹配n次，至多匹配m次
        System.out.println("至少匹配1次a至多匹配2次a : "+MatchTimes("[a]{1,2}", "djfalaajaaahaaaa"));
        System.out.println("至少匹配1次a至多匹配2次a : "+((Pattern.compile("a{1,2}")).matcher("djfljaaahaaaa")).find());
    }

    //统计符合正则表达式 regax 的字符串在 target 上出现的次数
    private int MatchTimes(String regax, String target){
        Pattern p = Pattern.compile(regax);
        Matcher m = p.matcher(target);
        int sum = 0;
        while (m.find()){
            sum++;
        }
        return sum;
    }
}
