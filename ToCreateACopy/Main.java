package Lesson16.ToCreateACopy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a path to file");
        String path = scanner.nextLine();
        CreateACopyClass createACopy = new CreateACopyClass();
        createACopy.toCreateAFileCopy(path);
    }
}
