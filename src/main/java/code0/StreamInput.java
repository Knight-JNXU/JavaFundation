package code0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * java 使用 inputstream 实现输入
 */
public class StreamInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("s:" + s);
        String s2 = br.readLine();
        System.out.println("s:" + s2);
    }
}
