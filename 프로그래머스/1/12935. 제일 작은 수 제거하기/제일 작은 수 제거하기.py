def solution(arr):
    
    if len(arr) > 1:
        # arr.sort(reverse=True)
        # arr.pop()
        arr.remove(min(arr))
        return arr
    
    else:
        return [-1]
