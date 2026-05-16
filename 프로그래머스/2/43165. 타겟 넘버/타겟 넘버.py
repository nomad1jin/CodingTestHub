def solution(numbers, target):
    answer = 0
    
    def dfs(idx, total):
        nonlocal answer
        
        # 숫자를 다 사용한 경우
        if idx == len(numbers):
            # 타겟과 같으면 추가
            if total == target:
                answer += 1
            return 
        
        # 더하기
        dfs(idx + 1, total + numbers[idx])
        
        # 빼기
        dfs(idx + 1, total - numbers[idx])
        
    dfs(0, 0)
    
    return answer