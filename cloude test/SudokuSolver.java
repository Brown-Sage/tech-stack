import java.util.Scanner;

class SudokuSolver {
    private static final int GRID_SIZE = 9;

    public static void solveSudoku(int[][] board) {
        if (solveSudokuHelper(board, 0, 0)) {
            printSolution(board);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }

    private static boolean solveSudokuHelper(int[][] board, int row, int col) {
        // If we have reached the last cell, the Sudoku is solved
        if (row == GRID_SIZE - 1 && col == GRID_SIZE) {
            return true;
        }

        // Move to the next row if we have reached the end of the current row
        if (col == GRID_SIZE) {
            row++;
            col = 0;
        }

        // Skip non-empty cells
        if (board[row][col] != 0) {
            return solveSudokuHelper(board, row, col + 1);
        }

        // Try placing numbers from 1 to 9
        for (int num = 1; num <= GRID_SIZE; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                // Recurse to solve the remaining cells
                if (solveSudokuHelper(board, row, col + 1)) {
                    return true;
                }
            }

            // If the current number doesn't lead to a solution, backtrack
            board[row][col] = 0;
        }

        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Check the row
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int subGridRowStart = (row / 3) * 3;
        int subGridColStart = (col / 3) * 3;
        for (int i = subGridRowStart; i < subGridRowStart + 3; i++) {
            for (int j = subGridColStart; j < subGridColStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printSolution(int[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[GRID_SIZE][GRID_SIZE];

        System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        solveSudoku(board);
    }
}