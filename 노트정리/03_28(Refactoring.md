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
```

==============================================
[하나]
select
rownum 순번, id, salary
from emp_test
where salary between 1111 and 7777
and rownum<=3;

[둘]
select
rownum 순번, id, salary
from emp_test
where salary between 1111 and 7777
and rownum>=3;

[셋]
select
rownum 순번, id, salary
from emp_test
where salary between 1111 and 7777
and rownum=3;

[둘][셋]이 실해되지 않는 이유???
책 => rownum의 조건은 1을 포함하고 있다
===> 레코드를 검색할때(rownum을 찾을때) 계속해서 1이 부여(1이 있는 값을 찾기)되기 때문에 화면에는 선택된 레코드가 존재하지 않는다고 표시되게 된다.
====> rownum은 디스플레이 되는 순서되로 넘버링된다.


==>아래의 출력결과를 이해하고
select
id, name, salary
FROM emp_test
ORDER BY salary DESC NULLS LAST;

<예1>
select
ROWNUM, id, name, select
FROM emp_test
ORDER BY salary DESC NULLS LAST;
FROM emp_test
ORDER BY salary DESC NULLS LAST;

<예2>
SELECT
ROWNUM ,id, name, salary
FROM emp_test
WHERE ROWNUM<=7
ORDER BY salary DESC NULLS LAST;

=============해결=====================
select
ROWNUM, vt.rnum, vt.id, vt.name, vt.salary
FROM (select
ROWNUM RNUM,id, name, salary
FROM emp_test
ORDER BY salary DESC NULLS LAST) vt
WHERE ROWNUM <=7;


select
ROWNUM, vt.rnum, vt.id, vt.name, vt.salary
FROM (select
ROWNUM RNUM,id, name, salary
FROM emp_test
ORDER BY salary DESC NULLS LAST) vt
WHERE ROWNUM >=7;


SELECT
vt1.rrnum, vt1.rnum, vt1.id, vt1.name, vt1.salary
FROM (select
	ROWNUM rrnum, vt.rnum, vt.id, vt.name, vt.salary
	FROM (select
		ROWNUM rnum, id, name, salary
		FROM emp_test
		ORDER BY salary DESC NULLS LAST) vt) vt1
WHERE vt1.rrnum>7;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////  다시 ROWNUM 이용, 활용해 보면.. ////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
1> 월급을 많이 받는 직원 상위 3명 출력 ( id , name , salary ) 
select
ROWNUM, id, name, salary
FROM emp_test
ORDER BY salary DESC NULLS LAST;

SELECT
ROWNUM, vt.id, vt.name, vt.salary
FROM (select
ROWNUM, id, name, salary
FROM emp_test
ORDER BY salary DESC NULLS LAST) vt
WHERE ROWNUM<=3;


2> 월급을 많이 받는 직원 상위 4~6 명 출력 ( id , name , salary ) 
SELECT
vt1.rnum, vt1.id, vt1.name, vt1.salary
FROM (SELECT
	ROWNUM rnum, vt.id, vt.name, vt.salary
	FROM (select
		ROWNUM, id, name, salary
		FROM emp_test
		ORDER BY salary DESC NULLS LAST) vt) vt1
WHERE vt1.rnum>=4 AND vt1.rnum<=6;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


```
