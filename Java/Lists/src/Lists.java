import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lists {
    private static Scanner scanner = new Scanner(System.in);
    private static PhoneList phoneList = new PhoneList();

    public static void main(String[] args) {
        PrintInstructions();

        boolean quit = false;
        while (!quit) {
            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 0:
                        PrintInstructions();
                        break;
                    case 1:
                        phoneList.ListOfRecords();
                        break;
                    case 2:
                        AddNewContact();
                        break;
                    case 3:
                        UpdateContact();
                        break;
                    case 4:
                        FindContact();
                        break;
                    case 5:
                        RemoveContact();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Try one more time.");
                PrintInstructions();
                String readException = scanner.nextLine();
            }
        }
    }

    private static void AddNewContact() {
        System.out.print("Enter name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        if (phoneList.FindRecord(name) >= 0) {
            System.out.println(name + " already exists in the list");
            return;
        }

        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        phoneList.AddNewRecord(newContact);
    }

    private static void UpdateContact() {
        System.out.print("Enter old Name: ");
        scanner.nextLine();
        String oldName = scanner.nextLine();
        Contact oldContact = phoneList.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Enter new Name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new Phone: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        phoneList.ModifyRecord(oldContact, newContact);
    }

    public static void RemoveContact() {
        System.out.print("Enter contact Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        Contact removeContact = phoneList.queryContact(name);
        if (phoneList.queryContact(name) == null) {
            System.out.println("Contact not found");
            return;
        }

        if (phoneList.DeleteRecord(removeContact)) {
            System.out.println("Contact was removed");
        } else {
            System.out.println("Error occurs");
        }
    }

    public static void FindContact() {
        System.out.print("Enter contact Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        Contact contact = phoneList.queryContact(name);
        if (phoneList.queryContact(name) == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println(contact.getPhoneNumber());
    }

    public static void PrintInstructions() {
        System.out.println("O-Print Instructions");
        System.out.println("1-List of records");
        System.out.println("2-Add new record");
        System.out.println("3-Modify record");
        System.out.println("4-Find record");
        System.out.println("5-Delete record");
        System.out.println("6-Exit");
        System.out.print("Select your option: ");
    }
}