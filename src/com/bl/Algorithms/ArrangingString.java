package com.bl.Algorithms;


import java.util.Arrays;
import java.util.Scanner;

public class ArrangingString {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.println("Enter First String: ");
        String str1 = ab.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = ab.nextLine();

        if (str1.length() == str2.length()){

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);

            if (result)
                System.out.println(str1 + " and " + str2 + " are anagram.");
            else
                System.out.println(str1 + " and " + str2 + " are not anagram.");

        }


    }
}
