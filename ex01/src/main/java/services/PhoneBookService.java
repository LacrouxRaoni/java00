package services;


import entities.ContactEntity;
import entities.PhoneBookEntity;

import java.util.List;

public class PhoneBookService {

    PhoneBookEntity phoneBook = new PhoneBookEntity();

    public void showList(){
        List<ContactEntity> list = phoneBook.getPhoneBook();
        for(ContactEntity c : list){
            System.out.println(c.getIndex());
            System.out.println(c.getFirstName());
        }
    }

}
