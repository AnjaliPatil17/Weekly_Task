package com.BridgeLabez.Programs;

import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input=sc.nextInt();
        int count=0;
        int temp=input;
        while(temp>0){
            count +=1;
            temp = temp /10;
        } System.out.print(count);
        sc.close();
    }

}
