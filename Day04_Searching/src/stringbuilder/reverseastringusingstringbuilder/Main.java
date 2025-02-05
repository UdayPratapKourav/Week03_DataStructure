package stringbuilder.reverseastringusingstringbuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        //Taking input form the user
        String str = sc.nextLine();

        ReverseString rs = new ReverseString();

        //Store reversed string
        String reverseString = rs.reverseString(str);


        System.out.println("Original String :");
        System.out.println(str);
        System.out.println("Reversed string is :");
        System.out.println(reverseString);
    }
}
