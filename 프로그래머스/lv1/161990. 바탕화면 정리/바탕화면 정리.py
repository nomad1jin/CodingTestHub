def solution(wallpaper):
    # 빈칸은 .  파일이 있는 칸은 #
    # 최소한의 드래그로 모든 파일을 한번에 지우려고 함
    # 중간에 최소값을 구하는 쪽으로 길 세지마라 
    
    x, y = [], []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == '#':
                x.append(i)
                y.append(j)

    return [min(x), min(y), max(x)+1, max(y)+1]