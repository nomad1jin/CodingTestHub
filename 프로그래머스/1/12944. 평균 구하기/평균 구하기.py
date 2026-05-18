def solution(arr):

    sum = 0
    for num in arr:
        sum += num
    avg = sum / len(arr)
    return avg