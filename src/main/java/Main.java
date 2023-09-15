import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonalContactCategory myPersonalContact = new PersonalContactCategory();
        WorkContactCategory myWorkContact = new WorkContactCategory();
        FileIO myFileIO = new FileIO();
        myFileIO.createCSV(myPersonalContact.personalContactList, myWorkContact.workContactList);
    }
}
