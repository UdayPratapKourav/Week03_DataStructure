package largefilereadingefficiency;

public class Main {
    public static void main(String[] args) {
        String filePath="src/largefilereadingefficiency/file.txt";
        String str = "Consistency is the key to success in any field. Whether it’s coding, studying, or building new habits, small, regular efforts lead to significant progress over time. It’s not about working hard for a single day but showing up daily, even when motivation fades. In programming, consistent practice improves problem-solving skills, strengthens logic, and builds confidence. Similarly, consistent learning in academics helps retain knowledge effectively. It creates discipline, reduces procrastination, and fosters growth. While talent can give an initial boost, consistency ensures long-term success. Remember, progress may be slow, but steady efforts always lead to remarkable results.";
        LargeFileReading lfr= new LargeFileReading();
        System.out.println("For 1mb file ");
        lfr.writeInFile(filePath,str,10000);
        lfr.readUsingFileReader(filePath);
        lfr.readUsingInputStreamReader(filePath);


        System.out.println();
        System.out.println("For 100 mb file ");
          lfr.writeInFile(filePath,str,150000);
        lfr.readUsingFileReader(filePath);
        lfr.readUsingInputStreamReader(filePath);

        System.out.println();
        System.out.println("For 500 mb file ");
        lfr.writeInFile(filePath,str,750000);
        lfr.readUsingFileReader(filePath);
        lfr.readUsingInputStreamReader(filePath);
    }
}
