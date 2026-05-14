# 가장 큰 돗자리 확인 
# 현재 위치에서 k x k 가능?

def solution(mats, park):
   
    mats.sort(reverse=True)
    
    for mat in mats:
        for i in range(len(park)):
            for j in range(len(park[0])):
                
                # check True면 매트 반환
                if check(mat, park, i, j):
                    return mat

    # 아무런 돗자리도 깔 수 없음
    return -1
            
def check(mat, park, start_r, start_c):
    
    for r in range(start_r, start_r + mat):
        for c in range(start_c, start_c + mat):
            
            # 돗자리 범위 쳌
            if r >= len(park) or c >= len(park[0]):
                return False
            
            # 빈자리 쳌
            if park[r][c] != "-1":
                return False
                        
    return True

