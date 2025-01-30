package hashmapshashfunctions.findallsubarrayswithzerosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ZeroSumSubarrays{

    public static void findZeroSumSubarrays(int[] arr){
        HashMap<Integer, List<Integer>>map=new HashMap<>();
        int sum =0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];


            if(map.containsKey(sum)){
                for(int startIndex:map.get(sum)){
                    printSubArray(arr,startIndex+1,i);
                }
            }

        map.putIfAbsent(sum,new ArrayList<>());
        map.get(sum).add(i);

        }
    }

    public static void printSubArray(int [] arr,int start, int end){
        for(int i=start;i<=end;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

}
