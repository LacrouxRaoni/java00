package entities;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookEntity {

    private final static List<ContactEntity> contacts = new ArrayList<>();

    public PhoneBookEntity() {
    }


    public List<ContactEntity> getContacts() {
        return contacts;
    }
    public static void saveContact(ContactEntity contactEntity) {
        contacts.add(contactEntity);
    }

    public static void show() {
        for (ContactEntity c : contacts){
            System.out.println(c.getIndex());
        }
    }
}
