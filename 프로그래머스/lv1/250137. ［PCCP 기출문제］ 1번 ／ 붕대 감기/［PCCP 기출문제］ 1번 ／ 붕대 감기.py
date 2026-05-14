def solution(bandage, health, attacks):
    # 공격당하면 붕대감기는 취소되고 다시 사용
    # 체력 0 이하 죽음
    # 시간과 회복량, 최대 체력, 공격 시간과 피해량 2차원 
    current_health = health
    bandage_time = 0
    attacks_idx = 0
    last_time = attacks[-1][0]
    
    for current_time in range(1, last_time + 1):
        
        #공격
        if current_time == attacks[attacks_idx][0]:
            current_health -= attacks[attacks_idx][1]
            bandage_time = 0
            attacks_idx += 1
            
            #죽으면 종료
            if current_health <= 0 :
                return -1 
            
        #회복
        else :
            current_health += bandage[1]
            bandage_time += 1
            if bandage_time == bandage[0]:
                current_health += bandage[2]
                bandage_time = 0
                
            # 체력 제한
            current_health = min(health, current_health)
            

    return current_health