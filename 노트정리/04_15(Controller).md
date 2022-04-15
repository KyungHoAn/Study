# Spring12 / Spring13
### Controller 단 뜯어 고치기
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/4_15/1.png" width="60%" height="60%">

## Spring 12
#### web.xml
```
<!-- URI: /app/* 형식이면 Servlet Mapping @RequestMapping을 다양하게 적용시켜 보면 -->
<Servlet-mapping>
  <servlet-name>action</servlet-name>
  <utl-pattern>/app/*</url-pattern>
</servlet-mapping>
```
- 단일인입점을 .do형식이 아닌 contextroot를 app으로 설정하여 Controller단에 Mapping되어 있는 root로 설정

#### UserController.java
-핸들러 매핑전략 : Controller 까지 Mapping을 하고, Method이름이 URI와 적용시키는 전략

```
@Controller
@RequestMapping("/user")
public class UserController{

  //Field
  @AutoWired
  @Qualifier("userService")
  pricate UserService userService;
  
  ~~~~~
  //==> 단순 Navigation
  @RequestMapping("/logon")
  public String logon(Model model){ }
}
```
- 지금까지 해왔던 방식은 Nacigation 할때만 RequestMapping 작업을 해주었지만 User / Product / Purchase controller를 각각 Mapping작업을 홰주어 경로지정 설정
- xml에 app/* 로 입력을 하였기 때문에 contextroot/app/~ 를 해주어 uri를 지정
- jsp 부분도 .do로 향하는 루트를 지우고 uri 설정

## Spring13
#### common-servlet.xml
```
   <!-- o 어노테이션 기반 :: Spring Framework 사용.
       o @Controller annotation 선언된 Bean 만 Wiring
       o @Service / @Repository annotation 선언된 Bean 은 Scan제외 -->
   <context:component-scan base-package="spring.web">
      <context:include-filter type="annotation" 
                        expression="org.springframework.stereotype.Controller"/>
      <context:exclude-filter type="annotation" 
                        expression="org.springframework.stereotype.Service"/>
      <context:exclude-filter type="annotation" 
                        expression="org.springframework.stereotype.Repository"/>
   </context:component-scan>   
```
```
   <!-- :: Annotation 지원 HandlerMapping 선언 -->
   <!--  <bean 
   class="org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping"/>-->
   <bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping"/>
```
- 4.x 버전과 5.x버전 차이가 있어 method를 추가하여 진행


### 로그인창에 info:: 가 찍히지 않는 이유
- Intercepter에서 가로채어 찍히지 않는다.

### String return 과 ModelAndView return 복습
- String return 은 매개변수로 Model model이 필요
- ModelAndView return 은 매개변수로 Model이 필요가 없음

JSOn / PJT 개인주제 발표
