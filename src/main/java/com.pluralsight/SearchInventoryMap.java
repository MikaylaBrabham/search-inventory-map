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
            System.out.println("Enter product name or X to exit: ");
            String search = myScanner.nextLine();


            //add if statement
            if(se)
        }
}
