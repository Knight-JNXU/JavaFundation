package code0;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Knight_JXNU on 2016/11/25.
 * 探究在写文件时抛出异常被写的文件会出现什么情况
 * result：
 * 写入失败，期间试图写入的东西没有被写入文件
 */
public class WriteFileThrowException {
    private void writeFile() throws Exception{
        FileOutputStream out = null;
        try {
            String filePath = "E:/AtomicType.txt";
            File file = new File(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            out  = new FileOutputStream(file, true);
            out.write("AtomicType".getBytes("utf-8"));
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            out.close();
        }
    }

    @Test
    public void test(){
        try {
            writeFile();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
