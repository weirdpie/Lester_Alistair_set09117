

package controller;

public class Gameboard {
    public Gameboard() {
    }

    public static void main(String[] args) {
    	 int blackPieces = 12;
    	    int redPieces = 12;
    	    final int rows = 8;
    	    final int columns = 8;
        int[][] gameboard = new int[][]{
        	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        	{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
        	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
        	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2},
        	{2, 0, 2, 0, 2, 0, 2, 0, 2, 0},
        	{0, 2, 0, 2, 0, 2, 0, 2, 0, 2}};
        	
        	
        System.out.println("yee");
        showingBoard(gameboard);
    }

    public static void showingBoard(int[][] x) {
        for(int row = 0; row < x.length; ++row) {
            for(int column = 0; column < x[row].length; ++column) {
                System.out.print(x[row][column]);
            }

            System.out.println();
        }

    }

    public void printBoard() {
        System.out.println("  ╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗");
        System.out.println("  ║║░░░║║░░░║║░░░║║░░░║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║░░░║║░░░║║░░░║║░░░║║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║║░░░║║░░░║║░░░║║░░░║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║░░░║║░░░║║░░░║║░░░║║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║║░░░║║░░░║║░░░║║░░░║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║░░░║║░░░║║░░░║║░░░║║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║║░░░║║░░░║║░░░║║░░░║");
        System.out.println("  ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.println("  ║░░░║║░░░║║░░░║║░░░║║");
        System.out.println("  ╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝");
    }
    
}
