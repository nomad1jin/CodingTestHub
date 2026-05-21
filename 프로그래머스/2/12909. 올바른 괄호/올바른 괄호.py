def solution(s):
    
    # (())을 어떻게 허용 시키지 
    # ( => push
    # ) => pop
    
    stack = []
    
    if s[0] == ")":
        return False
    
    for i in s:   
        if i == "(":
            stack.append(i)
                
        elif stack and i == ")":
            stack.pop()

    if stack:
        return False
            
    return True