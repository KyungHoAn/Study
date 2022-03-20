# JSP 정리
<br/><br/>
* 용어정리
  - metadata : 저장된 데이터 그 자체는 아니지만, 해당 데이터에 대한 정보를 갖고 있는 데이터를 의미, 즉 DB내의 데이터에 대한 데이터의 소유, 데이터의 크기에 관련된 정보들
  - plugins : 웹 브라우저의 표준 기능을 확장해 주는 프로그램
 
* JSP : Java Server Pages

## JSP 페이지 만들기
* HTML로 만들고 확장자만을 jsp로 선언해도 가능
* .jsp는 반드시 소문자로 기록
* WAS나 서블릿컨테이너들은 대소문자를 구분 <br/>
<%@ page contentType = "text/html;charset=euc-kr"%> <br/>

  <% String strName = "홍길동";%> <br/>
    내이름은 <br/>
    <%=strName%> <br/>
      입니다. <br/>
* HTML 태그에는 <%가 존재안한다.
* .JSP를 실행하면 C:\workspaces\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\edu\org\apache\jsp 에 .java파일과.class파일 생성된다

* JSP 2.3 컨테이너 + Servlet 컨테이너 4.0 = Web 컨테이너
* web 컨테이너 +web 서버 = WAS

## 지시문(Directive tag)
* page
  - JSP 페이지의 출력 크기를 KB단위로 지정 default는 8KB
  - 서버에서 웹 브라우저에 데이터를 보낼 때 버퍼 크기만큼 모았다 한꺼번에 보냄
  - autoFlush :버퍼를 자동으로 비울 것인지를 지정 default : true , |||false로하면 오버플로우 문제 발생
  - isThreadSafe :하나의 JSP가 동시에 여러 브라우저의 요청을 처리할 수 있는지 여부를 결정 default true
  - errorPage : 해당 JSP페이지를 에러 처리 전용 페이지를 이용할 것인지를 설정
  - isErrorPage : 현재 페이지가 에러 처리 전용 페이지 인지를 설정
* include
  - 현재 JSP파일에 다른 JSP나 HTML포함
  - <%@ include file=""%>
  - ex) 회사 홈페이지
* taglib

- Language="java" : 디폴트 설정이므로 사용하지 않아도 됨
- extends : 서블릿의 부모 클래스를 정의
- ContentType ="text/html;charset=euc-kr" : 한국이라면 무조건 설정
- isErrorPage="true|false" : Page가 error page이면 true로 설정
- Info='text' : Page의 Servlet
- IsThreadSafe="true|false" : 다수의 클라이언트의 요구들을 한번에 처리할 때 기본이 true
- session="true|false" : 세션 데이터가 페이지에서 유효한가를 의미
- import ="패키지명.클래스" : 페이지에서 필요한 import구문을 적는다.
<br/>
## 주석
* HTML의 주석은 <\!---->
* 자바 주석은 //
* JSP 주석은 <%--ㅇㅇㅇ-->

