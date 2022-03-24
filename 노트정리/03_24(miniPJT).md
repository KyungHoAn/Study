# 01.Model2MVCShop(stu)분석
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/24-1.png" width="80%" height="80%">

## MVC- Control단

#### 단일인입점 ActionServlet
```
@Override
public void init() throws ServletException {
  super.init();
  String resources=getServletConfig().getInitParameter("resources");
  mapper=RequestMapping.getInstance(resources);
}
```
- init() : 한번만 호출 / 서블릿 컨테이너가 서블릿 객체를 생성한 후 호출
- ex)인사부장은 한명만 있으면 된다.
```
String url = request.getRequestURI();
String contextPath = request.getContextPath();
```
- request.getContextPath() : 요청 context를 요청하는 URI부분을 반환, 즉 프로젝트 Path에 반환
  - ex)http://localhost:8080/project/list.jsp
  - [return] /project를 가져온다.
- requets.getRequestURI() : 프로젝트 + 파일경로
  - ex) http://localhost:8080/project/list.jsp
  - [return] /project/list.jsp
  - String url = request.getRequetsURI.split("/");
  - String name = url[url.length-1];  //list.jsp return

#### 중간관리자 RequestMapping
- meta-data : 저장된 data는 아니지만 해당 data에 대한 정보를 갖고 있는 데이터를 의미 / meta-data에 올리면 shut-down할 필요가 없다.
```
map = new HashMap<String, Action>();
InputStream in = null;
~~~
in = getClass().getClassLoader().getResourceAsStream(resources);
//in = new FileInputStream(resources); 이렇게 사용해도 가능함
  properties = new Properties();
  properties.load(in);
```
- java.util.Properties
  - properties.load(in); : Properties안에 있는 것들을 load(싣다)해서 passing 하여 가지고 있겠다.
- map 많이 사용 : key value로 String 관리한다.

```
Action action = map.get(path); 
if(action == null){
  String className = properties.getProperty(path);  //properties에 passing한것을 저장한다.
  System.out.println("prop : " + properties);
  System.out.println("path : " + path);	
  System.out.println("className : " + className);
  className = className.trim();
```
- trim() = 앞/뒤 공백을 자른다 (혹시모를 스페이스바를 누를때를 대비하여 사용)

#### HttpUtil(forward/redirect)
- HttpUtil.java를 이용하여 View로 Navigation 진행
```
RequestDispatcher dispatcher = request.getRequestDispatcher(path);
dispatcher.forward(request, response);
```
- URI를 받아와 view로 전송

## MVC - model단
* purchaseVO (구매VO)
* productVO (상품VO)
* UserVO (사용자VO)
* SearchVO (찾기VO)
* UserDao (DB접근)
  * insertUser
  * FindUser
  * GetUserList
  * UpdateaUser

## MVC - View부분
- .jsp
