package Lesson16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoDirectoryClass {
    public static void main(String[] args) {
        File ThuMuc = new File("src/Lesson16/Books");
        ThuMuc.mkdirs();

        System.out.println(ThuMuc.exists());
        System.out.println(ThuMuc.isDirectory());
        System.out.println(ThuMuc.length());

        FileWriter myBook = null;
        FileWriter myBook02 = null;
        try {
            myBook = new FileWriter("src/Lesson16/Books/myBook.txt");
            myBook.write("1" + "\n");
            myBook.write("2");
            myBook.close();
            myBook02 = new FileWriter("src/Lesson16/Books/myBook02.txt");
            myBook02.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        if(ThuMuc.isDirectory()){
            String[] dirContents = ThuMuc.list();
            for (int i = 0; i < dirContents.length; i++){
                System.out.println(dirContents[i]);
            }
        }
    }

}
