def solution(s):
    answer = 0
    # x, a => 분리: ba, nana 
    count_x = 0
    count = 0
    x = ''
    
    for i in s:
        
        # 둘다 0일때도 시작해서 x가 담기게됨
        if count_x == count:
            answer += 1
            x = i       # 새로 시작하게 초기화, 반복문안에서 슬라이싱 하지 말 것.
        
        if x == i:
            count_x += 1
        else :
            count += 1         
    
    return answer