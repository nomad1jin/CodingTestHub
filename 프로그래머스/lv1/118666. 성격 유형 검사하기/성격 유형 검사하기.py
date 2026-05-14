def solution(survey, choices):
    # 더 높은 점수 계산
    # 점수가 같으면 사전순으로 빠른 성격 유형 선택
    answer = ''
    dict = {1:3, 2:2, 3:1, 4:0, 5:1, 6:2, 7:3}
    score = {"R":0, "T":0, "C":0, "F":0, "J":0, "M":0, "A":0, "N":0}
    
    for sur, choice in zip(survey, choices):
        if choice < 4:
            score[sur[0]] += dict[choice]
        elif choice > 4 :
            score[sur[1]] += dict[choice]    
        
    # 지표별 큰 걸 어떻게 비교해서 출력하지? + 사전순
    if score["R"] >= score["T"]:
        answer += "R"
    else :
        answer += "T"
            
    if score["C"] >= score["F"]:
        answer += "C"
    else :
        answer += "F"
            
    if score["J"] >= score["M"]:
        answer += "J"    
    else :
        answer += "M"
            
    if score["A"] >= score["N"]:
        answer += "A"    
    else :
        answer += "N"
        
    return answer