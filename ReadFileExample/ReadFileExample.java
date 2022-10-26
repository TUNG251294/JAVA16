package Lesson16.ReadFileExample;

import java.io.*;

public class ReadFileExample {
    void readFileText(String pathLine){
        try{
        File f = new File(pathLine);
        if(!f.exists()){
            throw new FileNotFoundException();
        } else {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr); /*tao bo nho dem*/
            String line = null;
            int Sum = 0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                Sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum: " + Sum);
        }

        } catch(IOException e){
            System.err.println("file k ton tai hoac co loi");;
        }
    }
}
