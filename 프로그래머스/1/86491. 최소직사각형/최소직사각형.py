def solution(sizes):

    # 50,60 30,70 30,60 40,80
    max_w, max_h = 0, 0
    
    for size in sizes:
        size.sort()
        max_w = max(max_w, size[0])
        max_h = max(max_h, size[1])
        
    return max_w * max_h