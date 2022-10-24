package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhoneBookEntity {

    private final static List<ContactEntity> contacts = new ArrayList<>();

    public PhoneBookEntity() {
    }


    public List<ContactEntity> getContacts() {
        return contacts;
    }
    public static void saveContact(ContactEntity contactEntity) {
        if (contacts.size() == 7){
            contacts.add(7, contactEntity);
        } else if (contacts.size() < 7)
            contacts.add(contactEntity);
    }

    public static void show() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Contact name: ");
        String name = sc.nextLine();
        for (ContactEntity c : contacts){
            if (c.getFirstName().contains(name)){
                toString(c, contacts.indexOf(c));
            }
        }
    }

    private static void toString(ContactEntity c, int index) {

        String name = String.valueOf(columSize(c.getFirstName()));
        System.out.print("         " + (index + 1) + "|");
        System.out.print(name + "|");
        System.out.print(Arrays.toString(new String[]{columSize(c.getLastName())}) + "|");
        System.out.print(Arrays.toString(new String[]{columSize(c.getNickname())}) + "|");
    }

    private static String columSize(String word) {
        int size;
        StringBuilder line = null;

        size = 10 - word.length();

        for (int i = 0; i < size; i++){
            line.append(' ');
        }
        System.out.println(line);
        line.append(word);
        return line.toString();
    }
}
