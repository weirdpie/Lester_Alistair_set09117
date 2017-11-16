package model;

import java.util.Arrays;

public class GameBoard {

	int[][] gameboard = new int[][] { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 2, 0, 2, 0, 2, 0, 2, 0 }, { 0, 2, 0, 2, 0, 2, 0, 2 }, { 2, 0, 2, 0, 2, 0, 2, 0 } };

	public GameBoard() {
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
		return "GameBoard [gameboard=" + Arrays.toString(gameboard) + "]";
	}

}
