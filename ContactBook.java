package Assignment;

import java.util.*;
class Contact {
    String name;
    String email;
    String PhoneNumber;

    public Contact(String name, String email, String PhoneNumber) {
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

}
public class ContactBook {
    static LinkedList<Contact> LList = new LinkedList<>();

    static void AddContact(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String Name = sc.nextLine();


        System.out.println("Enter Email Address: ");
        String Email = sc.nextLine();


        System.out.println("Enter Phone Number of the recipient: ");
        String PhoneNumber = sc.nextLine();
        LList.add(new Contact(Name, Email, PhoneNumber));

    }

    static void DeleteContact(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact that wants to be deleted: ");
        String result = scan.next();

        for (Contact c: LList){

            if(result.equals(c.name)){
                LList.remove(c);
                System.out.println("Contact has been deleted!");
            }

            else if (LList.indexOf(c) == LList.size() - 1) {
                System.out.println("Incorrect contact, please input a viable contact name: ");
            }

        }

    }

    static void EmailSearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String input = scanner.next();

        for (Contact c: LList){

            if (input.equals(c.email)){
                System.out.println("Email founded, the email is " + c.email);
            }

            else if (LList.indexOf(c) == LList.size() - 1) {
                System.out.println("The email is not founded, please try again: ");
            }

        }

    }

    static void PrintList(){
        for (Contact b: LList){
            System.out.println("Name: " + b.name);
            System.out.println("Email: " + b.email);
            System.out.println("Phone number: " + b.PhoneNumber);
        }
    }

    static void SearchList(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to search for: \n" +
                            "1. Name\n" +
                            "2. Email\n" +
                            "3. Phone number\n" +
                            "Choose Option: ");

        int output = scan.nextInt();

        if (output == 1){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name that wants to be searched: ");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.name)){
                    System.out.println("name founded, NAME = " + c.name);
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The name is not founded, please try again: ");
                }

            }
        }
        else if (output == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Email that wants to be searched: ");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.email)){
                    System.out.println("Email founded, EMAIL " + c.email);
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The email is not founded, please try again: ");
                }

            }
        }
        else if (output == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter phone number: \n");
            String input = scanner.next();

            for (Contact c: LList){

                if (input.equals(c.PhoneNumber)){
                    System.out.println("Phone number founded, NUMBER =  " + c.PhoneNumber) ;
                }

                else if (LList.indexOf(c) == LList.size() - 1) {
                    System.out.println("The phone number is not founded, please try again: ");
                }

            }
        }

        else {
            System.out.println("That option is unavailable, please enter a valid number (from 1 to 3): ");
        }


    }

    public static void main(String[] args) {

        boolean condition = true;

        while (condition) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n==========Menu=========\n" +
                    "1. Add Contact\n" +
                    "2. Delete Contact\n" +
                    "3. Email Search\n" +
                    "4. Print List\n" +
                    "5. Search\n" +
                    "6. Quit Program\n" +
                    "=======================\n" +
                    "Choose Option: ");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    AddContact();
                    break;
                case 2:
                    DeleteContact();
                    break;
                case 3:
                    EmailSearch();
                    break;
                case 4:
                    PrintList();
                    break;
                case 5:
                    SearchList();
                    break;
                case 6:
                    System.out.println("\nExiting Program!");
                    condition = false;
                    break;

            }
        }
    }
}
