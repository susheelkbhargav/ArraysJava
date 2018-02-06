package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][]arr= new int[3][3];
        int ct=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=ct;
                ct++;
            }
        }
        printMatrix(arr);
        // 1  2  3
        // 4  5  6
        // 7  8  9
        //Output:
//        (0,2) (1,2) (2,2)
//        // 3  6  9
//        (0,1) (1,1) (2,1)
//        // 2  5  8
//        (0,0) (1,0) (2,0)
//        // 1  4  7
        int c[][]=new int[3][3];
        int temp;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                temp=arr[2-j][i];
//                arr[2-j][i]= arr[i][j];
//            }
//        }
        System.out.println();
        System.out.println();
        //printMatrix(c);
        reverseMatrix(arr);

    }

    static void printMatrix(int[][]arr){
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }

    static void reverseMatrix(int[][]arr){
       // int c[][]=new int[3][3];
        int temp=0;
        for(int i=0;i<3;i++){
            for(int j=0,k=2;j<k;j++,k--){

                temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
        }
        printMatrix(arr);
    }
}
