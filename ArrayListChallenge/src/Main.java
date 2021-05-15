import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9769584563");


    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit)
        {
            System.out.println("\nEnter action: (6 to show available options)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone()
    {
        System.out.println("***********************");
        System.out.println("Starting Phone...");
        System.out.println("***********************");
    }

    private static void printActions()
    {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - To shutdown\n" +
                "1 - To print contacts\n" +
                "2 - To add a new contact\n" +
                "3 - To update an existing contact\n" +
                "4 - To remove an existing contact\n" +
                "5 - Query if an existing contact exists\n" +
                "6 - To print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void addNewContact()
    {
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact added:\nName: " + name +
                    ", phone: " + phone);
        }else{
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateContact()
    {
        System.out.println("Enter the contact to update: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter New Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact))
        {
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating Record.");
        }
    }

    private static void removeContact()
    {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

       if( mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully Deleted.");
        }else{
           System.out.println("Error deleting contact.");
       }
    }

    private static void queryContact()
    {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() +
                " Phone Number: " + existingContactRecord.getPhoneNumber());
    }

}
