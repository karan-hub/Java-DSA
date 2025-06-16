def queens(n):
    board = [  ['.' for _  in range(n)] for _ in range(n)]
    solution =[]
    
    
    def is_valid(row , col):
        # check col
        for i in range(row):
            if board[i][col]=='Q':
                return False
        # check right dai
        i, j = row-1,col-1
        while i >=0 and j >= 0:
            if board[i][j] == 'Q':
                return False
            i -=1
            j -=1
            
        i, j = row-1,col+1
        while i >=0 and j < n:
            if board[i][j] == 'Q':
                return False
            i-=1
            j+=1
            
        return True
    
    def backtrack(row):
        if row == n:
            current=[]
            for r in board:
                current.append(".".join(r))
            solution.append(current)
            return
        for col in range(n):
            if is_valid(row , col):
                board[row][col]= 'Q'
                backtrack(row+1)
                board[row][col]='.'
    backtrack(0)
    return solution

solution =queens(4)

for i in solution:
   for j in i:
       print(j)
                