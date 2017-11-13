
package controller;

import java.util.Scanner;

import model.Model;
import model.Move;
import model.Piece;
import model.GameBoard;

import java.util.*;

public class Game {
//do input vaildation 
	// do move validation
	// add move to list
	//do jump 
	//jump validation = move vaildation 
	//kings 
	//redo 
	
	Model model = new Model();


	GameBoard gameBoard = new GameBoard();
	
	
	public void populate() {
		model.populate();
	}
	

	public void showingBoard() {
		
	String[] xHeader = { "A", "B", "C", "D", "E", "F", "G", "H" };

	for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < 8; j++) {
			System.out.print(gameBoard.getGameboard()[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\n\t");
		for (int k = 0; k < 8; k++) {
		System.out.print(xHeader[k] + "\t");

		}

		System.out.println("\t");

	}


	public void moveChecker() {
		String origin;
		String moveCord;
		
		Scanner sc = new Scanner(System.in);


		System.out.println("what peice do you want to move  ");
		origin = sc.next();
				
		System.out.print(origin);
		
	
		
		String yorigin = origin.substring(0,1);
		int xorigin = Integer.parseInt(origin.substring(1,2));
		int convertedYorigin = vaildate_y(yorigin);
		xorigin -= 1;
		
		System.out.println("where would you like to move it");
	moveCord = sc.next();
	
	String ymove = moveCord.substring(0,1);
	int xmove = Integer.parseInt(moveCord.substring(1,2));
	int convertedYmove = vaildate_y(ymove);
	xmove -=1;
	
	System.out.printf(yorigin,convertedYorigin,ymove,convertedYmove,xorigin,xmove);
	
	
	
//	Move move = new Move(xorigin, yorigin, xmove, ymove);
//			
//		int type = gameBoard.getGameboard()[yorigin][xorigin];
//		
//		//model.addMove(move);
//
//		gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()]= 0;
//		gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;
//		
////		String origin = origin.substring(0,1);

		vaildate_y(yorigin);
		showingBoard();
		sc.close();

	}
//	public void moveChecker() {
//		String origin;
//		
//		Scanner sc = new Scanner(System.in);
//
//
//		System.out.println("what peice do you want to move  ");
//		int xorigin = sc.nextInt();
//		int yorigin = sc.nextInt();
//		
//		
//		System.out.print(xorigin);
//		System.out.print(yorigin);
//
//
//		System.out.println("where would you like to move it");
//		int xmove = sc.nextInt();
//		int ymove = sc.nextInt();
//		
//		Move move = new Move(xorigin, yorigin, xmove, ymove);
//			
//		int type = gameBoard.getGameboard()[yorigin][xorigin];
//		
//		//model.addMove(move);
//
//		gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()]= 0;
//		gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;
//		
////		String origin = origin.substring(0,1);
//
//		vaildate_y(yorigin);
//		showingBoard();
//		sc.close();
//
//	}
	
	public static Boolean checkInput (String sc) {
		
		
		
		
		
		
		return null;
		
		
	}	
	public int vaildate_y(String yorigin) {
		
   	yorigin = yorigin.toUpperCase();
		int ycord;
		
		switch (yorigin) {
			case "A" :
				ycord = 0;
				break;
			case "B" :
				ycord = 1;
				break;
			case "C" :
				ycord = 2;
				break;
			case "D" :
				ycord = 3;
				break;
			case "E" :
				ycord = 4;
				break;
			case "F" :
				ycord = 5;
				break;
			case "G" :
				ycord = 6;
				break;
			case "H" :
				ycord = 7;
				break;
				
				
			default:
				ycord = 8;
				break;
				
			
		}
		return ycord;
		
	}
	
	
	

	

	public static void main(String[] args) {

		Game controller = new Game();
		controller.populate();
		controller.showingBoard();
		controller.moveChecker(); 

	}
}
