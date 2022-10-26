package Lesson16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoWriteFileClass {
    public static void main(String[] args) {
        try {
            FileWriter fileHello = new FileWriter("src/Lesson16/image/Hello.txt");    /*tao doi tuong fileHello dai dien cho file Hello.txt*/
            BufferedWriter cache = new BufferedWriter(fileHello);    /*tao bo nho dem tăng hiệu quả của thao tác ghi dữ liệu*/
            cache.write("Hello! My name is Tung");
            cache.close();

            BufferedReader readFileHello = new BufferedReader(new FileReader("src/Lesson16/image/Hello.txt"));
            String line = null;
            while ((line = readFileHello.readLine()) != null){
                System.out.println(line);
            }
            readFileHello.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
