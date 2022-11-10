package entities;

import services.PhoneBookService;

import java.util.Scanner;

public class PhoneBookEntity {

    private final static ContactEntity[] contacts = new ContactEntity[8];
    private static int index = 0;
    public PhoneBookEntity() {
    }

    public static void saveContact(ContactEntity contactEntity) {
        if (index == 2){
            index = 0;
        }
        contacts[index] = contactEntity;
        index += 1;
    }

    public static void show() {
        if (index < 1){
            System.out.println("There is no contact in list.");
            return ;
        }
        PhoneBookService.printHeaderTable();
        for (int i = 0; i < index; i++){
            toString(contacts[i], i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose contact by index: ");
        int indexS = sc.nextInt();
        if ( index < indexS || indexS < 1) {
            System.out.println("Invalid index.");
        } else {
            System.out.print("First Name: ");
            System.out.println(contacts[indexS - 1].getFirstName());
            System.out.print("Last Name: ");
            System.out.println(contacts[indexS - 1].getLastName());
            System.out.print("Nickname: ");
            System.out.println(contacts[indexS - 1].getNickname());
            System.out.print("Phone Number: ");
            System.out.println(contacts[indexS - 1].getPhoneNumber());
            System.out.print("Darkest Secret: ");
            System.out.println(contacts[indexS - 1].getDarkestSecret());
        }
    }

    private static void toString(ContactEntity c, int index) {

        System.out.println("         " +
                        (index + 1) +
                "|" +
                columCustomize(c.getFirstName()) +
                "|" +
                columCustomize(c.getLastName()) +
                "|" +
                columCustomize(c.getNickname()) + "|"
                );
    }

    public static String columCustomize(String word) {
        int size;

        StringBuilder line = new StringBuilder();
        if (word.length() >= 10){
            line.append(word, 0, 9);
            line.append('.');
        } else {
            size = 10 - word.length();
            line.append(" ".repeat(size));
            line.append(word);
        }
        return line.toString();
    }
}
