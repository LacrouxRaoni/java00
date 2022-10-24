package services;

import entities.ContactEntity;
import entities.PhoneBookEntity;

import java.util.Scanner;

public class ContactService {

    static PhoneBookEntity phoneBook = new PhoneBookEntity();
    public static void addContact() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ADD: ");
        System.out.print("Fist name: ");
        String name = sc.nextLine();
        if (isEmpty(name))
            return ;
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        if (isEmpty(lastName))
            return ;
        System.out.print("Nickname: ");
        String nickName = sc.nextLine();
        if (isEmpty(nickName))
            return ;
        System.out.print("Phone Number(Numbers only): ");
        String phoneNumber = sc.nextLine();
        if (!isNumber(phoneNumber)){
            return ;
        }
        System.out.print("Darkest Secret: ");
        String secret = sc.nextLine();
        if (isEmpty(secret)){
            return ;
        }
        ContactEntity contactEntity = new ContactEntity(name, lastName, nickName, phoneNumber, secret);
        PhoneBookEntity.saveContact(contactEntity);
    }
    private static boolean isNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d+"))
            return true;
        System.out.println("Invalid argument");
        return false;
    }

    private static boolean isEmpty(String value) {
        if (value.isEmpty()) {
            System.out.println("Invalid Option");
            return true;
        }
        return false;
    }
}
