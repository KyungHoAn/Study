ALTER SESSION SET NLS_LANGUAGE=American;

ALTER TABLE EMP DROP CONSTRAINT FK_DEPTNO;

ALTER TABLE EMP DROP CONSTRAINT PK_EMP;

ALTER TABLE DEPT DROP CONSTRAINT PK_DEPT;

DROP INDEX PK_DEPT;

DROP INDEX PK_EMP;

DROP TABLE SALGRADE;

DROP TABLE DEPT;

DROP TABLE EMP;

DROP TABLE BONUS;

CREATE TABLE SALGRADE (
	GRADE NUMBER,
         LOSAL NUMBER,
         HISAL NUMBER
);

CREATE TABLE DEPT (
	DEPTNO NUMBER(2),
        DNAME VARCHAR2(14),
        LOC VARCHAR2(13)
);

CREATE TABLE EMP (
	EMPNO NUMBER(4) NOT NULL,
        ENAME VARCHAR2(10),
        JOB VARCHAR2(9),
        MGR NUMBER(4),
        HIREDATE DATE,
        SAL NUMBER(7, 2),
        COMM NUMBER(7, 2),
        DEPTNO NUMBER(2)
);

CREATE TABLE BONUS (
	ENAME VARCHAR2(10),
         JOB   VARCHAR2(9),
         SAL   NUMBER,
         COMM  NUMBER
);

CREATE INDEX PK_DEPT ON DEPT (DEPTNO ASC);

CREATE INDEX PK_EMP ON EMP (EMPNO ASC);

ALTER TABLE EMP ADD CONSTRAINT PK_EMP PRIMARY KEY (EMPNO);

ALTER TABLE DEPT ADD CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO);

ALTER TABLE EMP ADD CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO)
	REFERENCES DEPT (DEPTNO)
	ON DELETE CASCADE;



-- 데이터 추가
INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');




INSERT INTO EMP VALUES
        (7369, 'SMITH',  'CLERK',     7902,
        TO_DATE('17-DEC-1980', 'DD-MON-YYYY'),  800, NULL, 20);
INSERT INTO EMP VALUES
        (7499, 'ALLEN',  'SALESMAN',  7698,
        TO_DATE('20-FEB-1981', 'DD-MON-YYYY'), 1600,  300, 30);
INSERT INTO EMP VALUES
        (7521, 'WARD',   'SALESMAN',  7698,
        TO_DATE('22-FEB-1981', 'DD-MON-YYYY'), 1250,  500, 30);
INSERT INTO EMP VALUES
        (7566, 'JONES',  'MANAGER',   7839,
        TO_DATE('2-APR-1981', 'DD-MON-YYYY'),  2975, NULL, 20);
INSERT INTO EMP VALUES
        (7654, 'MARTIN', 'SALESMAN',  7698,
        TO_DATE('28-SEP-1981', 'DD-MON-YYYY'), 1250, 1400, 30);
INSERT INTO EMP VALUES
        (7698, 'BLAKE',  'MANAGER',   7839,
        TO_DATE('1-MAY-1981', 'DD-MON-YYYY'),  2850, NULL, 30);
INSERT INTO EMP VALUES
        (7782, 'CLARK',  'MANAGER',   7839,
        TO_DATE('9-JUN-1981', 'DD-MON-YYYY'),  2450, NULL, 10);
INSERT INTO EMP VALUES
        (7788, 'SCOTT',  'ANALYST',   7566,
        TO_DATE('09-DEC-1982', 'DD-MON-YYYY'), 3000, NULL, 20);
INSERT INTO EMP VALUES
        (7839, 'KING',   'PRESIDENT', NULL,
        TO_DATE('17-NOV-1981', 'DD-MON-YYYY'), 5000, NULL, 10);
INSERT INTO EMP VALUES
        (7844, 'TURNER', 'SALESMAN',  7698,
        TO_DATE('8-SEP-1981', 'DD-MON-YYYY'),  1500,    0, 30);
INSERT INTO EMP VALUES
        (7876, 'ADAMS',  'CLERK',     7788,
        TO_DATE('12-JAN-1983', 'DD-MON-YYYY'), 1100, NULL, 20);
INSERT INTO EMP VALUES
        (7900, 'JAMES',  'CLERK',     7698,
        TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),   950, NULL, 30);
INSERT INTO EMP VALUES
        (7902, 'FORD',   'ANALYST',   7566,
        TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),  3000, NULL, 20);
INSERT INTO EMP VALUES
        (7934, 'MILLER', 'CLERK',     7782,
        TO_DATE('23-JAN-1982', 'DD-MON-YYYY'), 1300, NULL, 10);

INSERT INTO SALGRADE VALUES (1,  700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

COMMIT;

SELECT
EMPNO 사번, ENAME 이름, MGR 관리자 사번
FROM EMP
ORDER BY EMPNO;

/*내가 만든거 실패  밑에 강사님 코드 이해*/
SELECT
EMPNO 사번, ENAME 이름, MGR 관리자 사번, ENAME 관리자이름
FROM EMP
WHERE 관리자이름.(EMPNO=MGR)
ORDER BY EMPNO;

//==>EMP TABLE 이용: 사번, 이름, 관리자사번 ,관리자이름 조회

SELECT
E1.EMPNO 사번, E1.ENAME 이름, E2.EMPNO 관리자사번, E2.ENAME 관리자이름
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+)
ORDER BY E1.EMPNO;

//=>사장이 없음
//==>사장찾기 +를 잘 사용하기


*문제

1.이순신과 같은 부서 근무
직원
사번, 이름 =>1EA QUERY (X) => 2EA QUERY
SELECT
S.DEPT_NAME 부서, C.NAME 이름
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID = S.ID AND DEPT_ID = (SELECT
DEPT_ID
FROM C_EMP
WHERE NAME IN '이순신');

SELECT
DEPT_ID, NAME
FROM C_EMP
WHERE NAME IN '이순신';


SELECT
C_EMP.ID, C_EMP.NAME
FROM C_EMP, S_DEPT
WHERE C_EMP.NAME IN '이순신';


SELECT
ID, NAME
FROM C_EMP
WHERE DEPT_ID


SELECT
C.NAME 이름, S.DEPT_NAME 부서
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID=S.ID AND DEPT_ID =(SELECT
DEPT_ID
FROM C_EMP
WHERE NAME ='이순신');

///////////////////////////////////////////////////////////////////
SELECT
C.NAME 이름, S.DEPT_NAME 부서
FROM  C_EMP C, S_DEPT S
WHERE  C.DEPT_ID = S.ID AND DEPT_ID =(SELECT
DEPT_ID
FROM C_EMP
WHERE NAME ='이순신');

SELECT
NAME, DEPT_ID
FROM C_EMP
WHERE NAME ='이순신';
///////////////////////////////////////////////////////////////////

SELECT
S.DEPT_NAME 부서명, C.NAME 이름
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID = S.ID AND C.DEPT_ID IN (SELECT
DEPT_ID 번호
FROM C_EMP C
WHERE C.NAME ='이순신');



SELECT
DEPT_ID 번호
FROM C_EMP C
WHERE C.NAME ='이순신';
///////////////////////////////////////////////////////////////////

2022-03-07
//==>이순신과 같은 부서에 근무하는 직원의 사번, 이름, 급여 조회
///////////////////////////////////////////////////////////////////
SELECT
ID 사번, NAME 이름
FROM C_EMP
WHERE DEPT_ID = (
SELECT
DEPT_ID
FROM C_EMP
WHERE NAME ='이순신');
///////////////////////////////////////////////////////////////////
SELECT
C.ID 사번, C.NAME 이름, C.SALARY 급여
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID = S.ID AND DEPT_ID IN (SELECT
DEPT_ID
FROM C_EMP
WHERE NAME='이순신');

SELECT
DEPT_ID
FROM C_EMP
WHERE NAME='이순신';
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////

//==> 전체평균금여보다 낮은 급여를 받는 직원의 사번,이름,급여 조회
SELECT
ID 사번,  NAME 이름, SALARY 급여 
FROM C_EMP
WHERE
///////////////////////////////////////////////////////////////////
SELECT
C.ID 사번,  C.NAME 이름, C.SALARY 급여
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID = S.ID AND SALARY >(SELECT
AVG(SALARY)
FROM C_EMP);

SELECT
AVG(SALARY)
FROM C_EMP


//================================
//==> sINGLE rOW sUBQUERY : MAIN QUEREY로 하나 전달
//--> MULTI ROW SUBQUERY : MAIN QUERY 로 여러개 전달

//=>총무부,영업부 직원이름, 부서아이디(==>SUBQUERY사용해서....)
//==> ERROR ??
SELECT
NAME 이름 , DEPT_ID 부서아이디
FROM C_EMP
WHERE DEPT_ID=(SELECT
ID
FROM S_DEPT
WHERE DEPT_NAME IN('총무부','영업부'));	//--> 값을 둘 이상 못합

SELECT
NAME 이름 , DEPT_ID 부서아이디
FROM C_EMP
WHERE DEPT_ID IN (SELECT
ID
FROM S_DEPT
WHERE DEPT_NAME IN('총무부','영업부'));


//==>MULTI COLUMN SUBQUERY:???

//->각부서에서 최소월급을 받는 직원 이름, 월급, 부서번호 조회
SELECT
C.NAME 이름, C.SALARY 월급, C.DEPT_ID 부서번호
FROM C_EMP C, S_DEPT S
WHERE C.DEPT_ID = S.ID AND C.SALARY =(SELECT
MIN(SALARY)
FROM C_EMP);

//==> 결과???:부서에서 최소값은 1개
//==> 확인 SELECT MIN(SALARY),DEPT_ID FROM C_EMP GROUP BY DEPT_ID;

//==> 부서번호, 최소값을 같이 비교
SELECT
NAME, SALARY, DEPT_ID
FROM C_EMP
WHERE(SALARY, DEPT_ID) IN (SELECT
MIN(SALARY), DEPT_ID
FROM C_EMP
GROUP BY DEPT_ID);

//==> INLINE VIEW (가상의 TABLE)을 이용한 조회
SELECT
C.NAME, C.SALARY, C.DEPT_ID
FROM C_EMP C, (SELECT
DEPT_ID, MIN(SALARY) MIN
FROM C_EMP
GROUP BY DEPT_ID) VT
WHERE C.DEPT_ID = VT.DEPT_ID
AND C.SALARY = VT.MIN;
