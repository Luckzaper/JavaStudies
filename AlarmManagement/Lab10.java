import java.util.ArrayList;
import java.util.Scanner;
public class Lab10 {

    public static void main(String[]args){
        ArrayList<Alarm> Alarms= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running =true;

        System.out.println("[Alarm System]");
        while(running){
            System.out.print("1. Create new alarm\n" +
                    "2. View all alarms\n" +
                    "3. Quit\n");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter alarm name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter alarm timer in seconds: ");
                    int sec = scanner.nextInt();
                    Alarm newAlarm = new Alarm(name,sec);
                    Alarms.add(newAlarm);
                    newAlarm.start();
                    System.out.print(newAlarm.toString());
                    break;

                case 2:
                    for(Alarm a: Alarms){
                        System.out.println("Here are all the alarms still running:");
                        if (a.isAlive()){
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Stopping all alarms...");
                    for(Alarm a: Alarms){
                        a.interrupt();
                    }
                    System.out.println("All alarms have been stopped.");
                    System.out.print("Shutting off...");
                    running = false;
                    break;





            }

        }





    }


}
