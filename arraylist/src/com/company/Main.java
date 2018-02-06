package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GroceryList groceryList=new GroceryList();
        groceryList.addItems("potato");
        groceryList.addItems("tato");
        groceryList.addItems("pot");
        groceryList.printAll();
    }
}
