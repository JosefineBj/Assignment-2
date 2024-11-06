import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner feedScanner = new Scanner(System.in);
        Passenger[] passengerArray;
        ManifestSkyBox system = new ManifestSkyBox();
        String command;
        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Insert passenger");
            System.out.println("2. Remove passenger");
            System.out.println("3. Switch seats");
            System.out.println("4. Rename passenger");
            System.out.println("5. Count passengers");
            System.out.println("6. Print passenger manifest");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            command = feedScanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("What is the passenger's name? ");
                    String name = feedScanner.nextLine();
                    System.out.print("What is the passenger's age? ");
                    int age = Integer.parseInt(feedScanner.nextLine());
                    system.insertPassenger(name, age);
                    break;
                case "2":
                    System.out.print("Enter seat number to remove passenger: ");
                    int removeSeat = Integer.parseInt(feedScanner.nextLine());
                    System.out.print("Enter passenger's name to remove: ");
                    system.removePassenger(removeSeat);
                    break;
                case "3":
                    System.out.print("Enter first seat number: ");
                    int seat1 = Integer.parseInt(feedScanner.nextLine());
                    System.out.print("Enter second seat number: ");
                    int seat2 = Integer.parseInt(feedScanner.nextLine());
                    system.switchSeats(seat1, seat2);
                    break;
                case "4":
                    System.out.print("Enter seat number to rename passenger: ");
                    int renameSeat = Integer.parseInt(feedScanner.nextLine());
                    System.out.print("Enter new passenger name: ");
                    String newName = feedScanner.nextLine();
                    system.renamePassenger(renameSeat, newName);
                    break;
                case "5":
                    system.countPassengers();
                    break;
                case "6":
                    system.printPassengerManifest();
                    break;
                case "7":
                    System.out.println("< Program terminated >");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (!command.equals("7"));

        feedScanner.close();
    }
}
