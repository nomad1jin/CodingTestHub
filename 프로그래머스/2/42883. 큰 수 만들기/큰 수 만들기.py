def solution(number, k):
    stack = []
    answer = ''
    
    # 수를 어떤 방식으로 제거?
    # 큰 수가 아니면 제거 
    
    for num in number:
        while stack and stack[-1] < num and k > 0:           
            stack.pop()
            k -= 1

        stack.append(num)    
    
    # for문을 다 돌고나서 k가 남아있는 경우 - 뒤에부터 삭제
    if k:
        stack = stack[:-k]
 
    return answer.join(stack)
        