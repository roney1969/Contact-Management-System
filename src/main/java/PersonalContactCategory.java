import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonalContactCategory implements IContactCategory {
    ArrayList<Contact> personalContactList = new ArrayList<Contact>;
    HashMap<String, Contact> personalContactMap = new HashMap<String, Contact>();

    @Override
    public void addContact(String name, String email, int phoneNumber) {
        Contact contact = new Contact(name, email, phoneNumber);
        personalContactList.add(contact);
        personalContactMap.put(name, contact);
    }

    @Override
    public void removeContact(String name) {
        Contact contact = personalContactMap.get(name);
        personalContactList.remove(contact);
    }

    @Override
    public void viewContacts() {
        for (Contact myContact : personalContactList) {
            System.out.println(myContact.getName() + ", " + myContact.getEmail() + ", " + myContact.getPhoneNumber());
        }
    }

    @Override
    public void searchContacts(String name) {
        Contact myContact = personalContactMap.get(name);
        System.out.println(myContact.getName() + ", " + myContact.getEmail() + ", " + myContact.getPhoneNumber());
    }
}