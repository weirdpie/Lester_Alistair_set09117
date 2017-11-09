
package controller;

import java.util.Scanner;

import model.Model;
import model.Move;
import model.Piece;
import model.Gameboard;

import java.util.*;

public class Game {

	Model model = new Model();
	Move move = new Move(0, 0, 0, 0);
	static Piece piece = new Piece(0, 0, 0, 0, 0);
	Gameboard gameboard = new Gameboard();

	public void showingBoard() {

	String[] xHeader = { "A", "B", "C", "D", "E", "F", "G", "H" };

	for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < 8; j++) {
			System.out.print(gameboard.getGameboard[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\n\t");
		for (int k = 0; k < 8; k++) {
		System.out.print(xHeader[k] + "\t");

		}

		System.out.println("\t");

	}
//  	 int[][] gameboard = new int[][]{
//	       	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
//	       	{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
//	       	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
//	       	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	       	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	       	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2},
//	       	{2, 0, 2, 0, 2, 0, 2, 0, 2, 0},
//	       	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2}};
// 	
// 	String[] xHeader = {"A", "B", "C", "D","E", "F", "G","H"};
// 	 
// 
// 	for(int i = 0; i<8;i++) {
// 		System.out.print((i + 1) + "\t");
// 		for(int j = 0; j <8;j++) {
// 			System.out.print(gameboard[i][j] + "\t");
// 		}
// 		System.out.println();
// 	}
// 	System.out.print("\n\t");
// 	for(int k = 0;k<8;k++) {
// 		System.out.print(xHeader[k] + "\t");
//
// 	}
//
//
// 	
// 	System.out.println("\t");

	public void move() {

		Scanner sc = new Scanner(System.in);

		Game gameboard = new Game();

		System.out.println("what peice do you want to move  ");
		int xorigin = sc.nextInt();
		int yorigin = sc.nextInt();

		System.out.print(xorigin);
		System.out.print(yorigin);
		// int xorigin = Piece.getX();
		// int yorigin = Piece.getY();

		System.out.println("where would you like to move it");
		int xmove = sc.nextInt();
		int ymove = sc.nextInt();
		// // Save current position, so we can erase the Piece.
		//
		// // Update the location.

		// gameboard [xorigin][yorigin] = 0;
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

	public static void main(String[] args) {
		// Game controller = new Game();
		// model Model = new Model();
		// model Move = new Move();
		// model Piece = new Piece();
		Game controller = new Game();

		controller.showingBoard();
		controller.move();

	}
}
