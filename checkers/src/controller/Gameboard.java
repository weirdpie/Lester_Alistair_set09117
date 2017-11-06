

package controller;
import java.util.Scanner;

import model.Model;
import model.Move;
import model.piece;

import java.util.*;


public class Gameboard {
	
	

    
    
    

    public static  void showingBoard( ) {
    	
    	 int[][] gameboard = new int[][]{
 	       	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
 	       	{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
 	       	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
 	       	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
 	       	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
 	       	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2},
 	       	{2, 0, 2, 0, 2, 0, 2, 0, 2, 0},
 	       	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2}};
    	
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

    }
  
  

    

    public static void  move() {
    
  	 Scanner sc=new Scanner(System.in);
  	 
  
      System.out.println("what peice do you want to move  ");
     int xorigin = sc.nextInt();
     int yorigin = sc.nextInt();
      
      System.out.print(xorigin );
      System.out.print(yorigin);
//      int xorigin = piece.getX();
//     int yorigin = piece.getY(); 
      
      
     System.out.println("where would you like to move it");
//    
//		  // Save current position, so we can erase the piece.
//      
//		  // Update the location.
//		  piece.setX(xorigin + xmove);
//		
//     piece.setY(yorigin + ymove);
//
//		  // Remove piece from old position
	controller.showingBoard(gameboard)[xorigin][yorigin].clear();
//
//		  // Add it to the new position.
//		  addPiece(piece);
//		   NewCoord.close();
//	       coordOr.close();
      sc.close();
  	
		}

	 public static void main(String[] args) {
   	 
//		 model Model = new Model();
//		 model Move = new Move();
//		 model piece = new piece();

   	
   
      Gameboard.showingBoard();
      Gameboard.move();
      
    
   }
} 
