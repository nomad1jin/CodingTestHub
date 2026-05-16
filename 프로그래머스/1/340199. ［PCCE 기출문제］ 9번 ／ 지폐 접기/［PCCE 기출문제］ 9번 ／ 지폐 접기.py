def solution(wallet, bill):
    answer = 0
    
    wallet.sort()
    bill.sort()
        
    # 아무튼 지갑보다 큰 지폐
    while wallet[0] < bill[0] or wallet[1] < bill[1]:
    
        # 지폐 가로가 더 긴 경우
        if bill[0] > bill[1]:
            bill[0] //= 2
            
        # 지폐 세로가 더 긴 경우 [60, 100] -> [60, 50]
        # 정렬이 깨지므로 한번 더 해줄것
        else :
            bill[1] //= 2
            bill.sort()
        
        answer += 1
        
    return answer