package filereader.counttheoccurrence;

public class Main {
    public static void main(String[] args) {
        String filePath="src/filereader/counttheoccurrence/file.txt";
        String word="uday";
        WordOccurrence wo= new WordOccurrence();
        int occurrence=wo.wordOccurrence(filePath,word);

        System.out.println("Occurrence of the word "+word+" is :"+occurrence);




    }

}
