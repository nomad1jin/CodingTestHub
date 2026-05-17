import math

def solution(dartResult):
    # * 바로 전 점수와 해당 점수 2배, 중첩 가능
    # # 해당 점수만 마이너스, 중첩 가능
    # 중첩을 어떻게 계산하지
    answer = 0
    stack = []
    scores = []
    dict = {"S":1, "D":2, "T":3}
    
    # 10을 어떻게 해결?
    n = ''
    for i in range(len(dartResult)):  
    
        # 숫자인지 판별
        if dartResult[i].isnumeric():
            n += dartResult[i]
            stack.append(int(n))
        
        # 문자인지 판별
        elif dartResult[i].isalpha():
            if dartResult[i] in dict:
                n = dartResult[i]
                scores.append(math.pow(stack.pop(), dict[n]))
                n = ''                
        
        # 옵션인지 판별
        if dartResult[i] == "*":
            scores[-1] = scores[-1] * 2
            if len(scores) >= 2:
                scores[-2] = scores[-2] * 2
                
        elif dartResult[i] == "#":
            scores[-1] = scores[-1] * -1
        
    for score in scores:
        answer += score
                
    return answer