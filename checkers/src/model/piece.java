package model;

public class piece {

	int redPiece;
	int blackPiece;
	int Piece;

	public piece(int redPiece, int blackPiece, int Piece) {
	super();
	this.redPiece = redPiece;
	this.blackPiece = blackPiece;
	this.Piece = Piece;

	}

	public int getRedPiece() {
		return redPiece;
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
		return "piece [redPiece=" + redPiece + ", blackPiece=" + blackPiece + ", Piece=" + Piece + "]";
	}


}
