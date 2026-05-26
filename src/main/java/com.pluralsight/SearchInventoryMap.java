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
            if (search.equalsIgnoreCase("X")) ;
            break;
        }

        //add product
        Product product = inventory.get(search.toLowerCase());

        //add if statement for product
        if (product == null) {
            System.out.println("product not found.");
        } else {
            System.out.println("ID: %d Name: %s Price $%.2f%n",
                    product.getId(),
                    product.getName(),
                    product.getPrice());
        }
    }

//add load inventory
public static void loadInventory() {

//add loadinventory try/ catch buff reader and file reader
try {
BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));

//create string input
    String input;

    //add while statement to format and parse input
    while ((input = reader.readLine()) != null) {
        String[] tokens = input.split("\\|");

        //parse different parts of info
    }















}