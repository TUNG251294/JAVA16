package Lesson16.ReadAndWriteFile;

import java.io.*;

public class ReadAndWriteClass {
    void findMaxAndRead(String pathLine){
        try {
            FileReader fr = new FileReader(pathLine);
            BufferedReader cache = new BufferedReader(fr);  /*tao vung dem*/
            String line;
            int max = Integer.parseInt(cache.readLine());

            while ((line = cache.readLine()) != null){
                if (Integer.parseInt(line) > max){
                    max = Integer.parseInt(line);
                }
            }

            cache.close();  /*tao bo nho dem thi dong lai luon*/
            System.out.println("Max number in file is: " + max);

            FileWriter fWriter = new FileWriter("src/Lesson16/ReadAndWriteFile/Bookcase/result.txt");   /*tao file result.txt*/
            BufferedWriter cache02 = new BufferedWriter(fWriter);
            cache02.write(Integer.toString(max));   /*FileWriter khong in kieu so vao file nen phai chuyen sang kieu String*/
            cache02.close();

        } catch (IOException e){
                e.printStackTrace();
        }
    }
}
