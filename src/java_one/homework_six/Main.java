package java_one.homework_six;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import static java.lang.Long.valueOf;

public class Main {



    public static void main(String[] args) {

        // create new files

        Path path1 = Paths.get("D://java//java_one//lesson_6//fileInput1.txt");
        try {
            String str = "To create a file in Java, you can use the createNewFile() method.";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path1, bs);
            System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Path path2 = Paths.get("D://java//java_one//lesson_6//fileInput2.txt");
        try {
            String str = "This method returns a boolean value: true if the file was successfully created,\nand false if the file already exists.";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path2, bs);
            System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
