package ChallengeProblem.comparefilereaderandinputstreamreader;

import java.io.*;

public class WriteAndRead {
    // Method for writing data in .txt file
    public void writeInFile(String path, String word) {
        try (FileWriter fw = new FileWriter(path);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < 100000; i++) {
                bw.write(word + " ");
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method for finding the time taken by FileReader
    public long timeTakenByFileReader(String path) {
        long start = System.nanoTime();
        int count = 0;
        try (FileReader fr = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            count += sb.toString().split("\\s+").length;
            System.out.println("Number of word using filereader: "+count);
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }
        long end = System.nanoTime();
        return end - start;
    }

    // Method for finding time taken by InputStreamReader
    public long timeTakenByInputStreamReader(String path) {
        long start = System.nanoTime();
        int count =0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(path))) {
            int i;
            StringBuilder sb = new StringBuilder();
            while ((i = isr.read()) != -1) {
               sb.append((char)i);
            }
            count +=sb.toString().split("\\s").length;
            System.out.println("Number of word using input stream reader :"+count);
        } catch (IOException g) {
            System.out.println(g.getMessage());
        }
        long end = System.nanoTime();
        return end - start;
    }
}
