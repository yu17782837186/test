package cn.com.exception;

import java.io.FileReader;
import java.io.IOException;

public class TestException3 {
    public static void main(String[] args) throws IOException{
        testFile();
    }
    public static void testFile() throws IOException {
        FileReader f = new FileReader("d:/a.txt");
        char a = (char)f.read();
        System.out.println(a);
        f.close();
    }
}
