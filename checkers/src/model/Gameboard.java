package model;

import java.util.Arrays;

public class Gameboard {

	int[][] gameboard = new int[][] { { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 2, 0, 2, 0, 2, 0, 2, 0, 2 }, { 2, 0, 2, 0, 2, 0, 2, 0, 2, 0 }, { 0, 2, 0, 2, 0, 2, 0, 2, 0, 2 } };
	
	

	public Gameboard(int[][] gameboard) {
		super();
		this.gameboard = gameboard;
	}

	public int[][] getGameboard() {
		return gameboard;
	}

	public void setGameboard(int[][] gameboard) {
		this.gameboard = gameboard;
	}

	@Override
	public String toString() {
		return "Gameboard [gameboard=" + Arrays.toString(gameboard) + "]";
	}

}
