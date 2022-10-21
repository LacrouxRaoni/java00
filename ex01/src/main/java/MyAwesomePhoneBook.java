import services.ContactService;
import services.PhoneBookService;

import java.util.Scanner;

public class MyAwesomePhoneBook {
    public static void main(String[] args) {
        int option;

         System.out.println("WELCOME TO MY AWESOME PHONE BOOK!");
        while (true){
            displayMenu();
            option = getValue();
            if (option == 0)
                break ;
            else if (option > 0){
                listMenuOption(option);
            }
        }
    }

    private static void listMenuOption(int option) {
        if (option == 1){
            ContactService.addContact();
        } else{
            PhoneBookService phoneBookService = new PhoneBookService();
            phoneBookService.showList();
        }
    }

    private static int getValue() {
        Scanner sc = new Scanner(System.in);
        int menu;

        menu = sc.nextInt();
        if (menu < 0 || menu > 2)
            System.out.println("Invalid option");
        else
            return menu;
        return -1;
    }

    private static void displayMenu() {
        System.out.println("Please select:");
        System.out.println("1: ADD");
        System.out.println("2: SEARCH");
        System.out.println("0: EXIT");
        System.out.print("Option: ");
    }
}
