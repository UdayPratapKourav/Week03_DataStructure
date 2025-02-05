package ChallengeProblem.comparefilereaderandinputstreamreader;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/ChallengeProblem/comparefilereaderandinputstreamreader/file.txt";
        String word = "Hello I am name i am form bhopal MP";
        WriteAndRead war= new WriteAndRead();
        war.writeInFile(filePath,word);

        long timeTakenByFileReader=war.timeTakenByFileReader(filePath);
        long timeTakenByInputStreamReader=war.timeTakenByInputStreamReader(filePath);

        System.out.println("Time taken by FileReader :"+timeTakenByFileReader);
        System.out.println("Time taken by InputStreamReader :"+timeTakenByInputStreamReader);
        System.out.println("difference is :"+(timeTakenByFileReader-timeTakenByInputStreamReader));



    }
}
