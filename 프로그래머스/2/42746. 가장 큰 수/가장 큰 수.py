def solution(numbers):

    number = list(map(str, numbers))
    answer = ''
    
    # 문자열은 곱하면 3 -> 333 된다
    number.sort(key = lambda x:x*4, reverse=True)
    
    if number[0] == '0':
        answer = '0'
    else :
        answer = ''.join(number)
        
    return answer