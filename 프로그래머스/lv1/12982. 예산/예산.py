def solution(d, budget):
    # 각 부서가 신청한 금액만큼 모두 지원. 정확히 딱 맞게
    # 그리디? 가장 적은 것부터 선택해야 최대가 됨
    answer = 0
    d.sort()
    
    for i in d:
        if budget >= i:
            budget -= i
            answer += 1
        else:
            break
        
    return answer