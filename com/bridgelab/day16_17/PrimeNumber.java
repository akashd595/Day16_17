package com.bridgelab.day16_17;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 3,totalPrimeNumbers=1;
        System.out.println("2 is a prime number");
        while(n<10000){

            boolean flag = false;
            for(int i=2; i<=n/2; i++){
                if(n%i == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(n+" is a prime number");
                totalPrimeNumbers++;
            }
            n++;
        }
        System.out.println("Total "+totalPrimeNumbers+" prime numbers within 2 to "+n);
    }
}

