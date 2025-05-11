package app;

import service.ContactService;
import util.ConsoleStyle;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactService service = new ContactService();
        boolean run = true;

        while (run) {
            ConsoleStyle.header("Simple Contact Manager");
            System.out.println(ConsoleStyle.CYAN + "1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit" + ConsoleStyle.RESET);
            System.out.print("Choose option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": service.addContact(); break;
                case "2": service.viewContacts(); break;
                case "3": service.updateContact(); break;
                case "4": service.deleteContact(); break;
                case "5": run = false; ConsoleStyle.info("Exiting..."); break;
                default: ConsoleStyle.error("Invalid Option!");
            }
        }
    }
}
