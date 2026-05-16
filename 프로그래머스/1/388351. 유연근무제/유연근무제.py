def solution(schedules, timelogs, startday):
    answer = 0
    # 출근 희망 시간
    # 일주일 출근 시각
    # 반복문 두번, startday를 기준으로
    for i in range(len(timelogs)):
        check = True
        
        for j in range(7):
            day = (startday + j - 1) % 7 + 1
            if day == 6 or day == 7:
                continue
            
            hour = schedules[i] // 100
            minute = schedules[i] % 100
            time = hour * 60 + minute
            
            hour2 = timelogs[i][j] // 100
            minute2 = timelogs[i][j] % 100
            time2 = hour2 * 60 + minute2
            
            if time2 > time + 10:
                check = False
                break
        
        if check:
            answer += 1
                    
    return answer