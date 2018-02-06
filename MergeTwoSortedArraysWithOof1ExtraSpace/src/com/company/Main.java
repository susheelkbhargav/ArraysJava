package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array1= {10};
        int[] array2={6,3};
        int extraSpace=0;
        int len1=array1.length;
        int len2=array2.length;
        for(int i=len2-1;i>=0;i--){
            for (int j=len1-1;j>=0;j--){
                if(array2[i]>=array1[j]){

                }
                else{
                    swap(array2[i],array1[j]);
                }
            }
            print(array1);

            //print(array2);
        }

    }

    public static void swap(int a, int b){
        a= a+b;
        b= a-b;
        a= a-b;
    }
    static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
