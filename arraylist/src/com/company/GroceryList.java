package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] numItems= new int[50];
    private ArrayList<String> GroceryItems= new ArrayList<String>();

    public void addItems(String item){
        GroceryItems.add(item);
    }
    public int howmany(){
        return GroceryItems.size();
    }
    public void printAll(){
        for(int i=0;i<GroceryItems.size();i++){
            System.out.println(GroceryItems.get(i));
        }
    }
    public void remove(int position){
        GroceryItems.remove(position);
    }

    public void findItem(String item){
        boolean iffound= GroceryItems.contains(item);
        if(iffound){
            int position= GroceryItems.indexOf(item);
            System.out.println("at pos"+position);
        }
    }
}

