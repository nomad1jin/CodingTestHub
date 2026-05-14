# 페인트 길이가 엔미터 
# 벽은 1미터 n개, 롤러는 m미터

def solution(n, m, section):

    end_idx = 0
    paint = 0
    
    for i in range(0, len(section)):
        
        start_idx = section[i]
        
        # 마지막으로 칠한것보다 커야 새로 칠함
        if start_idx > end_idx:
            if end_idx <= section[-1]:
                end_idx = section[i] + m - 1
                paint += 1
        else :
            continue
        
        
    return paint