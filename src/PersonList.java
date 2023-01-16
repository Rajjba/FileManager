import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class PersonList {

    public PersonList() throws IOException{

        File file = new File("Plist");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String fileText = "Leon" + "\n" + "Pho" + "\n" + "Chris" + "\n" + "Sammy";
        writer.write(fileText);
        writer.close();

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("Plist"))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
