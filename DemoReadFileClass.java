package Lesson16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DemoReadFileClass {
    public static void main(String[] args) {
        try {
            File inFile = new File("src/Lesson16/image/Hello.txt");
            FileReader f = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(f);
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}