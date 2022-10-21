package services;

import entities.ContactEntity;
import entities.PhoneBookEntity;

import java.util.List;

public class PhoneBookService {

    private static PhoneBookEntity phoneBook;

    public PhoneBookService() {
    }

    public static void showList(){
        String list = phoneBook.getContacts().get(0).getFirstName();
        System.out.println(list);
    }

}
