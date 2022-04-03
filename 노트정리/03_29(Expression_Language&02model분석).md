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

```

```
<br/>

__*getAttribute = scope 로 변환__
__*getSession = session으로 변환__ 
<br/>

### code
```
<%@ page isELIgnored="false" %>
```

- 위 값을 test해보면 isELIgnored값의 default값은 false
```
1. page ObjectScope값 접근
${pageScope.abc} = ${pagescope["abc"]}
```
- 위 두개의 접근방식은 동일하다.
```
Object Scope의 영역을 지정하지 않고 EL을 사용 abc접근시
${abc}
```
- Scope는 생략가능
- 가장 작은 scope를 찾아서 표현
  0. page
  1. request
  2. session
  3. application
- error / Null Exception에 관대하다

### EL의 특징
- Scriptlet Tag 이용 화면 구성
```
<%
  out.println("<h3> 1.Scriplet Tag이용 session 저장 Bean(Data)화면 구성</h3>");
  client client = (Client)session.getAttribute("client");
  
  out.println("이름:"+client.getName()+"<br/>");
  String[] info = client.getInfo();
  for(int i=0; i<info.length; i++){
    out.println("info배열의 index["+i+]: "+info[i]+"<br/>");
  }
%>
```
- EL이용 화면 구성
```
name: ${sessionScope.client.name}
addr: ${client.addr}
age: ${cient.age}

info 배열은 empty: $(empty client.info}<br/>

info배열의 index 0 value: ${sessionScope.client.info[0]}<br/>
info배열의 index 1 value: ${client.info[1]}<br/>
```
- EL특징 : OjbectScope, Bean, Collection 접근용이

```
num1+num2: ${num1+pageScope, num2}
```
- String + String : null Stirng은 0으로 ㅇㄴ식
### 화면 출력 방식
- ${}
- <%= %>
- <c:out~>

## 02model2MVCShop(Refactor & Page Navigation)
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/29/29-1.png" width="60%" height="60%">
