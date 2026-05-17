def solution(today, terms, privacies):
    answer = []
    dict = {}
    
    for term in terms:
        type, month = term.split(" ")
        dict[type] = int(month)
    
    y, m, d = map(int, today.split("."))
    # 28일 기준 일 수 계산
    today = y * 12 * 28 + m * 28 + d
    
    for idx, privacy in enumerate(privacies):
        date, type = privacy.split(" ")
        y, m, d = map(int, date.split("."))
        privacy_date = y * 12 * 28 + m * 28 + d      # 파기할 날짜
        
        # 오늘이 파기할 날짜보다 지났다면
        if today >= (privacy_date + dict[type] * 28):
            answer.append(idx + 1)
        
        
    return answer