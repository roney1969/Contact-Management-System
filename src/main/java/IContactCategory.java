public interface IContactCategory {
    void addContact(String name, String email, int phoneNumber);
    void removeContact(String name);
    void viewContacts();
    void searchContacts(String name);
}
