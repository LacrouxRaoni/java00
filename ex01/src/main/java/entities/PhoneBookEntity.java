package entities;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookEntity {
    private final List<ContactEntity> phoneBook = new ArrayList<>();

    public PhoneBookEntity() {
    }
    public List<ContactEntity> getPhoneBook() {
        return phoneBook;
    }

    public void saveContact(ContactEntity contactEntity) {
        phoneBook.add(contactEntity);
    }
}
