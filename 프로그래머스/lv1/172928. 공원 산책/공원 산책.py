# E 5 동쪽으로 5칸 

def solution(park, routes):

    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    move_types = ["E", "W", "S", "N"]
        
    for r in range(len(park)):
        for c in range(len(park[r])):
            if park[r][c] == 'S':
                x, y = r, c
                
                
    for route in routes:
        type, dist = route.split()
        dist = int(dist)
        nx, ny = x, y
        possible = True
        
        # 방향 찾기      
        for d in range(4):
            if type == move_types[d]: 
                
                # 한칸씩 이동
                for _ in range(dist):
                    nx += dx[d]
                    ny += dy[d]
                
                    # 범위 쳌
                    if nx < 0 or ny < 0 or nx >= len(park) or ny >= len(park[0]):
                        possible = False
                        break

                    # 장애물
                    if park[nx][ny] == "X":
                        possible = False
                        break
        
        # 루트별로 가능한지 체크
        if possible:
            x, y = nx, ny

    return [x, y]