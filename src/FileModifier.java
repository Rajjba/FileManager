import java.io.*;
import java.util.Objects;

public class FileModifier {

    public FileModifier() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you wanna modify a file?");
        String answer = reader.readLine();

        if (Objects.equals(answer, "yes") || Objects.equals(answer, "YES")) {

            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter file name: ");
            String fileName = reader1.readLine();

            BufferedReader choice1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What would you like to do with the selected file?" +
                    "\n" +  "1. Change Contents" +
                    "\n" +  "2. Add a Line" +
                    "\n" +  "3. Cancel");
            String answer1 = choice1.readLine();

            if (Objects.equals(answer1, "1")) {
                System.out.println("Enter the new contents for the file:");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                    String newContents = reader2.readLine();

                    writer.write(newContents);
                    writer.close();
                    System.out.println("Successfully changed the contents of the file.");

            } else if (Objects.equals(answer1, "2")) {
                    BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter new line: ");
                    String newLine = reader3.readLine();
                    BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileName));
                    /* this "add a new line" doesnt work exactly right yet. */
                    writer1.newLine();
                    writer1.write(newLine);
                    writer1.close();
                    System.out.println("Successfully added a line to the file.");

            } else if (Objects.equals(answer1, "3")) {
                System.out.println("ok, no mods");
            }
        }
    }
}