import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;	//added this because it uses the comparable interface i slipped into Colors.java

public class MainSort {
    public static void main(String[] args) {

        // while loop (boolean logic) to allow an opportunity to re-run program
        boolean play = true;
        while (play == true) {

             //call to merge sort && run time calculator algorithm
             //MainSortClass rt = new MainSortClass();
             //rt.mergesort(Colors);
        	
        	
        	
        	/*
        	Didnt want to mess with too much of the code i will put my color sorter here
        	
        	Wasnt sure how to use ArrayList1 class, so im just going to make a fresh ArrayList with the same colors
        	*/
        	
        	ArrayList<Colors> newArrayofColors = new ArrayList<Colors>();
        	newArrayofColors.add(new Colors("FA8072", "salmon"));
        	newArrayofColors.add(new Colors("FF0000", "red"));
        	newArrayofColors.add(new Colors("FF7F50", "coral"));
        	newArrayofColors.add(new Colors("FFD700", "gold"));
        	newArrayofColors.add(new Colors("FF8C00", "dark orange"));
        	newArrayofColors.add(new Colors("FFE4B5", "moccasin"));
        	newArrayofColors.add(new Colors("FFFF00", "yellow"));
        	newArrayofColors.add(new Colors("7CFC00", "lawn green"));
        	newArrayofColors.add(new Colors("808000", "olive"));
        	newArrayofColors.add(new Colors("00FFFF", "cyan"));
        	newArrayofColors.add(new Colors("40E0D0", "turquoise"));
        	newArrayofColors.add(new Colors("008080", "teal"));
        	newArrayofColors.add(new Colors("00BFFF", "deep sky blue"));
        	newArrayofColors.add(new Colors("4682B4", "steel blue"));
        	newArrayofColors.add(new Colors("000080", "navy"));
            newArrayofColors.add(new Colors("FF00FF", "fuchsia"));
            newArrayofColors.add(new Colors("4B0082", "indigo"));
            newArrayofColors.add(new Colors("FF69B4", "hot pink"));
            newArrayofColors.add(new Colors("FFFFF0", "ivory"));
            newArrayofColors.add(new Colors("708090", "slate gray"));
            
            //Print it unsorted
            for (Colors s : newArrayofColors) {
            	System.out.println("ID number : " + s.colorID + "is the color : " +  s.colorName);
            }
            
            System.out.println("\n\n\n");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Sorting Begin!");
        	Collections.sort(newArrayofColors);		//let the Collections Class do the sorting
        	System.out.println("Sorting Complete!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n\n\n");
            
        	//Print it AFTER the sorting should be done
            for (Colors s : newArrayofColors) {
            	System.out.println("ID number : " + s.colorID + "is the color : " +  s.colorName);
            }
        	


            // Scanner to exit or rerun program
            System.out.println("Would you like to rerun?  Enter 1 to re-run.  Press any other key to exit.");
            Scanner scn2 = new Scanner(System.in);

            int input2 = scn2.nextInt();
            scn2.close();

            // if statement to determine rerun or exit
            if (input2 == 1) {
                play = true;
            } else {
                play = false;
            }
        }
    }
}
