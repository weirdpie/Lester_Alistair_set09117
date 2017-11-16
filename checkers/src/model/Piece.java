package model;

public class Piece {
//TYPE 
	//X AND Y 
	
	int type;
	int xPosition;
	int yPosition;
	

	public Piece(int type,int xPosition,int yPosition) {
	super();
	this.type= type; 
	this.xPosition =xPosition;
	this.yPosition = yPosition;

	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public int getxPosition() {
		return xPosition;
	}


	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}


	public int getyPosition() {
		return yPosition;
	}


	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}


	@Override
	public String toString() {
		return  "Piece [type=" + type + ", xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
	}



	
	

}
