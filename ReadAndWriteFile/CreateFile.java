package Lesson16.ReadAndWriteFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("src/Lesson16/ReadAndWriteFile/Bookcase");
        f.mkdirs();

        try {
            FileWriter bestseller = new FileWriter("src/Lesson16/ReadAndWriteFile/Bookcase/bestseller.txt");
            BufferedWriter cache = new BufferedWriter(bestseller);
            cache.write(9 + "\n");  /*dang nhap kieu chuoi, luu y FileWriter k in ra kieu so vao file*/
            cache.write(4 + "\n");
            cache.write(2 + "\n");
            cache.write(15 + "\n");
            cache.write(3 + "\n");
            cache.write(6 + "\n");
            cache.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
