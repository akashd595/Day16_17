package com.bridgelab.day16_17;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    private static boolean checkAnagramOrNot(String ch1, String ch2){

        ch1 = ch1.toLowerCase();
        ch2 = ch2.toLowerCase();

        if(ch1.length() != ch2.length()){
            return false;
        }
        char[] chars1 = new char[ch1.length()];
        char[] chars2 = new char[ch2.length()];

        for(int i=0; i<ch1.length(); i++){
            chars1[i] = ch1.charAt(i);
        }
        for(int i=0; i<ch2.length(); i++){
            chars2[i] = ch2.charAt(i);
        }

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for(int i=0; i<ch1.length(); i++){
            if(chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String str1 = "earth";
//        String str2 = "heart";
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first string ");
        String str1 = sc.next();

        System.out.print("Please enter your second string ");
        String str2 = sc.next();

        boolean result = checkAnagramOrNot(str1, str2);
        if(result == true){
            System.out.println("Anagram");
        }else {
            System.out.println("Nope");
        }
        sc.close();
    }
}

