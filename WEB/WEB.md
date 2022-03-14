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
</br?
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
  - Web app
  - Servlet Context (웹 어플리케이션)
    -  
  - Servlet directory
    -  
