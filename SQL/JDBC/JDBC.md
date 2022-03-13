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
  * 자바에서 제공하는 데이터베이스와 연결하여 데이터를 주고 받음 
  * executeUpdate는 DDL전송시 (INSERT, UPDATE, OR DELETE)문을 실행하거나 Nothing을 반환한다.
  ###insert,update, delete는 INT를 반환한다. Insert, update, delete 를 SQL실행시 return으로 ~개가 ~되었습니다.라는 값이 출력되는 것을 확인할 수 있다. 

* JDBC CODE
  * JDBC Programming 절차 이해
    - DB 접근(login 과정) : Connection 객체로 Object modeling
    - SQL prompt & SQL 전송 : Statement 객체로 Object modeling
    - SQL 결과 : ResultSet 객체로Object Modeling 
  * DB에 로그인 접속정보
    - String url = "jdbc:oracle:thin:@(ip):xe";
    - String user="id"
    - String pwd ="pwd"
</br>
  1. 1단계 :login 과정/ OracleDriver instance생성</br>
    - oracleDriver od = new OracleDriver();</br>
    - Class.forName()을 이용하여 드라이버 로드 Class.forName("oracle.jdbc.driver.OracleDriver");
</br>
  2. 2단계 :oracle에 접속 정보를 갖는 properties instance생성</br>
    - Properties info = new Properties();</br>
    - info.put("user",user);</br>
    - info.put("password",pwd);</br>
</br>
  3. 3단계 :OracleDriver intance를 사용 Connection instance생성</br>
    - Connection con = od.connect(url,info);</br>
</br>

* 과정
  - Class.forName()을 이용하여 드라이버 로드 Class.forName("oracle.jdbc.driver.OracleDriver");
    - Class.forName는 Class의 Object를 return한다. 
  - DriverManager.getConnection() 으로 연결 얻기
  - Connection 인스턴스를 이용하여 Statement 객체 생성
  - Statement 객체의 결과를 ResultSet

* JDBC try-catch문
  -try{
  -  if(stmt!=null) stmt.close();
  -  if(con!=null) con.close();
  -  }catch(SQLExcetpion e){
  -  ~~
  -  e.printStackTrace();
  -  }
   * => Exception을 발생시기지 않기 위해서 try문 생성
