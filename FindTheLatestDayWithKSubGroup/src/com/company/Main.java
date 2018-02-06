package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]array= {3,1,5,4,2};
        int group=1;
        System.out.println(solution(array,group));
    }
    public static int solution(int[] P, int K) {
        // write your code in Java SE 8
        int[] Q = new int[P.length];
        //Iterate until you fill all the rows with the condition being group k is not exhausted
        //Fill in all positions of Q 0
        int latest = -1;
        for(int i = 0; i < P.length; i++){
            Q[i] = 0;
        }
        //Start filling each row until we see k
        //if we don't see k return -1
        for(int j = 0; j < P.length; j++){
            Q[P[j] - 1] = 1;
            //Check for k groups exist
            latest = Math.max(latest, (check(Q, K)?j + 1: latest));
        }
        return latest;
    }
    public static boolean check(int[] Q1,int g){
        int count = 0;
        //int[] countarr = new int[Q1.length];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < Q1.length; i++){
            if(Q1[i] == 0){
                set.add(count);
                count = 0;
            }
            else if(Q1[i] == 1){
                count = count + 1;
            }
        }
        if(set.contains(g)){
            return true;
        }
        return false;
    }
}

