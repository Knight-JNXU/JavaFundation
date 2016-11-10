package base_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Knigh on 2016/10/31.
 */
public class Service {

    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            //创建serverSocket
            serverSocket = new ServerSocket(Commons.servicePort, 1, InetAddress.getByName(Commons.serviceIP));
            //获取socket
            socket = serverSocket.accept();
        }catch (Exception e){
            e.printStackTrace();
        }

        while (true){
            try {
                //获取service输入流，从client接收数据
                InputStream inputStream = socket.getInputStream();
                //获取service的的输出流，想client发送数据
                OutputStream outputStream = socket.getOutputStream();
                byte[] buffer = new byte[1024];
                int length = inputStream.read(buffer);
                String str = new String(buffer, 0, length);
                System.out.println(Commons.serviceStr + str);
                if(str.equals(Commons.end)){
                    outputStream.write("disconnect".getBytes());
                    inputStream.close();
                    outputStream.close();
                    socket.close();
                    serverSocket.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
