package SudokuSolver;

import java.util.StringJoiner;

/*
 * This program solves a Sudoku Puzzle
 * given the user's change to the global grid variable
 */
public class SudokuSolver {
	
	/*
	 * Grid that will be solved, 0's are empty spaces
	 */
	static int[][] grid = new int[][] { {5,3,0,0,7,0,0,0,0},
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
		//Check Row (y stays the same)
		for (int i = 0; i < 9; i++)
		{
			if (grid[y][i] == n)
			{
				return false;
			}
		}
		
		//Check Column (x stays the same)
		for (int i = 0; i < 9; i++)
		{
			if (grid[i][x] == n)
			{
				return false;
			}
		}
		
		//Check 3x3 square (use mod%)
		int x0 = Math.floorDiv(x, 3) * 3;
		int y0 = Math.floorDiv(y, 3) * 3;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (grid[y0+i][x0+j] == n)
				{
					return false;
				}
			}
		}		
		return true;
	}

	/*
	 * Solves the given grid inputs following sudoku rules
	 */
	public static void solve()
	{
		for (int y = 0; y < 9; y++)
		{
			for (int x = 0; x < 9; x++)
			{
				if (grid[y][x] == 0)
				{
					for (int n = 1; n < 10; n++)
					{
						if (possible(y,x,n))
						{
							grid[y][x] = n;
							solve();
							grid[y][x] = 0;
						}
					}
					return;
				}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Sudoku Solver 2.1.0 Copyright 2020 Austin Garlick\n");
		
		solve();
		
        String lineSplit = "";
        StringJoiner splitJoiner = new StringJoiner("+", "|", "|");
        for (int index = 0; index < grid[0].length; index++) {
            splitJoiner.add(String.format("%3s", "").replace(" ", "-"));
        }
        lineSplit = splitJoiner.toString();
        for (int[] row : grid) {
            StringJoiner sj = new StringJoiner(" | ", "| ", " |");
            for (int col : row) {
                sj.add(String.format("%01d", col));
            }
            System.out.println(lineSplit);
            System.out.println(sj.toString());
        }
        System.out.println(lineSplit);
	}
	
}
