package filereader.readfilelinebyline;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String filePath = "src/filereader/readfilelinebyline/file.txt";
//        File file=new File(filePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String result;
            while ((result=br.readLine())!=null){
                System.out.println(result);
            }
            br.close();

        }catch (FileNotFoundException e){
            System.out.println( e.getMessage());
        }catch (IOException f){
            System.out.println(f.getMessage());
        }


    }
}
