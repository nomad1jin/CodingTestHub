import sys

def check_win(board, turn):
    #가로 빙고 췤
    for i in range(3):
        if board[i][0] == turn and board[i][1] == turn and board[i][2] == turn:
            return True
            
    #세로 빙고 췤
    for j in range(3):
        if board[0][j] == turn and board[1][j] == turn and board[2][j] == turn:
            return True
            
    #대각선 빙고 췤
    if board[0][0] == turn and board[1][1] == turn and board[2][2] == turn:
        return True
    if board[0][2] == turn and board[1][1] == turn and board[2][0] == turn:
        return True
        
    return False

def main():
    while True:
        try:
            line = sys.stdin.readline().strip()
        except:
            break
            
        if line == 'end' or not line:
            break
        
        #1차원 -> 2차원
        board = []
        for i in range(0, 9, 3):
            board.append(list(line[i:i+3]))
            
        #X랑 O 개수 세보자잉
        x_count = 0 
        o_count = 0
        
        for i in range(3):
            for j in range(3):
                if board[i][j] == 'X':
                    x_count += 1
                elif board[i][j] == 'O':
                    o_count += 1
        
        #승리 여부 확인
        x_win = check_win(board, 'X')
        o_win = check_win(board, 'O')
        
        #X와 O 개수 조건(X>=O)
        if not (x_count == o_count or x_count == o_count + 1):
            print("invalid")
            continue
            
        #둘 다 이기는건 불가능
        if x_win and o_win:
            print("invalid")
            continue
            
        #X가 이긴 경우(X = O + 1)
        if x_win: 
            if x_count == o_count + 1:
                print("valid")
            else:
                print("invalid")
                
        #O가 이긴 경우(X = O)
        elif o_win:
            if x_count == o_count:
                print("valid")
            else:
                print("invalid")
        
        # 무승부(X=5, O=4)
        else:
            if x_count == 5 and o_count == 4:
                print("valid")
            else:
                print("invalid")

main()