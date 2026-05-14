def solution(n, lost, reserve):
    answer = 0
    
    # 도난 당한 학생이지만, 본인이 체육복 여분이 있는 경우
    # 세트 교집합으로 제거
    lost_set = set(lost)
    reserve_set = set(reserve)
    both = (lost_set & reserve_set)
    lost_set -= both
    reserve_set -= both
    lend = len(lost_set)
    
    for i in lost_set:
        if i-1 in reserve_set:
            lend -= 1
            reserve_set.remove(i-1)
        elif i+1 in reserve_set:
            lend -= 1
            reserve_set.remove(i+1)
            
    answer = n - lend
    return answer