package org.example.homework9;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    String myNumber;

    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contact, Contact updatedContact) {
        if (findContact(contact) == -1) {
            return false;
        } else {
            contact = updatedContact;
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if (contactIndex == -1) {
            return false;
        } else {
            myContacts.remove(contactIndex);
            return true;
        }
    }

    public int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(contact.name, myContacts.get(i).name)) {
                return i;
            }
        }
        return -1;
    }

    public int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactName.equals(myContacts.get(i).name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex >= 0) {
            return myContacts.get(contactIndex);
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println("Contact List: \n" + i + ". " + myContacts.get(i).name + " -> " + myContacts.get(i).phoneNumber + "\n");
        }
    }
}
