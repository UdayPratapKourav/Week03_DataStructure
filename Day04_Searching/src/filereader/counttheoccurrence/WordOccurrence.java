package filereader.counttheoccurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrence {
    public  int wordOccurrence(String filePath,String word){
        int count=0;
       try{
           BufferedReader br = new BufferedReader(new FileReader(filePath));
           StringBuilder sb = new StringBuilder();
           String line;
           while ((line=br.readLine())!=null){
            sb.append(line+" ");

           }

           String [] str =sb.toString().split("\\s") ;
          for(int i=0;i<str.length;i++){

            if(str[i].equals(word)){
                count++;
            }
          }






       }catch (IOException e){
           System.out.println(e.getMessage());
       }
        return count;
    }
}
