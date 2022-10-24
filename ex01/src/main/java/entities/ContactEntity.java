package entities;

public class ContactEntity {

    private String firstName;
    private String lastName;
    private String nickname;
    private String phoneNumber;
    private String darkestSecret;

    public ContactEntity() {
    }
    public ContactEntity(String firstName, String lastName, String nickname, String phoneNumber, String darkestSecret) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.darkestSecret = darkestSecret;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDarkestSecret() {
        return darkestSecret;
    }
}
