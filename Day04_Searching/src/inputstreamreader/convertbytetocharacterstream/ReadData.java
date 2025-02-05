package inputstreamreader.convertbytetocharacterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {
    public void readData(String path){

        try{
            FileInputStream fis= new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
                fis.close();
                isr.close();
                br.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
