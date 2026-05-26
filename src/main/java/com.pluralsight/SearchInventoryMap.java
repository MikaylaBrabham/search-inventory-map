package com.pluralsight;

//add imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;


public class SearchInventoryMap {

    //add hashmaps
static HashMap<String, Product> inventory = new HashMap<>();
    //add scanner
    Scanner myScanner = new Scanner(System.in);

    //add main
    public static void main(String[] args) {

    //add loadinventory
        loadInventory();

    //add while true
        while (true) {
            System.out.print("Enter product name or X to exit: ");
            String search = myScanner.nextLine();


            //add if statement
            if(search.equalsIgnoreCase("X"));
            break;
        }

        //add product
        Product product = inventory.get(search.toLowerCase());

        //add if statement for product
        if (product == null) {
            System.out.println("product not found.");
        }
}
