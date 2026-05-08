def solution(players, callings):
    # 현재 등수 선수 이름 players
    # 해설진이 부르는 이름들 callings
    # 부르는걸 players에서 찾고, 인덱스로 스위치
    
    dic = {name : idx for idx, name in enumerate(players)}
    for name in callings:
        second = dic[name]
        first = players[second - 1]
        players[second] = first
        players[second - 1] = name
        
        dic[name] -= 1
        dic[first] += 1
                
    return players