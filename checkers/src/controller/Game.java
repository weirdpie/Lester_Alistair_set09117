
package controller;

import java.util.Scanner;


import model.Model;
import model.Move;
import model.Piece;
import model.GameBoard;

import java.util.*;

public class Game {

	

	Model model = new Model();

	GameBoard gameBoard = new GameBoard();

	int blackPieces =12;
	int whitePieces =12;
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
		if (xmove ==(xorigin +1)) {
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
	public boolean oppenentsChecker(int xcord,int yvalue,int turn, Piece piece) {
		int attChecker = piece.getType();
		int checker =gameBoard.getGameboard()[yvalue][xcord];
		
		if ((attChecker ==1) || (attChecker ==3)) {
			if((checker ==2) || (checker ==4)) {
				System.out.println("checker is an enemy");
				return true;
			}else {
				System.out.println("checker is not an enemy");
			}
		
		}else {
			if((checker ==1) || (checker==3)) {
				System.out.println("checker is an enemy");
				return true;
			}else {
				System.out.println("checker is not an enemy");
			
			}
		}
	
	
		return false;
}
	public boolean jumpCheck (int xorgin,int yorigin, int xmove, int ymove, boolean movingRight, boolean movingDown) {
		if (movingDown) {
			if (movingRight) {
				if (gameBoard.getGameboard()[ymove+1][xmove+1] == 0) {
					System.out.println("moving down and right and space is clear");
					return true;
				}else {
					if (gameBoard.getGameboard()[ymove+1][xmove-1] == 0) {
						System.out.println("moving down and left and space is clear");
						return true; 
					}
				}
			}else {
				if (movingRight) {
					if (gameBoard.getGameboard()[ymove-1][xmove+1] == 0) {
						System.out.println("moving up and right and space is clear");
						return true; 
					}
				}else {
					if (gameBoard.getGameboard()[ymove-1][xmove-1] == 0) {
						System.out.println("moving up and left and space is clear");
						return true;
					}
				}
				return false;
			}
		
		
		if (movingRight) {
			if (gameBoard.getGameboard()[ymove+1][xmove+1]==0) {
				System.out.println("jump is acceptable");
				return true; 
			}else {
				System.out.println("jump is not acceptable");
				return false;
			}
		}else {
			if (gameBoard.getGameboard()[ymove+1][xmove-1]==0) {
				return true;
			}else {
				
			}
		}
		
	}
		return false;
	}
	public void removePiece (int xPiece,int yPiece) {
		System.out.println("removing peice");
		Piece piece =model.findPiece(xPiece, yPiece);
		if(piece.getType()==1 || (piece.getType()==3) ) {
			model.blackPieces.remove(piece);
			blackPieces -= 1;
		}else {
			model.whitePieces.remove(piece);
			whitePieces -= 1;
		}
		gameBoard.getGameboard()[xPiece][yPiece] =0;
	}
	

	public Move moveChecker(int turn, boolean play) {
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
			
			Piece piece = validateChecker(convertedXorigin, yorigin);

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
			Move move = null;
			
			if(checkMove(convertedXorigin,yorigin,convertedXmove,ymove,movingRight,movingDown)) {
				if (spaceOccupied (convertedXmove,ymove)) {
					System.out.println("space is occupied");
					if(oppenentsChecker(convertedXmove, ymove,turn,piece)) {
						if (jumpCheck(convertedXorigin,yorigin,convertedXmove,ymove,movingRight,movingDown)) {
							if(movingRight) {
								if(movingDown) {
									move = new Move(convertedXorigin,yorigin,convertedXmove +1,ymove+1);
									model.moves.add(move);
									removePiece(convertedXmove,ymove);
									
								}else {
									move = new Move(convertedXorigin,yorigin,convertedXmove -1,ymove+1);
									model.moves.add(move);
									removePiece(convertedXmove,ymove);
								}
							}else {
								if(movingDown) {
									move = new Move(convertedXorigin,yorigin,convertedXmove -1,ymove+1);
									model.moves.add(move);
									removePiece(convertedXmove,ymove);
								}else {
									move = new Move(convertedXorigin,yorigin,convertedXmove -1,ymove-1);
									model.moves.add(move);
									removePiece(convertedXmove,ymove);
								}
							}
						}
						
					}
					
				}else {
					System.out.println("space is not taken");
					move = new Move(convertedXorigin,yorigin,convertedXmove -1,ymove-1);
					model.moves.add(move);
					if (king(piece,move)) {
						piece = ConvertToKing(piece,move);
						model.updatePiece(move, piece, turn);
						
						showingBoard();
						return move;
					}
					model.updatePiece(move, piece, turn);
					updateBoard(move);
					showingBoard();
					return move;
				}
				
			}else {
				System.out.println("error in move fucntion");
			}
			if (king(piece,move)) {
				piece = ConvertToKing(piece,move);
				model.updatePiece(move, piece,turn);
				updateBoard(move);
				showingBoard();
				return move;
			}
				
		
			

		

		//	Move move = new Move(yorigin, convertedXorigin, ymove, convertedXmove);
		
//			int type = gameBoard.getGameboard()[convertedXorigin][yorigin];
//		
//			model.addMove(convertedXorigin, yorigin, convertedXmove, ymove);
//			System.out.print(move + "\n");
//
//		
//			gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()] = 0;
//			gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;
//
//			vaildate_x(xorigin);
//			showingBoard();
			turn = changeTurn(turn);

		}
return null;
	}
	
	public void updateBoard(Move move) {
		
		int type = gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()];
		
			gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()] = 0;
			gameBoard.getGameboard()[move.getYmove()][move.getXmove()] = type;
		
	}
	public boolean king (Piece piece, Move move) {
		if(piece.getType()==1) {
			if(move.getYmove()==7) {
				System.out.println("piece has become king");
				return true;
				
			}else {
				
			}
		}
		if (piece.getType()==2) {
			if(move.getYmove()==0) {
				System.out.println("piece has become king");
				return true;
			}else {
				
			}
		}
		return false;
	}
	public Piece ConvertToKing(Piece piece, Move move) {
		int type = 0; 
		if(piece.getType()==1) {
			piece.setType(3);
			type =3;
		}else if (piece.getType()==2) {
			piece.setType(4);
			type =4;
		}
		gameBoard.getGameboard()[move.getYorigin()][move.getXorigin()]= 0;
		gameBoard.getGameboard()[move.getYmove()][move.getXmove()]= type;
		return piece;
	}
	public int blackWins() {
		if (blackPieces ==0) {
			return 1;
			
		}else if(whitePieces==0) {
			return 2;
		}
		return 0;
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
						return true;

					} else {
						System.out.println("ymove is not acceptable");
						return false;

					}
				} else {
					System.out.println("wrong way");
					return false;
				}

			}
		case 2:
			if (!movingDown) {
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
						System.out.println("ymove is not acceptable");
						return false;
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

	

		boolean xletter = Character.isLetter(xInput.charAt(0));

		if ((!input.isEmpty() || (!xletter))) {
			return false;

		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		
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
