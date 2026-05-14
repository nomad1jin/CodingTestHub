def solution(numbers, hand):
    # 키패드를 2차원 배열로 저장해야할까?
    answer = ''
    keypad = {1:(0,0), 2:(0,1), 3:(0,2),
             4:(1,0), 5:(1,1), 6:(1,2),
             7:(2,0), 8:(2,1), 9:(2,2),
             '*':(3,0), 0:(3,1), '#':(3,2)}
    left = keypad['*']
    right = keypad['#']

    for number in numbers:
        
        if number == 1 or number == 4 or number == 7:
            answer += "L"
            left = keypad[number]
            
        elif number == 3 or number == 6 or number == 9:
            answer += "R"
            right = keypad[number]
            
        else :
            # 상하좌우에 따라 더 가까운 손가락 사용
            # 거리가 같다면 손잡이 hand 파악
            # abs(x1-x2) + abs(y1-y2)
            left_d, right_d = 0, 0
            
            for a, b, c in zip(left, right, keypad[number]):
                left_d += abs(a - c)
                right_d += abs(b - c)
                
            if left_d < right_d:
                answer += "L"
                left = keypad[number]
                    
            elif left_d > right_d:
                answer += "R"
                right = keypad[number]
                
            else:
                if hand == "right":
                    answer += "R"
                    right = keypad[number]
                else :
                    answer += "L"
                    left = keypad[number]
            
    return answer