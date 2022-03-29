# Refactoring
### *01 => 02 (Refactoring주제)
  1. 검색조건 유지 => like   c/p(?) / 이해(?)
  2. page나누기
  3. 효율적 Query => list => ROWNUM

### ROWNUM 역할(SQL)
- 특정 개수만큼 원하는 데이터를 추출할고 싶을 때 사용
```
select rownum
  , a.*
  FROM emp a
```
```
===> rownum: from / where 결과 순번부처 가상컬럼
select
rownum 순번, id, salary
from emp_test;

==> from / where 결과에 순번/ 아래의 결과로 확인
==> rownum할당 후 order by 적용
select
rownum 순번, id, salary
from emp_test
order by salary asc;

==> from/where 결과에 순번
==> 조건에 맞게 추출후 rownum 부여
select
rownum 순번, id, salary
from emp_test
where salary between 1111 and 7777
```

