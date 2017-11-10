
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

		Scanner sc = new Scanner(System.in);


		System.out.println("what peice do you want to move  ");
		int xorigin = sc.nextInt();
		int yorigin = sc.nextInt();

		System.out.print(xorigin);
		System.out.print(yorigin);


		System.out.println("where would you like to move it");
		int xmove = sc.nextInt();
		int ymove = sc.nextInt();
		
		Move move = new Move(xorigin, yorigin, xmove, ymove);
			
		int type = gameBoard.getGameboard()[yorigin][xorigin];
		
		//model.addMove(move);

		gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()]= 0;
		gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;
		



		showingBoard();
		sc.close();

	}
	
	
	
	

	

	public static void main(String[] args) {

		Game controller = new Game();
		controller.populate();
		controller.showingBoard();
		controller.moveChecker();

	}
}
