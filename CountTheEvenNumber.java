package com.BridgeLabez.Programs;

public class CountTheEvenNumber {
    public static void main(String[] args) {
        int arr[]={34,56,24,4,8,9,15};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Count of evevn numbers: "+count);
    }
}
