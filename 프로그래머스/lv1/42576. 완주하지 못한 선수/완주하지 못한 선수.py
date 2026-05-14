def solution(participant, completion):
    answer = ''
    
    dict = {}
    
    for participated in participant:
        if participated in dict:
            dict[participated] += 1
        else:
            dict[participated] = 1
    
    for completed in completion:
        dict[completed] -= 1
        
    for name, count in dict.items():
        if count == 1:
            answer += name
            
    return answer