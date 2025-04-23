package fileExercise;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;



public class FilePrepend {


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String filePath = "/Users/luckas/Developer/Spring 2025/CS 1322 JAVA/Midterm Lab Questions Review/Questions/src/fileExercise/notes";
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            Scanner fileScanner2 = new Scanner(file);

            while(fileScanner.hasNextLine()){
                //need to create a string variable which will be used to stored and print the line from the file
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            System.out.println("");
            System.out.print("Enter a message to prepend: ");
            String userNewLine = scanner.nextLine();


            try (FileWriter writer = new FileWriter(filePath,true)) {
                writer.write(userNewLine);
                System.out.print("File was written successfully! :0");
                System.out.println("");


            }catch (IOException e){
                e.printStackTrace();
            }

            System.out.println("File with the changes: ");

            while (fileScanner2.hasNextLine()){
                String lines = fileScanner2.nextLine();
                System.out.println(lines);
            }






        }catch (Exception e){
            System.out.print("The file could not be read, for the reason: " + e.getMessage());

        }





    }





}
