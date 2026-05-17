def solution(keymap, targets):
    answer = []
    # 여러 keymap을 가지고 각 target을 비교하는것.
    # 키맵을 순회해서 문자열 별 더 작은 키 횟수를 저장
    dict = {}
    
    for key in keymap: 
        for idx, char in enumerate(key):
            
            # 없는 경우 딕셔너리에 추가, 있으면 최소 비교
            if char not in dict:
                dict[char] = idx + 1
            else :
                dict[char] = min(dict[char], idx + 1)
        
    for target in targets:
        count = 0
        
        for t in target:
            if t in dict:
                count += dict[t]
            else :
                count = -1
                break
        
        answer.append(count)
        
    return answer