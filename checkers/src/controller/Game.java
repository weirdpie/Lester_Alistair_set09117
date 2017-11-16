
package controller;

import java.util.Scanner;

import model.Model;
import model.Move;
import model.Piece;
import model.GameBoard;

import java.util.*;

public class Game {

	// move checker
	// taking a peice
	// undo re do
	// do jump
	// jump validation = move vaildation
	// kings

	Model model = new Model();

	GameBoard gameBoard = new GameBoard();

	public void populate() {
		model.populate();
	}

	public void showingBoard() {

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
	public boolean movingRight(int xorigin,int yorigin, int xmove,int ymove) {
		if (xmove ==(xorigin+1)) {
			System.out.println("moving right is true");
			return true;
			
		}else {
			System.out.println("moving right is false");
			return false;
			
		}
	}
	public boolean movingDown(int xorigin,int yorigin, int xmove,int ymove) {
		if (ymove ==(yorigin+1)) {
			System.out.println("moving down is true");
			return true;
			
		}else {
			System.out.println("moving down is false");
			return false;
			
		}
	
}
	public boolean spaceOccupied(int xcord,int yvalue) {
		
		if ((gameBoard.getGameboard()[yvalue][xcord]==1) || (gameBoard.getGameboard()[yvalue][xcord]==3)){
		System.out.println("checker is black");
		return true;
		}else if ((gameBoard.getGameboard()[yvalue][xcord]==2) || (gameBoard.getGameboard()[yvalue][xcord]==4)) {
			System.out.println("checker is white");
			return true;
		}else {
			return false;
		}
	}
	
	
	public Piece validateChecker(int xcord, int yvalue) {
		Piece piece = model.findPiece(xcord,yvalue);
		return piece;
	}
//	public boolean oppenentsChecker(int xcord,int yvalue,int turn, Piece type) {
//		//int attChecker = Piece.getType();
//		int piece =gameBoard.getGameboard()[yvalue][xcord];
//		
//		if ((attChecker ==1) || (attChecker ==3)) {
//			if((piece ==2) || (piece ==4)) {
//				System.out.println("checker is an enemy");
//				return true;
//			}else {
//				System.out.println("checker is not an enemy");
//			}
//		
//		}else {
//			if((piece ==1) || (piece==3)) {
//				System.out.println("checker is an enemy");
//				return true;
//			}else {
//				System.out.println("checker is not an enemy");
//			
//			}
//		}
//		
//		
//		return false;
//	}
//	
	

	public void moveChecker(int turn, boolean play) {
		String origin = "";
		String moveCord = "";
		boolean error = false;
		Scanner sc = new Scanner(System.in);
		while (play == true) {

			System.out.println("what peice do you want to move  ");
			origin = sc.next();

			System.out.print(origin);

			if (validateUserInput(origin)) {
				System.out.println("Please enter a letter and a number form a-h and 1-7 (a3)");
				error = true;
			} else {
				error = false;
			}
			while (error)
				;

			String xorigin = origin.substring(0, 1);
			int yorigin = Integer.parseInt(origin.substring(1, 2));
			int convertedXorigin = vaildate_x(xorigin);
			yorigin -= 1;

			System.out.println("where would you like to move it");
			moveCord = sc.next();

			if (validateUserInput(moveCord)) {
				System.out.println("Please enter a letter and a number form a-h and 1-7 (a3)");
				error = true;
			} else {
				error = false;
			}
			while (error)
				;

			String xmove = moveCord.substring(0, 1);
			int ymove = Integer.parseInt(moveCord.substring(1, 2));
			int convertedXmove = vaildate_x(xmove);
			ymove -= 1;
			boolean movingRight = movingRight(convertedXorigin,yorigin,convertedXmove,ymove);
			boolean movingDown = movingDown(convertedXorigin,yorigin,convertedXmove,ymove);
			//Move move = null;
			
			if(checkMove(convertedXorigin,yorigin,convertedXmove,ymove,movingRight,movingDown)) {
				
			}
		
			

		

			Move move = new Move(yorigin, convertedXorigin, ymove, convertedXmove);
		
			int type = gameBoard.getGameboard()[convertedXorigin][yorigin];
		
			model.addMove(convertedXorigin, yorigin, convertedXmove, ymove);
			System.out.print(move + "\n");

		
			gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()] = 0;
			gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;

			vaildate_x(xorigin);
			showingBoard();
			turn = changeTurn(turn);

		}

	}

	public boolean checkMove(int xorigin, int yorigin, int xmove, int ymove, boolean movingRight, boolean movingDown) {

		int type = gameBoard.getGameboard()[yorigin][xorigin];

		switch (type) {
		case 1:
			if (movingDown) {
				if (xmove == (xorigin + 1)) {
					movingRight = true;
					if (ymove == (yorigin + 1)) {
						return true;
					} else {
						System.out.println("ymove is not acceptable");
						return false;
					}
				} else if (xmove == (xorigin - 1)) {
					movingRight = false;
					if (ymove == (yorigin + 1)) {
						System.out.println("ymove is valid");
						return false;

					} else {
						System.out.println("xmove is not acceptable");

					}
				} else {
					System.out.println("wrong way");
				}

			}
		case 2:
			if (movingDown) {
				if (xmove == (xorigin + 1)) {
					movingRight = true;
					if (ymove == (yorigin - 1)) {
						System.out.println("ymove is acceptable");
						return true;

					} else {
						System.out.println("ymove is not acceptable");
						return false;
					}
				} else if (xmove == (xorigin - 1)) {
					System.out.println("xmove is acceptable");
					movingRight = false;
					if (ymove == (yorigin - 1)) {
						System.out.println("ymove is acceptable");
						return true;
					} else {
						System.out.println("xmove is not acceptable");
					}

				} else {
					System.out.println("wrong way");
					return false;
				}
			}
		case 3:
			if (movingDown) {
				if (xmove == (xorigin + 1)) {
					System.out.println("xmove is acceptable");
					movingRight = true;
					if (ymove == (yorigin + 1)) {
						System.out.println("ymove is acceptable");
						return true;
					} else {
						System.out.println("ymove is not acceptable");
						return false;
					}

				} else if (xmove == (xorigin - 1))
					;
				{
					System.out.println("xmove is acceptable");
					movingRight = false;
					if (ymove == (yorigin + 1)) {
						System.out.println("ymove is acceptable");
						return true;
					} else {
						System.out.println("ymove is not acceptable");
						return false;

					}
				}
			}

			else {
				System.out.println("xmove is not acceptable ");
			}

		}
		if (!movingDown) {
			if (xmove == (xorigin + 1)) {
				System.out.println("xmove is acceptable");
				movingRight = true;
				if (ymove == (yorigin - 1)) {
					System.out.println("ymove is acceptable");
					return true;

				} else {
					System.out.println("ymove is not acceptable");
					return false;
				}

			} else if (xmove == (xorigin - 1)) {

				System.out.println("xmove is acceptable");
				movingRight = false;
				if (ymove == (yorigin - 1)) {
					System.out.println("ymove is acceptable");
					return true;
				} else {
					System.out.println("ymove is not acceptable");
					return false;
				}

			} else {
				System.out.println("xmove is not acceptable ");
			}
		}
		return false;
	}

	

		
	
	public void checkTake() {
		// If red take , black piece +1 +1 empty , black piece +1 -1 empty then take and
		// delete
		// If black take , red piece -1 -1 empty , red piece -1 +1 empty then take and
		// delete
		// else invalid move
		// restart players turn and ask them to move again
	}

	public void king() {
		// if piece reached 0 or 8 , change peice type to king ( colour ) and end turn
	}

	public void checkKing() {
		// king type can move any way
	}

	public void undo() {
		// move list -1 ?
	}

	public void redo() {
		// throw list +1
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

	public int changeTurn(int turn) {
		if (turn == 1) {
			turn = 2;
			System.out.println("Its player 2s turn (white 2's");
		} else if (turn == 2) {
			turn = 1;
			System.out.println("Its player 1s turn (blacks 1's");
		}

		return turn;

	}

	public static Boolean validateUserInput(String input) {
		String xInput = input.substring(0, 1);

		int yInput = Integer.parseInt(input.substring(1, 2));

		boolean xletter = Character.isLetter(xInput.charAt(0));

		if ((!input.isEmpty() || (!xletter))) {
			return false;

		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Game controller = new Game();
		controller.populate();
		controller.showingBoard();
		int turn = 1;
		boolean play = true;
		do {
			controller.moveChecker(turn, play);
		} while (play == true);

		while (play == false)
			;
		{
			System.out.println("the game has ended");
		}
	}
}
