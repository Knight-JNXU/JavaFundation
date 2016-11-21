package MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/21.
 */
public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("input:");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(inputStr.getBytes());
        String outputStr = new String(md5.digest());
        System.out.println("output:");
        System.out.println(outputStr);
    }
}
