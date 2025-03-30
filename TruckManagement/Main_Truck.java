import java.util.Scanner;
import java.util.ArrayList;

public class Main_Truck {

    public static void main(String[]args){
        ArrayList<Truck> trucks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Welcome to the Truck Management System!" +
                "\n----------------------------------------");


        while(true){

            System.out.println(
                    """

                            1. Create a new truck
                            2. Remove a truck
                            3. View all trucks
                            4. Exit
                            """);

            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option){

                case 1:
                    scanner.nextLine();
                    System.out.print("Enter truck description: ");
                    String description = scanner.nextLine();

                    Truck newTruck = new Truck(description);
                    trucks.add(newTruck);

                    System.out.println("Truck created with ID: " +newTruck.getId() +  " and description: " +newTruck.getCargo() + "\n");
                    break;

                case 2:
                    System.out.print("Enter truck ID to remove: ");
                    int id = scanner.nextInt();

                    trucks.remove(id);
                    break;

                case 3:
                    System.out.print(trucks);
                    break;


                case 4:
                    System.out.print("System shutting down..");
                    return;

                default:
                    System.out.print("Invalid option. Going back to the Main menu.");
                    break;


            }

            scanner.close();










        }


    }
}
