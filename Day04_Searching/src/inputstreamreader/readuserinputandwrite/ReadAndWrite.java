package inputstreamreader.readuserinputandwrite;

import java.io.*;

public class ReadAndWrite {
    public void readAndWrite(String path) {
        try (
                // Open InputStreamReader and BufferedReader for reading user input
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                // Open FileWriter in append mode
                FileWriter fw = new FileWriter(path, true);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (true) {
                userInput = br.readLine(); // Read user input

                if (userInput.equalsIgnoreCase("exit")) {
                    break; // Stop input if user types 'exit'
                }

                bw.write(userInput); // Write input to file
                bw.newLine(); // Move to the next line
                bw.flush(); //  Ensure data is written immediately
            }

            System.out.println("User input saved to " + path);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
