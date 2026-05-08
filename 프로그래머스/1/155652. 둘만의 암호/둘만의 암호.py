def solution(s, skip, index):
    
    answer = ''    
    str = 'abcdefghijklmnopqrstuvwxyz'
        
    for i in skip:
        str = str.replace(i, "")
                
    for i in s:
        new_idx = str.find(i) + index
    
        # 길이를 벗어나지 않도록
        while new_idx >= len(str):
            new_idx -= len(str)

        answer += str[new_idx]
   
    return answer