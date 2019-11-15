package cn.com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("d:/b.txt");
            System.out.println("step1");
            char c = (char)fr.read();
            System.out.println(c);
        }catch(FileNotFoundException e) {
            System.out.println("step2");
            e.printStackTrace();
        }catch(IOException e) {  //子类异常需要在父类异常之前
            e.printStackTrace();
        }finally {
            System.out.println("step3");
            try {
                fr.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
