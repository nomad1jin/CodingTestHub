from collections import deque

def solution(progresses, speeds):
    # 일째를 계산하는 것이 아니라 하나 배포할때 뒤에꺼 같이 배포 가능한지
    # 먼저 개발된 기능부터 배포
    date = deque()
    answer = []

    for i in range(len(progresses)):
        num = (100 - progresses[i]) / speeds[i]
        if num == int(num):
            date.append(int(num))
        else :
            date.append(int(num) + 1)
            
    while date:
        temp = date.popleft()
        count = 1   # 같이 배포하는 게 아닌 경우
        
        # 같이 배포하자~
        while date and temp >= date[0]:
            date.popleft()
            count += 1
        
        # 카운트 다 세고 추가
        answer.append(count)
            
    return answer