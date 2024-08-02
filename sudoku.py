import tkinter as tk
import random

# Generate a random Sudoku board
def generate_board():
    # Start with an empty board
    board = [[0 for _ in range(9)] for _ in range(9)]

    # Fill the diagonal 3x3 boxes
    for i in range(0, 9, 3):
        fill_box(board, i, i)

    # Fill the rest of the board
    fill_remaining_cells(board, 0, 3)

    return board

# Fill a 3x3 box with numbers from 1 to 9
def fill_box(board, row, col):
    nums = random.sample(range(1, 10), 9)
    for i in range(3):
        for j in range(3):
            board[row+i][col+j] = nums.pop()

# Check if a move is safe (doesn't violate Sudoku rules)
def is_safe(board, row, col, num):
    # Check the row and column
    for x in range(9):
        if board[row][x] == num or board[x][col] == num:
            return False

    # Check the 3x3 box
    start_row, start_col = row - row % 3, col - col % 3
    for i in range(3):
        for j in range(3):
            if board[i + start_row][j + start_col] == num:
                return False

    return True

# Fill the remaining cells in the board
def fill_remaining_cells(board, i, j):
    # If we reached the 8th row and 9th column, return True
    if i == 8 and j == 9:
        return True

    # If we reached the end of a row, move to the next row
    if j == 9:
        i += 1
        j = 0

    # If the cell is not empty, move to the next cell
    if board[i][j] != 0:
        return fill_remaining_cells(board, i, j + 1)

    # Try to fill the cell with a number
    for num in range(1, 10):
        if is_safe(board, i, j, num):
            board[i][j] = num
            if fill_remaining_cells(board, i, j + 1):
                return True

    # If no number can be placed in this cell, empty it and backtrack
    board[i][j] = 0
    return False

# Create the GUI
def create_gui(board):
    root = tk.Tk()
    cells = []
    for i in range(9):
        row = []
        for j in range(9):
            cell = tk.Entry(root, width=2)
            cell.grid(row=i, column=j)
            cell.insert(tk.END, str(board[i][j]))
            row.append(cell)
        cells.append(row)

    def cell_selected(event):
        cell = event.widget
        row, col = int(cell.grid_info()['row']), int(cell.grid_info()['column'])
        num = int(cell.get())
        if not is_safe(board, row, col, num):
            cell.delete(0, tk.END)
            cell.insert(tk.END, str(board[row][col]))

    root.bind('<Return>', cell_selected)
    root.mainloop()

# Generate a board and create the GUI
board = generate_board()
create_gui(board)
