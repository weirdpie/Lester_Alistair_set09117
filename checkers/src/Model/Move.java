package Model;

public class Move {
int xorigin;
int yorigin;

int xmove;
int ymove;

public Move(int xorigin, int yorigin, int xmove, int ymove) {
	super();
	this.xorigin = xorigin;
	this.yorigin = yorigin;
	this.xmove = xmove;
	this.ymove = ymove;
}
public int getXorigin() {
	return xorigin;
}
public void setXorigin(int xorigin) {
	this.xorigin = xorigin;
}
public int getYorigin() {
	return yorigin;
}
public void setYorigin(int yorigin) {
	this.yorigin = yorigin;
}
public int getXmove() {
	return xmove;
}
public void setXmove(int xmove) {
	this.xmove = xmove;
}
public int getYmove() {
	return ymove;
}
public void setYmove(int ymove) {
	this.ymove = ymove;
}

}
