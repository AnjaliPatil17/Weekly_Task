package com.BridgeLabez.Programs;

public class EvenAndOddInArray {
    public static void main(String[] args) {
        int arr[]={23,4,64,34,77,5,23,16};
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.println("Even Numbers are: "+arr[i]+" ");
            }else{
                System.out.println("Odd numbers are: "+arr[i]+" ");
            }
        }
    }
}
