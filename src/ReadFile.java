import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadFile {

    public ReadFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String fileName = reader.readLine();

        /* The code reads for a filename that we can later use */

        String line; /* a variable to store each line of the file in */

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* The while loop keeps going until "line" no longer receives any data from "br.readLine()" */

    }
}
