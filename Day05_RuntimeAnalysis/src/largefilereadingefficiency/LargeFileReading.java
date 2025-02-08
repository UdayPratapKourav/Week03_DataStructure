package largefilereadingefficiency;

import java.io.*;

public class LargeFileReading {
        public void writeInFile(String filePath,String str,int length){
            try {
                FileWriter fw = new FileWriter(filePath);
                BufferedWriter bw= new BufferedWriter(fw);
                String line =str+" ";
                for(int i=0;i<length;i++){
                    bw.write(line);
                }
                bw.flush();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
       //Method for read using file reader
        public void readUsingFileReader(String filePath){
           long start= System.nanoTime();
            try{
                FileReader fr= new FileReader(filePath);
                int i;
                while ((i=fr.read())!=-1){

                }
            }catch (IOException f){
                System.out.println(f.getMessage());

            }
            long end = System.nanoTime();
            System.out.println("Time taken by FileReader is "+(end-start)/1000000.0);
        }

        public void readUsingInputStreamReader(String filePath){
           long start=System.nanoTime();
            try{
                InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
                int i;
                while ((i= isr.read())!=-1){

                }
            }catch (IOException g){
                System.out.println(g.getMessage());
            }
            long end=System.nanoTime();

            System.out.println("Time taken by InputStreamReader is "+(end-start)/1000000.0);
        }



}
