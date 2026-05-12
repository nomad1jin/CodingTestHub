def solution(s):
    # 어떻게 split할 것이냐
    # 숫자면 숫자 그대로 어떻게?
    dict = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}
    for key, value in dict.items():
        # 키를 값으로 바꾸기, 문자열만 가능
        s = s.replace(key, value)
    return int(s)