import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Event Budget Planner ---");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Update Budget");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Event Name: ");
                    String name = sc.next();
                    System.out.print("Date: ");
                    String date = sc.next();
                    System.out.print("Venue: ");
                    String venue = sc.next();
                    System.out.print("Budget: ");
                    double budget = sc.nextDouble();
                    EventDAO.insert(new Event(name, date, venue, budget));
                    break;

                case 2:
                    EventDAO.display();
                    break;

                case 3:
                    System.out.print("Enter Event ID to Update: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter New Budget: ");
                    double newB = sc.nextDouble();
                    EventDAO.update(uid, newB);
                    break;

                case 4:
                    System.out.print("Enter Event ID to Delete: ");
                    int did = sc.nextInt();
                    EventDAO.delete(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}

//veni123
