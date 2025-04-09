package DataStructures;


//On this example I am using the LinkedList class already built in on Java
//

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList_1 {

    //method which will print the LinkedList in a visual way
    //Output: [10] --> [20] --> [30]
    private static void printList(LinkedList<Integer> listExample) {
        for (int i = 0; i < listExample.size(); i++) {
            System.out.print("[" + listExample.get(i) + "]");
            if (i < listExample.size() - 1) {
                System.out.print(" --> ");
            }
        }
    }






    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);




        boolean running = true;
        while (running) {
            System.out.println("\nMenu");
            System.out.println("1. Add a new head");
            System.out.println("2. See the linked list");
            System.out.println("3. Quit");
            System.out.print("Option: ");

            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter your new head: ");
                        int newHead = scanner.nextInt();
                        list.addFirst(newHead);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("This is your current LinkedList");
                        printList(list);
                        System.out.println();
                        break;
                    case 3:
                        running=false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("Option not available or invalid input. Please enter a proper number.");
                        break;


                }

            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Option not available");
                continue;
            }
            scanner.close();






        }




    }





}
