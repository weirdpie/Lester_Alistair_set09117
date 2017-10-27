

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

    public static void showingBoard(int[][] x ) {
    	Scanner coordOr = new Scanner(System.in);
    	Scanner  NewCoord = new Scanner(System.in);
     
    	
    	
    	
    	
        for(int row = 0; row < x.length; ++row) {
        	  
        System.out.print((row + 1) + "\t");

      
      
            for(int column = 0; column < x[row].length; ++column) {
     
            
            	
                System.out.print(x[row][column]);
            
               
            	
            }
            

            System.out.println();
          
                      
        }
        
       
        
        
        
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
