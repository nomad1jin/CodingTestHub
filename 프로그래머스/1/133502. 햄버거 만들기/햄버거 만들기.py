def solution(ingredient):
    answer = 0
    sequence = [1, 2, 3, 1]
    # 조리된 순서대로 아래서부터 위로 쌓임, 쌓으면 재료 리스트에서 빼기
    
    stack = []
    
    for ingre in ingredient:
        stack.append(ingre)
        count = 0
        
        if len(stack) >= 4:
            st = stack[-4:]
            
            for seq, s in zip(sequence, st):
                if seq == s:
                    count += 1
                    
            if count == 4:
                answer += 1
                stack.pop()
                stack.pop()
                stack.pop()
                stack.pop()
 
    return answer