nQeen.py






def print_board(board, n):
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                print("Q", end=" ")
            else:
                print(".", end=" ")
        print()
    print()


def is_safe(board, row, col, n):

    for i in range(row):
        if board[i][col] == 1:
            return False


    i = row - 1
    j = col - 1
    while i >= 0 and j >= 0:
        if board[i][j] == 1:
            return False
        i -= 1
        j -= 1


    i = row - 1
    j = col + 1
    while i >= 0 and j < n:
        if board[i][j] == 1:
            return False
        i -= 1
        j += 1

    return True


def solve_nqueens(board, row, n):
    if row == n:
        return True

    for col in range(n):
        if is_safe(board, row, col, n):
            board[row][col] = 1
            if solve_nqueens(board, row + 1, n):
                return True
            board[row][col] = 0
    return False


def solve_nqueens_with_first_queen(n, first_row, first_col):
    
    board = [
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0],
        [0, 0, 0, 0]
    ]

    board[first_row][first_col] = 1 

    if solve_nqueens(board, first_row + 1, n):
        print("Final N-Queens Solution:")
        print_board(board, n)
    else:
        print("No solution possible")



n = 4
first_row = 1
first_col = 1
solve_nqueens_with_first_queen(n, first_row, first_col)