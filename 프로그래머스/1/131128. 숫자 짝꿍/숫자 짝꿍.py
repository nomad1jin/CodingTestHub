def solution(X, Y):
    # 짜꿍이없으면 -1, 00일경우 0
    # 공통 숫자를 찾고 거기서 만들 수 있는 가장 큰 정수를 만들어
    dict_x = {}
    dict_y = {}
    answer = ''
    
    for x in X:
        if x not in dict_x:
            dict_x[x] = 1
        else :
            dict_x[x] += 1
        
    for y in Y:
        if y not in dict_y:
            dict_y[y] = 1
        else :
            dict_y[y] += 1
            
    # 반복문을 돌아서 두 딕셔너리 같은 키의 값을 비교하고싶음
    # 그리고 대소비교해서 값이 더 작은걸로 선택
    for key_x in dict_x:
        if key_x in dict_y:
            count = min(dict_x[key_x], dict_y[key_x])
            answer += key_x * count
    
    answer = ''.join(sorted(answer, reverse=True))
    
    if answer is '':
        answer = "-1"
    elif answer[0] == "0":
        answer = "0"

    return answer