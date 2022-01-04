package DesignPatterns.Builder;

public class Contact {
    private final String name;
    private final String lastName;
    private final int phoneNumber;

    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.lastName = contactBuilder.getLastName();
        this.phoneNumber = contactBuilder.getPhoneNumber();
    }
}
