package model;
import java.util.ArrayList;
public class Model {
public ArrayList<Move> moves = new ArrayList<Move>();
ArrayList<Move> temp = new ArrayList<Move>();
public ArrayList<Piece> blackPieces = new ArrayList<Piece>();
public ArrayList<Piece> whitePieces = new ArrayList<Piece>();
int i = 1;
	public void populate() {
		
		blackPieces.add(new Piece(1,0,0));
		blackPieces.add(new Piece(1,2,0));
		blackPieces.add(new Piece(1,4,0));
		blackPieces.add(new Piece(1,6,0));
		blackPieces.add(new Piece(1,1,1));
		blackPieces.add(new Piece(1,3,1));
		blackPieces.add(new Piece(1,5,1));
		blackPieces.add(new Piece(1,7,1));
		blackPieces.add(new Piece(1,0,2));
		blackPieces.add(new Piece(1,3,2));
		blackPieces.add(new Piece(1,5,2));
		blackPieces.add(new Piece(1,7,2));
		
		whitePieces.add(new Piece(2,1,5));
		whitePieces.add(new Piece(2,3,5));
		whitePieces.add(new Piece(2,5,5));
		whitePieces.add(new Piece(2,7,5));
		whitePieces.add(new Piece(2,0,6));
		whitePieces.add(new Piece(2,2,6));
		whitePieces.add(new Piece(2,4,6));
		whitePieces.add(new Piece(2,6,6));
		whitePieces.add(new Piece(2,1,7));
		whitePieces.add(new Piece(2,3,7));
		whitePieces.add(new Piece(2,5,7));
		whitePieces.add(new Piece(2,7,7));

	}
	
	
	public Move addMove(int xorigin,int yorigin,int xmove, int ymove) {
		Move move = new Move(xorigin,yorigin,xmove,ymove);
		moves.add(move);
		
		System.out.println("move added");
		return move;
	}
	public Piece findPiece(int xcord,int yvalue) {
		for(Piece peice : blackPieces) {
			if((xcord == peice.getxPosition()) && (yvalue == peice.getyPosition())) {
				return peice;
			}
		}
		
		for(Piece piece : whitePieces) {
			if((xcord == piece.getxPosition()) && (yvalue == piece.getyPosition())) {
				return  piece;
			}
		}
		
		return null;
		
	}
	
	public void updatePiece(Move move, int turn, Piece piece) {
		int i=0;
		
		if(turn ==1) {
			for (Piece c: blackPieces) {
				if ((piece.getxPosition()== c.getxPosition())&& (piece.getyPosition() ==c.getyPosition()) ) {
					piece.setxPosition(move.getXmove());
					piece.setxPosition(move.getYmove());
					blackPieces.set(i,piece);
				}
				i++;
			}
			
		}else if (turn ==2) {
			for (Piece c: whitePieces) {
				if ((piece.getxPosition()== c.getxPosition())&& (piece.getyPosition() ==c.getyPosition()) ) {
					piece.setxPosition(move.getXmove());
					piece.setxPosition(move.getYmove());
					whitePieces.set(i,piece);
	}
				i++;
			}
	}else {
		System.out.println("piece not found");
	}
	}
	
	
	
	
	
	}
	
	


