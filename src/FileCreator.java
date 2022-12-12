import java.io.*;

public class FileCreator {


    public FileCreator() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String fileName = reader.readLine();

        /* BufferedReader reader reads the desired filename given by the user. */

        File file = new File(fileName);

        /* Create new File using the java.io.File package and giving it the name read before. */

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text into file: ");
        String fileText = reader1.readLine();
        writer.write(fileText);
        writer.close(); /* the text does not get saved without calling this method. */

        /* Using the BufferedWriter and FileWriter package the code writes text onto the file.*/
    }
}
