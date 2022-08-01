package com.bridgelab.day16_17;

import java.util.Locale;

public class InsertionSort {
    public static void sort(String arr[]){

        for(int i=1; i<arr.length; i++){
            String current = arr[i];
            int j = i-1;
            while(j >= 0 && (current.compareTo(arr[j])<0)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.print("after sorting:-  ");
        for(String pos : arr){
            System.out.print(pos+" ");
        }
    }
    public static void toSpiltSentance(String fileContent){

        String storingInput = fileContent.toLowerCase(Locale.ROOT);
        String[] sentence = storingInput.split(" ");
        System.out.print("Before sorting:-  ");
        for(String pr : sentence){
            System.out.print(pr+" ");
        }
        System.out.println();
        sort(sentence);
    }
    public static void main(String[] args) {

        String arr = "Hey My Name is";
        toSpiltSentance(arr);
    }
}