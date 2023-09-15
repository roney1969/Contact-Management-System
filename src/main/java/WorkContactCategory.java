import java.util.ArrayList;
import java.util.HashMap;

public class WorkContactCategory implements IContactCategory{
    ArrayList<Contact> workContactList = new ArrayList<Contact>();
    HashMap<String, Contact> workContactMap = new HashMap<String, Contact>();

    @Override
    public void addContact(String name, String email, int phoneNumber) {
        Contact contact = new Contact(name, email, phoneNumber);
        workContactList.add(contact);
        workContactMap.put(name, contact);
    }

    @Override
    public void removeContact(String name) {
        Contact contact = workContactMap.get(name);
        workContactList.remove(contact);
    }

    @Override
    public void viewContacts() {
        for (Contact myContact : workContactList) {
            System.out.println(myContact.getName() + ", " + myContact.getEmail() + ", " + myContact.getPhoneNumber());
        }
    }

    @Override
    public void searchContacts(String name) {
        Contact myContact = workContactMap.get(name);
        System.out.println(myContact.getName() + ", " + myContact.getEmail() + ", " + myContact.getPhoneNumber());
    }
}
