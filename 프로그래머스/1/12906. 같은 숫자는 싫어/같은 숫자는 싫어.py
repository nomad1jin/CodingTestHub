def solution(arr):
    stack = []
    if len(stack) == 0:
        stack.append(arr[0])
    
    arr = arr[1:]
    for i in arr:
        if stack[-1] != i:
            stack.append(i)

    return stack