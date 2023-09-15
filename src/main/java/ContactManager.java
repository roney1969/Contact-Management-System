import java.util.HashMap;

public class ContactManager {
    HashMap<ContactCategoryName, IContactCategory> contactCategoryMap = new HashMap<>();
    PersonalContactCategory personalContactCategory = new PersonalContactCategory();
    WorkContactCategory workContactCategory = new WorkContactCategory();
    public ContactManager() {
        contactCategoryMap.put(ContactCategoryName.PERSONAL, personalContactCategory);
        contactCategoryMap.put(ContactCategoryName.WORK, workContactCategory);
    }
    public void addContact(ContactCategoryName contactCategoryName, String name, String email, int phoneNumber) {
        contactCategoryMap.get(contactCategoryName).addContact(name, email, phoneNumber);
    }
    public void removeContact(ContactCategoryName contactCategoryName, String name) {
        contactCategoryMap.get(contactCategoryName).removeContact(name);
    }
    public void viewContacts(ContactCategoryName contactCategoryName) {
        contactCategoryMap.get(contactCategoryName).viewContacts();
    }
    public void searchContacts(ContactCategoryName contactCategoryName, String name) {
        contactCategoryMap.get(contactCategoryName).searchContacts(name);
    }
}
