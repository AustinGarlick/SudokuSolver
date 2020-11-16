package SudokuSolver;





/*
 * This program solves a Sudoku Puzzle
 * given the user's change to the global grid variable
 */
public class SudokuSolver {
	
	/*
	 * Grid that will be solved, 0's are empty spaces
	 */
	int[][] grid = new int[][] {             {5,3,0,0,7,0,0,0,0},
	                   			 {6,0,0,1,9,5,0,0,0},
	                   			 {0,9,8,0,0,0,0,6,0},
	                   			 {8,0,0,0,6,0,0,0,3},
	                   			 {4,0,0,8,0,3,0,0,1},
	                   			 {7,0,0,0,2,0,0,0,6},
	                   			 {0,6,0,0,0,0,2,8,0},
	                   			 {0,0,0,4,1,9,0,0,5},
	                   			 {0,0,0,0,8,0,0,0,0} };
	                   			 
	                   	
	                   			 
	/*
	 * This method determines if the given number is
	 * valid at x,y position in the grid
	 * 
	 * @param x  the column 
	 * @param y  the row
	 * @param n  the number to try
	 * 
	 * @return   returns true if n is valid at position x,y
	 * 		     returns false otherwise       			 
	 */
	public static boolean possible(int y,int x,int n)
	{	
		return false;
	}

	/*
	 * Solves the given grid inputs following sudoku rules
	 */
	public static void solve()
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Sudoku Solver 2.1.0 Copyright 2020 Austin Garlick");
		
		
	}

	
	
	
	
}
