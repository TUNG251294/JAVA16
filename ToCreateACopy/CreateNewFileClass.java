package Lesson16.ToCreateACopy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFileClass {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("src/Lesson16/ToCreateACopy/BookShelf");
            f.mkdirs();

            FileWriter fWriter = new FileWriter("src/Lesson16/ToCreateACopy/BookShelf/my");
            BufferedWriter cache = new BufferedWriter(fWriter); /*tao vung nho dem, va dong lai luon*/
            cache.write("Hello" + "\n");
            cache.write("My name is Tung" + "\n");
            cache.write("I come from DongNai in VietNam" + "\n");
            cache.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
