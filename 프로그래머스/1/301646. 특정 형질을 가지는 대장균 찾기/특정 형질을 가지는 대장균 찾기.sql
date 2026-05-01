-- 제노타입을 이진수로 나타내야함
-- 해당되는 이진수가 보유한 형질이 됨 
-- 2번 형질을 보유하지 않으면서 1번 or 3번을 보유한 대장균 개체의 수를 카운트
-- SQL은 비교연산자가 =

Select count(*) as count
from ecoli_data
where GENOTYPE & 2 = 0
and ((GENOTYPE & 4) != 0 or (GENOTYPE & 1) != 0);