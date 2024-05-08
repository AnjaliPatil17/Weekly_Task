package com.BridgeLabez.Programs;

public class AvgOfEvenPositionNo {
    public static void main(String[] args) {
        int arr[]={23,45,77,88,40,56,4,26,2};
        int count=0,average=0,sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                count++;
                sum=sum+arr[i];
            }
        }
        average=sum/count;
        System.out.print("Average of Numbers present at even position: "+average);
    }
}
