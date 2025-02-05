package stringbuilder.removeduplicate;

import java.util.HashSet;

public class RemoveDuplicates {
    //Method for removing duplicate from the string
    public String removeDuplicates(String str){
        //StringBuilder for storing updated data
      StringBuilder sb = new StringBuilder();
      HashSet<Character>hs=new HashSet<>();
      for(int i=0;i<str.length();i++){
          if(!hs.contains(str.charAt(i))){
              sb.append(str.charAt(i));
              hs.add(str.charAt(i));
          }
      }
      //return updated data
      return sb.toString();
    }
}
