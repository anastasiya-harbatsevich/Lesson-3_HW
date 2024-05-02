package org.example.homework9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contactList = new ArrayList<>();
        contactList.add(Contact.createContact("bob", "8745865486"));
        contactList.add(Contact.createContact("rob", "3456543565"));
        contactList.add(Contact.createContact("mob", "6543456143"));
        contactList.add(Contact.createContact("dob", "1346654334"));
        System.out.println(contactList.get(1).name);
        MobilePhone mobilePhone = new MobilePhone("89843059830", contactList);
        boolean checkContact = mobilePhone.addNewContact(Contact.createContact("bob", "8745865486"));
        System.out.println(checkContact);
        mobilePhone.printContacts();
        System.out.println(mobilePhone.findContact("dob"));
        System.out.println(mobilePhone.findContact("vob"));
    }
}
