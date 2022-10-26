package Lesson16.ToCreateACopy;

import java.io.*;

public class CreateACopyClass {
    void toCreateAFileCopy(String pathLine){
        try {
            FileReader fReader = new FileReader(pathLine);  /*lam gi thi mo file ra truoc da*/
            BufferedReader cache = new BufferedReader(fReader); /*tao vung nho dem cho chay muot hon thoi*/

            FileWriter fWriter = new FileWriter("src/Lesson16/ToCreateACopy/BookShelf/myCopy");
            BufferedWriter cache02 = new BufferedWriter(fWriter);

            int c;
            while((c = cache.read()) != -1){    /*ASCII tra ve -1 khi khong doc duoc ki tu*/
                cache02.write((char) c);    /*ep kieu tu integer(ASCII) sang character*/
            }

            cache.close();
            cache02.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
