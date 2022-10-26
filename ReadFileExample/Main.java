package Lesson16.ReadFileExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a path to file");
        String path = input.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
