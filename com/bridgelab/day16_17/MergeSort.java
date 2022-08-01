package com.bridgelab.day16_17;

import java.util.Scanner;

public class MergeSort {
    private static void mergesort(String[] arr){
        int arrlength = arr.length;

        if(arrlength < 2){
            return;
        }

        int midIndex = arrlength / 2;
        String[] leftHalf = new String[midIndex];
        String[] righthalf = new String[arrlength - midIndex];

        for(int i = 0; i < midIndex ; i++){
            leftHalf[i] = arr[i];
        }
        for(int i= midIndex ; i < arrlength ; i++){
            righthalf[ i - midIndex ] = arr[i];
        }
        mergesort(leftHalf);
        mergesort(righthalf);

        merge(arr, leftHalf, righthalf);
    }
    private static void merge(String[] inputArray, String[] leftHalf, String[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int l=0, r=0, m=0;
        while(l < leftSize && r < rightSize){
            if((leftHalf[l].compareTo(rightHalf[r])) < 0 ){
                inputArray[m++] = leftHalf[l++];
            }else{
                inputArray[m++] = rightHalf[r++];
            }
        }
        while(l < leftSize){
            inputArray[m++] = leftHalf[l++];
        }
        while(r < rightSize){
            inputArray[m++] = rightHalf[r++];
        }
    }
    private static void printArray(String[] inputArray){
        for(int i=0; i<inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Merge sort program ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] inputarray = str.split(" ");

        mergesort(inputarray);
        printArray(inputarray);
    }
}


