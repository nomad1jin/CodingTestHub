def solution(new_id):
    answer = ''
    new_id = new_id.lower()     # 1단계
    for id in new_id:           # 2단계
        if id.isalpha() or id.isdigit() or id in ["-", "_", "."]:
            answer += id
    
    while '..' in answer:
        answer = answer.replace('..', '.')   # 3단계
        
    answer = answer.rstrip('.').lstrip('.')  # 4단계
    
    if answer == '':                         # 5단계
        answer += 'a'
        
    if len(answer) >= 16:                    # 6단계
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer[:-1]
            
    while True:                              # 7단계
        if len(answer) >= 3:
            break
        answer += answer[-1]
        
    return answer