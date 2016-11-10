package base_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Knigh on 2016/10/31.
 */
public class Client {
    public static void main(String[] args){
        Socket socket = null;
        try {
            //获取socket
            socket = new Socket(Commons.serviceIP, Commons.clientPort);
            //客户端的输出流
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            while (flag){
                String inputStr = scanner.nextLine();
                //将信息写入流，把数据发送给服务器
                outputStream.write(inputStr.getBytes());
                if(inputStr.equals("byebye")){
                    flag = false;
                    outputStream.close();
                }
            }
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int length = inputStream.read(buffer);
            String str = new String(buffer, 0, length);
            System.out.println(Commons.clientStr+str);
            inputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
