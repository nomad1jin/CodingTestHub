def solution(t, p):
    # p의 길이만큼 t를 여러개 스플릿해야함
    # 그리고 p와 대소비교해서 작은 수 개수 출력

    arr = list(map(str, t))
    answer = 0
    
    for i in range(len(t) - len(p) + 1):
        
        string = ''
        
        for j in range(len(p)):
            string += arr[i + j]
                    
        if int(string) <= int(p):
            answer += 1
        
        
   
    return answer