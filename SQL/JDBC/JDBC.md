# JDBC 정리
</br></br>
* 인터페이스 기반 프로그래밍
  - 직접 객체를 사용하는 방식이 아니라 인터페이스 기반 객체를 사용하는 방식으로 프로그래밍한다.

* JDBC Driver
  - 자바 프로그램과 DB를 연결을 담당하는 역할
  - 각 DB벤더들이 만들어져서 배포하는 것이 일반적이다.
 </br>
 </br>

![image](https://github.com/akh981216/Study/blob/master/SQL/JDBC/JDBC_img/java_web%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95.png)

* JDBC 절차&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SQL 절차
  1. Connection&nbsp;&nbsp;&nbsp;=&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. Login (id, pwd, ip)
  2. Statement&nbsp;&nbsp;&nbsp;= &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. SQL (DML, TCL)
  3. ResultSet&nbsp;&nbsp;&nbsp;= &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3. Viw


* JDBC
  * executeUpdate는 DDL전송시 (INSERT, UPDATE, OR DELETE)문을 실행하거나 Nothing을 반환한다.
  ###insert,update, delete는 INT를 반환한다. Insert, update, delete 를 SQL실행시 return으로 ~개가 ~되었습니다.라는 값이 출력되는 것을 확인할 수 있다. 
