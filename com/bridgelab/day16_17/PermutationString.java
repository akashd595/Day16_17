package com.bridgelab.day16_17;
import java.util.Scanner;

public class PermutationString {
    static void printPermutation(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String restOfString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(restOfString, ans + ch);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutation(str, "");
    }
}
