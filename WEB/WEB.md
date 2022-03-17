# WEB

* 용어정리
  - WWW(World Wide Web)
  - IIS(Internet Information Server)
  - 서드 파트 라이브러리: 제 3자 라이브러리, 편하고 효율적인 개발을 위해, 플러그인이나 라이브러리 또는 프레임워크등을 사용하게 되는데 제 3자로써 중간다리 역할을 하는 것을 서트파티라고 한다.
  - HTML(Hypertext Markup Language, 하이퍼텍스트 마크업 언어)
  - URL : Uniform Resource Locator
  - URI : uniform Resource Identifier
  - WAS : Web Application Server
  - HTML : Hypertext Markup Language, 하이퍼텍스트 마크없 언어)는 프로그래밍 언어는 아니고 우리가 보는 웹페이지가 어떻게 구조화되어 있는지 브라우저로 하여금 알 수 있도록 하는 마크업 언어
  - IDE : Integerated Development Environment
  - Business logic 비즈니스 로직 : 유저의눈에 보이지는 않지만 유저가 바라는 결과물을 올바르게 도출할수 있게 짜여진 코드 로직 
    - 하나의프로젝트나 프로그램중 업무와 관련된 처리를 하는 일부분을 뜻하는데, 프로젝트를 하면서 데이터베이스에서 어떠한 자료를 가져와서 웹에서 출력을 할때 데이터베이스 연결, 통신, 자료가공, 페이지 구성등 여러가지 작업을 하지만 그 중에서 사용자가 원하는 자료의 가공 부분을 의미 ex) 자료를 저장할 때 부가세가 포함되지 않고 자료가 저장이 되어있는데, 최종적으로 사용자에게는 부가세가 포함된 자료를 디스플레이해야하는 업무를 처리해야 한다고 할 때 이를 처리하는 과정
  - VO (Value Object) : 도메인에서 한 개 또는 그 이상의 속성들을 묶어서 특정값을 나타내는 객체 / 자바는 값 타입을 포현하기 위해 불변 클래스를 만들어서 사용, 넣어진 데이터를 getter를 통해 사용
  - Dao (Data Access Object) : 데이터베이스의 Data에 접근하기 위한 객체
  - DBCP (Conenction Pool) : db와 연결하는 커넥션을 미리 생성해두고 풀에 저장해두었다 필요할 때 꺼내사용하고, 사용후에는 다시 풀에 반환하는 기법
  - jar (Java Archive): .jar확장자 파일에는 Class와 같은 java리소스와 속성 파일, 라이브러리 및 액세서리 파일이 포함되어 있다. 쉽게 java어플리케이션이 동작할 수 있도록 자바 프로젝트를 압출한 파일
  - war (Web Application Archive) : .war 확장자 파일은 servlet/jsp컨테이너에 배치 할 수 있는 웹 어플리케이션 압축 파일 포맷 / 웹 관련 자원만 포함하고 있으며 이를 사용하면 웹 어플리케이션을 쉽게 배포하고 테스트할 수 있다.
  - EAR (Enterprisc Archive) : EAR파일은 Java EE(Enterprise Edition)쓰이는 파일 형식으로 한 개 이상의 모듈을 단일 아카이브로 패키징하여 어플리케이션 서버에 동시에 일관적으로 올리기 위하여 사용되는 포맷

</br>
## web C(포함관계) c/s

* Client ->(Request)(질문) Server 
  * Brower를 가지고 있다.
  1. Client는 Browser로 http Protocol Request하는 Client용 APP이다.
  2. (Server)에서 내려온 html을 파싱해서 디스플레이 
* Server ->(Response)(답변) Client
  * W/S를 가지고 있다. Web Serber : 웹 브라우저 클라이언트로부터 HTTP요청을 받아 정적인 컨텐츠(.HTML .JPEG .CSS등)를 제공하는 컴퓨터 프로그램
  1. W/S : html을 가지고 있다가 req하면 내려보내준다.

w/s 설치
1. Apache.org
2. HTTP server(접속) (a.com / IP / a@a.com) 127.0.0.1
3. C 밑에 Apache Home 설정

## Java Web 개발환경 구축
![image](https://github.com/akh981216/Study/blob/master/WEB/WEB_img/java_web%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%20%EA%B5%AC%EC%B6%95.png)
* spev을 알고 있으면 어떤 진영에서도 다 사용할 수 있다. (다형성)
* Servlet Container : 서블릿들의 생성, 실행, 파괴를 담당한다. / 서블릿들을 위한 상자
  * 서버에 만들어진 서블릿이 스스로 작동하는 것이 아닌 서블릿을 관리해주는 것이 필요한다. 이 역할이 서블릿 컨테이너이다. 

## WAS : Web Application Server
  * WAS 사용 이유 : Apache Web Server -> html 연습
  1. oracle 홈페이지(sql) url은 8080으로 설정, Tomcat 설치시 8080으로 되어 있어 충돌 발생
  2. (충돌 해결) sql port번호를 5000으로 변경
  3. tomcat3 설치 시 JRE경로 묻는 이유 : Java를 실행시키려면 Jre가 필요 but. Tomcat은 Jre가 자체적으로 없기 때문에 Jre를 물고 들어간다. 높은 버전은 jre를 포함하기 때문에 무겁다.
</br>
  4. tomcat -> java_home 위치 확인 후 start up 하면 한글 깨짐 현상 발생 확인. shutdown
  5. conf -> logging -> propertics -> UTF-8 <-> EUK-KR

</br>
* web.xml : servlet을 직접적으로사용
  * http: // IP : port / ooooo / 
* web.xml의 역할
  - web.cml에서 서블릿의 이름과 클래스, 그리고 URL 매핑을 설정, 이 정보를 서블릿 컨테이너가 사용


## servlet은 반드시 browser에서 실행 (client)가 실행

# 표준화된 폴더구조
  * 서블릿은 서버가 요청을 받고 자동으로 실행하는 웹 애플리케이션 파일
  * Servlet은 자바 웹 어플리케이션의 구성 요소 중 JAVA언어를 사용하여 동적인 처리를 하는 역할 담당
  - Web app
  - Servlet Context (웹 어플리케이션)
    -  서블릿 컨테이너와 통신하기 위해서 사용되는 메소드를 지원하는 인터페이스
  - Servlet directory
  * Servlet 동작 방식
    - 서블릿 컨테이너 등록 => 서블릿 컨테이너에 의해 init()생성 , service()호출, destory() 소멸로 이루어진다.
    - init()은 동작시 1번만 수행이 되며 이후로는 service()가 계속적으로 호출이 된다.
   
# Data 전송 방식
  * Browser에서 Server로 Data 전송시의 Get 방식 / Post 방식
    - Get 방식 : URL에 N=V가 붙어서 전송되는 방식
      - 서버에서 가져올때 사용 => ex)게시판 글 내용 조회
    - Post 방식 : Body에 N=V가 붙어서 전송되는 방식
      - 서버상의 data값을 바꿀때 사용 => ex) 글 나용 수정

* java SE => local 개념이 들어간 것
* java EE => Server 개념이 들어간 것
* HTTP : Header 와 Body로 req
* Web의 default req방식은 Get 방식(손으로 적어 나타나게 할 수 있는 것)

* init() / destory()는 HttpServlet 상위에 있는 GenericService의 메서드로 있어 service()만 사용 가능하다.
* HelloServletService의 OutputStream ~ 는 PrintWriter에 캡슐화 되어있어 PrintWrtier로만 사용 가능하다.

# URL / URI
* URL/URI 전송방식은 잘 사용을 하지 않고 Relative URI방식을 많이 사용한다. Relative URI 전송 방식 중요**
  - /~ 의 /는 port에서 시작
  - URL : port에 종속적
  - URI : Context root에 종속적
    - Content directory의 경로, 해당 경로에 메타 정보와 웹 정보를 관리하는 것
   ![image](https://github.com/KyungHoAn/Study/blob/master/WEB/WEB_img/Get%26Post.png)
* war 압축 방법
   - cmd-> edu 이동 -> jar 검색 -> jar -> cuf edu01.war . -> edu01.war확인 후 tomcat on -> ㄷ여01qhrtk -> 아파치 webapps에 저장
   - JavaEE 개발환경 구축 
     - static web Project : html 개발
     - Dynamic Web Probject : servlet 개발
# 아파치 / 톰캣 Apache Tomcat
 * 아파치 톰캣은 아파치 소프트웨어 재단에서 개발한 서블릿 컨테이너(웹 컨테이너)만 있는 웹 애플리케이션 서버
 * 톰캣은 웹 서버와 연동하여 실행할 수 있는 자바 환경을 제공하여 자바서버 페이지(JSP)와 자바 서블릿이 실행할 수 있는 환경을 제공하고 있다.
 * 톰캣은 관리툴을 통해 설정 변경 가능 AND XML 파일 편집하여 설정 가능 AND HTTP 서버 자체 내장
 * 아파치 톰캣은 오픈소스 소프트웨어로서, 자바서버 페이지나 자바 서블릿을 실행하기 위한 서블릿
 <img width="500" src ="http://melonicedlatte.com/assets/images/201906/79986821-0AE3-4389-83E8-4AFC4FD2EABF.jpeg">
 -이미지주소: melonicedlatte의 Easy is Perfect (Apache Tomact란? 개념 정리 및 설치 방법)
  </br>
  </br>
  Jar : JavaBean <=> DB
  War : Servlet <=> JavaBean <=> JSP
  
# Code
(짐 /귤,빵,사과)
Enumeration<String> en = req.getParameterName(0;
    while(en.hasMoreElements()){
      String name = en.nextElement();
      String value = req.getParameter(name);
  
  
# HttpServlet - (doGet / doPost)
    - Server
   <img width="500" src ="https://media.vlpt.us/images/carrykim/post/32e2135e-3da0-4622-843e-31859f4c4f8f/image.png">
 -이미지 주소: carrykim.log 의 시스템 흐름

# 자료 저장 구도
  * edu/src/main/java -> .java파일
  * src/main/webapp -> .html파일
  * src/main/webapp/WEB_INF -> .xml파일
  * src/main/webapp/lib -> .jar파일 
  
# Code
  - P: presentation / B: Business
  1. Login -> P+B = 효율이 낮다. 유지보수 힘듬
  2. LoginBean -> P/B = P와 B의 영역을 나누어 유지보수 효율성 높임
  3. LoginVODao-> view / model (VO:value object /Data access object)
  4. LoginBeaninitParam -> V/M + Web.xml(Meta-Data : 데이터에 대한 데이터)
  5. LoginBeanPool -> V/M -> VO/DAO(ConnectionPool)
  
# CRUD
  *create(레코드) / Read(select) / U(update, select도 해야함) / D (delete, select도 해야함)
</br>

# Cookie/session
- 서블릿 : 서버에서 도는 app
- 다이나믹 - Cervlet Container
- 상태유지 (상태정보 유지기술) 
  - Client(클라이언트)
    - Cookie : 웹 브라우저에 저장되는 것
  - Server(서버)
    - 서버에 저장되는 것
    - ServletContext
    - httpSession
    - HttpServeltRequest
  - Cookie => javax.servlet.http / 생성자 1개(Cookie)
    - Cookie c = new Cookie(N,V) **Cookie는 Clinet에 저장 
* tomcat_home에 있는 xml은 모든 xml에 적용 -> session 확인 (시간설정)
  * session 만드는 방법 = getSession(true)
  *  

# Code
* import javax.servlet.http.Cookie
  * setMaxAge(60*60) //cookie 유효기간(초) setMaxAge(-1) / setMaxAge(0)
    - 양의 값은 cookie가 몇 초 후에 만료임을 나타낸다. 이 값은 쿠키의 현재 사용 기간이 아니라 쿠기가 만료되는 최대 사용기간
    - 음수값은 쿠키가 영구적으로 저장되지 않고 웹 브라우저가 종료될때 삭제된다.
    - 값이 0이면 쿠키 삭제
* HttpSession session = req.getSession(true)
  - 깨끗한 상태에서 들어가면 Session을 만들어줌 true 
* setAttribute / getAttribute
  * setAttribute(key,value)를 통해 html태그에 해당key로 세팅해서 value값을 넣어준다
  * getAttribute(key) key에 해당하는 값을 가져온다
  *  
  
