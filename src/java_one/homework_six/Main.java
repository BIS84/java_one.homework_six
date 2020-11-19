package java_one.homework_six;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {



    public static void main(String[] args) {

        // Task 1 create new files

        Path path1 = Paths.get("D://java//java_one//lesson_6//fileInput1.txt");
        try {
            String str = "To create a file in Java, you can use the createNewFile() method.";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path1, bs);
            System.out.println("File " + path1 + " created");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Path path2 = Paths.get("D://java//java_one//lesson_6//fileInput2.txt");
        try {
            String str = "\nThis method returns a boolean value: true if the file was successfully created,\n" +
                    "and false if the file already exists.";
            byte[] bs = str.getBytes();
            Path writtenFilePath = Files.write(path2, bs);
            System.out.println("File " + path2 + " created");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Task 2 splicing files

        try {

            FileInputStream fis = new FileInputStream("D://java//java_one//lesson_6//fileInput1.txt");

            int i = 0;
            String s = "";

            while((i=fis.read()) !=-1) {

                s = s + String.valueOf((char)i);

            }

            FileOutputStream fos = new
                    FileOutputStream("D://java//java_one//lesson_6//fileOutput.txt");
            byte[] b = s.getBytes();

            fos.write(b);
            fos.close();
            fis.close();

            System.out.println("The file \"fis\" is attached to the file \"fos\"");

        } catch(Exception e){
            System.out.println(e);
        }

        try {

            FileInputStream fis = new FileInputStream("D://java//java_one//lesson_6//fileInput2.txt");

            int i = 0;
            String s = "";

            while((i=fis.read()) !=-1) {

                s = s + String.valueOf((char)i);

            }

            FileOutputStream fos = new
                    FileOutputStream("D://java//java_one//lesson_6//fileOutput.txt", true);
            byte[] b = s.getBytes();

            fos.write(b);
            fos.close();
            fis.close();

            System.out.println("The file \"fis\" is attached to the file \"fos\"");

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
