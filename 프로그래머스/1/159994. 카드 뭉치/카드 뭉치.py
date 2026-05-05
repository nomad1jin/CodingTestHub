def solution(cards1, cards2, goal):
    # 카드는 한장씩, 재사용 불가.
    # 넘어가기 & 단어 순서 바꾸기 불가.
    # goal과 반복문, 조건문으로 비교하는데. 
    card1_idx = 0
    card2_idx = 0
    result = ''
    result = "Yes"
    
    for word in goal:
        if card1_idx < len(cards1) and cards1[card1_idx] == word:
            card1_idx += 1
        elif card2_idx < len(cards2) and cards2[card2_idx] == word:
            card2_idx += 1
        else:
            result = 'No'
            break
            
    return result