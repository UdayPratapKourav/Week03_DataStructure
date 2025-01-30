package hashmapshashfunctions.checkforapairwithgivensuminanarray;

import java.util.HashMap;

public class PairWithTargetSum {
    public static boolean hasPairWithSum(int [] arr, int target){
        HashMap<Integer,Integer>hasmap=new HashMap<>();
        for(int num:arr){
            int complement =target-num;
            if(hasmap.containsKey(complement)){
                System.out.println("Pairs found "+num+" and "+complement);
                return true;

            }
            hasmap.put(num,1);

        }
        System.out.println("No such pairs are available ");
        return false;
    }
}
