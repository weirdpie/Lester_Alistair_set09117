
package controller;

import java.util.Scanner;

import model.Model;
import model.Move;
import model.Piece;
import model.GameBoard;

import java.util.*;

public class Game {

	Model model = new Model();
	Move move = new Move(0, 0, 0, 0);
	static Piece piece = new Piece(0, 0, 0, 0, 0);
	GameBoard gameboard = new GameBoard();

	public void showingBoard() {
		
	String[] xHeader = { "A", "B", "C", "D", "E", "F", "G", "H" };

	for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < 8; j++) {
			System.out.print(gameboard.getGameboard()[i][j] + "\t");
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

		Scanner sc = new Scanner(System.in);

		//Game gameboard = new Game();

		System.out.println("what peice do you want to move  ");
		int xorigin = sc.nextInt();
		int yorigin = sc.nextInt();

		System.out.print(xorigin);
		System.out.print(yorigin);
		// int xorigin = Piece.getX();
		// int yorigin = Piece.getY();
//		System.out.println(gameboard.getGameboard()[0][0]);

		System.out.println("where would you like to move it");
		int xmove = sc.nextInt();
		int ymove = sc.nextInt();
		
		gameboard.getGameboard()[move.getXorigin()][move.getYorigin()]= 0;
	gameboard.getGameboard()[move.getYmove()][move.getXmove()] = gameboard.getGameboard()[xmove][ymove];
		

//		System.out.println(gameboard.getGameboard()[0][0]);
		
		//gameboard.add(xorigin,yorigin,xmove,ymove);
		//gameboard.setGameboard[xmove][ymove];  
//		 for (int r=0; r<gameboard.length; r++) {
//		     for (int c=0; c<gameboard[r].length; c++) {
//		         gameboard.getGameboard()[r][c] = gameboard.setGameboard(gameboard)[xmove][ymove];//your value
//		     }
//		 }
	
//		gameboard.setGameboard[xmove][ymove];
		// // Save current position, so we can erase the Piece.
		//
		// // Update the location.
//gameboard.getGameboard()[xorigin][yorigin] = gameboard.setGameboard([xmove][ymove]); 
//	for (gameboard.getGameboard()[xorigin][yorigin]) {
//		
//	gameboard.setGameboard()[xmove][ymove];
//	}
		// gameboard [xmove][ymove] = drop holding
		// piece.setX(xorigin + xmove);
		////
		// piece.setY(yorigin + ymove);
		//
		// // Remove Piece from old position
		// showingBoard(gameboard)[xorigin][yorigin].clear();
		//
		// // Add it to the new position.
		// //addPiece(piece);
		// for (int gameboard[xorigin][yorigin]) = 0; {
		////
		// gameboard[xmove][ymove] = piece;
		//// }
		////

		showingBoard();
		sc.close();

	}
	
	public void legalmove() {
		
	}
	
	public void jumpCheck() {
		
	}
	
	public void king() {
		
	}
	

	public static void main(String[] args) {
		// Game controller = new Game();
		// model Model = new Model();
		// model Move = new Move();
		// model Piece = new Piece();
		Game controller = new Game();

		controller.showingBoard();
		controller.moveChecker();

	}
}
