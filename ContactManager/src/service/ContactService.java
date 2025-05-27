package service;

import model.Contact;
import util.ConsoleStyle;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addContact() {
        ConsoleStyle.header("Add Contact");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));
        ConsoleStyle.success("Contact added successfully!");
    }

    public void viewContacts() {
        ConsoleStyle.header("Contact List");
        if (contacts.isEmpty()) {
            ConsoleStyle.info("No contacts found.");
            return;
        }

        int i = 1;
        for (Contact c : contacts) {
            System.out.println("[" + i++ + "] " + c);
        }
    }

    public void updateContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter contact number to update: ");
        String input = sc.nextLine();
        try {
            int index = Integer.parseInt(input);
            if (index < 1 || index > contacts.size()) throw new IndexOutOfBoundsException();

            Contact c = contacts.get(index - 1);
            System.out.print("Enter New Name: ");
            c.setName(sc.nextLine());
            System.out.print("Enter New Phone: ");
            c.setPhone(sc.nextLine());
            System.out.print("Enter New Email: ");
            c.setEmail(sc.nextLine());

            ConsoleStyle.success("Contact updated successfully.");
        } catch (Exception e) {
            ConsoleStyle.error("Invalid input. Try again.");
        }
    }

    public void deleteContact() {
        viewContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter contact number to delete: ");
        String input = sc.nextLine();
        try {
            int index = Integer.parseInt(input);
            if (index < 1 || index > contacts.size()) throw new IndexOutOfBoundsException();

            contacts.remove(index - 1);
            ConsoleStyle.success("Contact deleted successfully.");
        } catch (Exception e) {
            ConsoleStyle.error("Invalid input. Try again.");
        }
    }
}
