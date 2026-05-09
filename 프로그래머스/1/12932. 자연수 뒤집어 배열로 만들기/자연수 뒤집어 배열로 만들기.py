def solution(n):
    answer = []
    number = list(str(n))
    number.reverse()
    
    for k in number:
        answer.append(int(k))
    
    return answer