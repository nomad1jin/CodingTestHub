def solution(video_len, pos, op_start, op_end, commands):
    m, s = video_len.split(":")
    total = int(m) * 60 + int(s)
    
    pm, ps = pos.split(":")
    pos = int(pm) * 60 + int(ps) 
    
    osm, oss = op_start.split(":")
    op_start = int(osm) * 60 + int(oss)
    
    oem, oes = op_end.split(":")
    op_end = int(oem) * 60 + int(oes)
    
    if op_start <= pos <= op_end:
        pos = op_end
    
    for i in commands:
        if i == "next":
            pos += 10
        else:
            pos -= 10
    
        pos = max(0, pos)
        pos = min(total, pos)

        if op_start <= pos <= op_end:
            pos = op_end
            
    m = pos // 60
    s = pos % 60
            
    answer = f"{m:02d}:{s:02d}"
    return answer