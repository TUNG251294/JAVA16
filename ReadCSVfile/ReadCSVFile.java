package Lesson16.ReadCSVfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    void toReadFile(String path){
        try {
            FileReader fReader = new FileReader(path);
            BufferedReader cache = new BufferedReader(fReader);
            String line;
            while((line = cache.readLine()) != null){
                for (String s: line.split(",")){
                    System.out.println(s);
                }
            }

//            int c;
//            while((c = cache.read()) != -1){
//                System.out.println((char)c);
//                }

            cache.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadCSVFile csv = new ReadCSVFile();
        csv.toReadFile("src/Lesson16/image/file.csv");
    }
}
