
package controller;

import java.util.Scanner;


import model.Model;
import model.Move;
import model.Piece;
import model.GameBoard;

import java.util.*;

public class Game {

	//turns
	//undo re do 
	// do move validation
	// add move to list
	// do jump
	// jump validation = move vaildation
	// kings
	

	Model model = new Model();

	GameBoard gameBoard = new GameBoard();

	public void populate() {
		model.populate();
	}

	public void showingBoard() {
		
//		while(!gameEnd) {
//		
//			if (counter%2 =0 )
//			{
//				player1();
//				player2();
//			}
//			if (counter %2 =1) {
//				player2();
//				player1();
//			}
//			counter ++; 
//				
//		}
		
		String[] xHeader = { "A", "B", "C", "D", "E", "F", "G", "H" };

		for (int i = 0; i < 8; i++) {
			System.out.print(xHeader[i] + "\t");

			for (int j = 0; j < 8; j++) {
				System.out.print(gameBoard.getGameboard()[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\n\t");
		for (int i = 0; i < 8; i++) {

			System.out.print((i + 1) + "\t");
		}

		System.out.println("\t");

	}

	public void moveChecker() {
		String origin ="";
		String moveCord= "";
		
		Scanner sc = new Scanner(System.in);

		System.out.println("what peice do you want to move  ");
		origin = sc.next();

		System.out.print(origin);

		String xorigin = origin.substring(0, 1);
		int yorigin = Integer.parseInt(origin.substring(1, 2));
		int convertedXorigin = vaildate_x(xorigin);
		yorigin -= 1;

		System.out.println("where would you like to move it");
		moveCord = sc.next();

		String xmove = moveCord.substring(0, 1);
		int ymove = Integer.parseInt(moveCord.substring(1, 2));
		int convertedXmove = vaildate_x(xmove);
		ymove -= 1;

		// System.out.print(yorigin,convertedXorigin,ymove,convertedXmove,xorigin,xmove);

		Move move = new Move(yorigin, convertedXorigin, ymove, convertedXmove);
		//
		int type = gameBoard.getGameboard()[convertedXorigin][yorigin];
		//
		model.addMove(convertedXorigin, yorigin, convertedXmove, ymove);
		System.out.print(move+"\n");
		//model.moves.add(convertedXorigin, yorigin, convertedXmove, ymove);
		gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()] = 0;
		gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;

		vaildate_x(xorigin);
		showingBoard();
		
		
		
		
		 
//if 1 trys to move into 2 get new user input 
		//call move moveChecker to make sure user is inputing the right data 
		//if type any peice = 0 end game and declare the other user the winner.
	}


	public static Boolean checkInput(String sc) {
		//call move moveChecker to make sure user is inputing the right data 
		return null;

	}
	
	public void checkMove() {
//		If red piece  can only move +1  +1 , +1 -1 , -1 +1 , -1 -1 i
//		If black piece can only move -1 -1 , -1 +1 , +1 -1 , +1 +1
//		else invalid move 
		// restart players turn and ask them to move again 
	}
	public void checkTake () {
//		If red take , black piece +1 +1 empty , black piece +1 -1 empty then take and delete 
//		If black take , red piece -1 -1 empty , red piece -1 +1 empty then take and delete  
//		else invalid move 
		// restart players turn and ask them to move again 
	}
	public void king() {
		//if piece reached 0 or 8 , change peice type to king ( colour ) and end turn 
	}
	public void checkKing() {
		//king type can move any way 
	}
	public void undo () {
		//move list -1 ? 
	}
	public void redo () {
		//throw list +1 
	}

	public int vaildate_x(String xorigin) {

		xorigin = xorigin.toUpperCase();
		int xcord;

		switch (xorigin) {
		case "A":
			xcord = 0;
			break;
		case "B":
			xcord = 1;
			break;
		case "C":
			xcord = 2;
			break;
		case "D":
			xcord = 3;
			break;
		case "E":
			xcord = 4;
			break;
		case "F":
			xcord = 5;
			break;
		case "G":
			xcord = 6;
			break;
		case "H":
			xcord = 7;
			break;

		default:
			xcord = 8;
			break;
			
			

		}
		return xcord;
		
	}
	public int changeTurn (int turn) {
		if (turn ==1) {
			turn=2;
			System.out.println("Its player 2s turn (white 2's"); 
		}
		else if (turn==2) {
			turn=1;
			System.out.println("Its player 1s turn (blacks 1's"); 
		}
		
		return turn;
		
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Game controller = new Game();
		controller.populate();
		controller.showingBoard();
		int turn =1 ;
		boolean play=true;
		do {
		controller.moveChecker();
		}while (play==true);
		
	while (play==false);{
		System.out.println("the game has ended");
	}
	}
}
