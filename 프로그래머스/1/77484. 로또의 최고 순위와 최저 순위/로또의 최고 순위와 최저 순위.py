def solution(lottos, win_nums):
    # 당첨번호가 0인 것을 아무 로또 번호로 바꾸면 최고 순위번호
    # 맞은 개수는 set로 공통 숫자의 수를 세고 빼버리기
    # 그럼 0 중복을 계산 못 함 -> 따로 카운트
    # 실제로 바꾼 수가 아니라 최대/최소만 카운트하는 문제

    rank = {6:1, 5:2, 4:3, 3:4, 2:5}  # correct수, 순위
    
    match = len(set(lottos) & set(win_nums))
    zero = lottos.count(0)

    max_rank = rank.get(match + zero, 6)
    min_rank = rank.get(match, 6)
        
    return [max_rank, min_rank]