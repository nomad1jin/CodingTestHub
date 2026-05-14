def solution(board, moves):
    answer = 0
    stack = []
    # 인형 상태 2차원 배열 board와 크레인 위치 moves
    # 0은 빈칸, 같은 숫자는 2개가 쌓이면 터뜨림
    # 열 기준!!!!!!!!
    for move in moves:
        for i in range(len(board)):
            if board[i][move - 1] == 0:
                continue
            else :
                crein = board[i][move - 1]
                board[i][move - 1] = 0  # 뽑았으면 0으로 바꿔줘야함
                
                if stack and stack[-1] == crein:
                        answer += 2
                        stack.pop()
                else :
                    stack.append(crein)
                    
                # 열에서 첫 인형 하나만 뽑게끔 브레이크    
                break
            
    return answer