package com.BridgeLabez.Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int input=sc.nextInt();
        int sum=0,count=0;
        int temp=input;
        while(temp>0){
            count+=1;
            temp=temp/10;
        }
         temp=input;
        while(temp>0){
            int digit=temp%10;
            sum += Math.pow(digit, count);
            temp = temp/10;
        }
        if(input==sum){
            System.out.print("Armstrong");
        }else{
            System.out.print("not Armstrong");
        }sc.close();
    }
}
