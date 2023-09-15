import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public void createCSV(personalContactList, workContactList) throws IOException {

        File personalFile = new File("src/main/java/Personal_Contact_Info.csv");
        FileWriter fw1 = new FileWriter(personalFile);
        BufferedWriter bw1 = new BufferedWriter(fw1);

        bw1.write("Name, Email, Phone Number");
        bw1.newLine();
        for(int i=0;i<personalContactList.size();i++)
        {
            bw1.write(personalContactList.get(i++)+","+personalContactList.get(i));
            bw1.newLine();
        }
        bw1.close();
        fw1.close();

        File workFile = new File("src/main/java/Work_Contact_Info.csv");
        FileWriter fw2 = new FileWriter(workFile);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        bw2.write("Name, Email, Phone Number");
        bw2.newLine();
        for(int i=0;i<workContactList.size();i++)
        {
            bw2.write(workContactList.get(i++)+","+workContactList.get(i));
            bw2.newLine();
        }
        bw2.close();
        fw2.close();
    }
}
