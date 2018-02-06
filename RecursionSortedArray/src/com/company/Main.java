package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ara={1};
	// write your code here
        System.out.println(isSorted(ara,ara.length));
    }

    static boolean isSorted(int[] array, int index){
        if(index==1){
            return true;
        }
        else {
            if(array[index-1]<array[index-2]){
                return false;
            }
            else {
                return isSorted(array,index-1);
            }

        }

    }
}
