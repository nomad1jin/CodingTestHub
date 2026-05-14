def solution(name, yearning, photo):
    answer = []
#   그리움 점수를 모두 합산 = 추억 점수
#   문자열배열, 그리움점수 정수 배열, 이름 이차원
#   이름 없는 경우엔 0 
    
    dict = {}
    for n,y in zip(name, yearning):
        dict[n] = y
    
    for p in photo:
        total = 0
        
        for name in p:
            #딕셔너리 키가 있으면 sum, 아닐경우 0 
            total += dict.get(name, 0)
        answer.append(total)
        
    return answer