//Phone Book:
//Create a HashMap<String, String> to store names and phone numbers.
//Implement add, lookup, update, and delete operations.


package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasMap {


    public static void main(String[] args) {
        HashMap<String, Integer> phoneNumbers = new HashMap();
        Scanner scanner = new Scanner(System.in);

        phoneNumbers.put("ana", 772867648);

        boolean running = true;

        while (running) {
            System.out.println("Contact List System");
            System.out.println("1) Add a new contact");
            System.out.println("2) Find a contact");
            System.out.println("3) Update a contact");
            System.out.println("4) Delete a contact");
            System.out.println("5) Exit the system");
            System.out.print("Please enter the number of your choice: ");

            int option;
            try {
                option = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {
                System.out.print("invalid option. Try again please!");
                System.out.print("");
                scanner.nextLine();
                continue;
            }

            switch (option){

                case 1:
                    System.out.print("Please provide the name of this contact");





            }


        }


    }

}
