package services;

import entities.ContactEntity;
import entities.PhoneBookEntity;

import java.util.List;

public class PhoneBookService {

    private static PhoneBookEntity phoneBook;

    public PhoneBookService() {
    }

    public static void printHeaderTable() {
        System.out.print(PhoneBookEntity.columCustomize("Index") + "|");
        System.out.print(PhoneBookEntity.columCustomize("Name") + "|");
        System.out.print(PhoneBookEntity.columCustomize("Last Name") + "|");
        System.out.print(PhoneBookEntity.columCustomize("Nickname") + "|\n");
    }
}
