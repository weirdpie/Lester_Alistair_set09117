package model;

public class Piece {

	int redPiece;
	int blackPiece;
	int Piece;
	int x;
	int y;
	

	public Piece(int redPiece, int blackPiece, int Piece,int x,int y) {
	super();
	this.redPiece = redPiece;
	this.blackPiece = blackPiece;
	this.Piece = Piece;
	this.x =x;
	this.y = y;

	}

	public int getRedPiece() {
		return redPiece;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRedPiece(int redPiece) {
		this.redPiece = redPiece;
	}

	public int getBlackPiece() {
		return blackPiece;
	}

	public void setBlackPiece(int blackPiece) {
		this.blackPiece = blackPiece;
	}

	public int getPiece() {
		return Piece;
	}

	public void setPiece(int piece) {
		Piece = piece;
	}

	@Override
	public String toString() {
		return "Piece [redPiece=" + redPiece + ", blackPiece=" + blackPiece + ", Piece=" + Piece + ", x=" + x + ", y="
				+ y + "]";
	}

	

}
