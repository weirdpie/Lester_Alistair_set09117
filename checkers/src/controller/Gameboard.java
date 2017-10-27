

package controller;
import java.util.Scanner;

public class Gameboard {
    public Gameboard() {
    }

    public static void main(String[] args) {
    	 int blackPieces = 12;
    	    int redPieces = 12;
    	    final int rows = 8;
    	    final int columns = 8;
    
        int[][] gameboard = new int[][]{
        	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        	{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
        	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2},
        	{2, 0, 2, 0, 2, 0, 2, 0, 2, 0},
        	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2}};
        	
        	
        showingBoard(gameboard);
    }

    public static void showingBoard(int[][] gameboard ) {
    	
    	String[] xHeader = {"A", "B", "C", "D","E", "F", "G","H"};
    
    	for(int i = 0; i<8;i++) {
    		System.out.print((i + 1) + "\t");
    		for(int j = 0; j <8;j++) {
    			System.out.print(gameboard[i][j] + "\t");
    		}
    		System.out.println();
    	}
    	System.out.print("\n\t");
    	for(int k = 0;k<8;k++) {
    		System.out.print(xHeader[k] + "\t");
    	}
    	System.out.println("\t");
    	Scanner coordOr = new Scanner(System.in);
    	Scanner  NewCoord = new Scanner(System.in);
     

        System.out.println("what peice do you want to move  ");
        System.out.println(coordOr.nextLine());
        
        
        System.out.println("where would you like to move it");
        System.out.println(NewCoord.nextLine());
        NewCoord.close();
       coordOr.close(); 

    }
    
  

    public  void  printBoard() {
    	 System.out.println("  â•”â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•¦â•�â•�â•�â•—");
         System.out.println("  â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘");
         System.out.println("  â• â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•¬â•�â•�â•�â•£");
         System.out.println("  â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘â–‘â–‘â–‘â•‘â•‘");
         System.out.println("  â•šâ•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•©â•�â•�â•�â•�");
    }
    
}
