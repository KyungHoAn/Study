# Expression Language
### 용어정리
- OGNL (Object Graph Navigation language)
  - <% %>안에 접근 문자영을 지정한다. 반면 EL은 ${}로 시작
  - 객체 접근을 정규 표현식을 이용한 문자열의 변경처럼 객체에 접근할 수 있는 간결한 방법을 제공
  - Action의 public List getListString() 호출하여 요소 출력
- 기존 JSP
  - 화면을 구성하기 위해 Object Scope을 가져온다
  - <% %> 에 선언하는 java code가 많다
  - JSP에 자바코드를 선언하는것이 싫다

### EL(Expression language)
- 특징
===========접근 용이============
  1. Object Scope
  2. Bean Field
  3. collection
========== 제공 ===============
  4. 자체 연산자
  5. 내장 객체

- Expression / Expression Language
```
<%= "홍"%>
$<"홍">
```
- 같은 값이 출력된다
```
datatype&     <= objectScope =>   내장객체
pageContext   <=   request   =>   pageScope
HttpServletR~ <=   request   =>   requestScope
HttpSession   <=   session   =>   sessionScope
Servletcontext <=  application  =>  applicationScope
```
- pageContext / page / pageScope
  - 자신의 page에서만 사용한다(자신(나만) 사용한다)

<br/>
```
* Controller
  session.setAttribute("a",new String("홍"));
* view
  <% String a = (string)session.getAttribute("a") %>
  <%=a%>
위에 코드를 EL로 변환
${sessionScope.a}
```
```
<%= pagecontext.getSession().getId()%>
${pageContext.session.id}
```

<br/>

__*getAttribute = scope 로 변환__
__*getSession = session으로 변환__ 

<br/>
### code
