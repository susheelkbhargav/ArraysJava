package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	decToBase5(n);
    }
    static void decToBase5(int n)
    {

        int[] base5 = new int[1000];

        int i = 0;
         if(n%5==0){
             int nLower= n-1;
             while (nLower > 0)
             {
                 base5[i] = nLower% 5;
                 nLower = nLower / 5;
                 i++;
             }
             StringBuilder sb = new StringBuilder(6);
             for (int j = i - 1; j >= 0; j--){
                 sb.append(base5[j]);
             }
             //System.out.println(sb);
             String result= sb.toString();
             int resultInt= Integer.parseInt(result);
             resultInt++;
             System.out.println(resultInt);
         }
         else {
             while (n > 0) {
                 base5[i] = n % 5;
                 n = n / 5;
                 i++;
             }
             for (int j = i - 1; j >= 0; j--)
                 System.out.print(base5[j]);
         }
    }
}
