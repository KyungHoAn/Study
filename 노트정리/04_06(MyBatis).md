# MyBatis

#### Mybatis 주요 컴포넌트
- SqlSession Factory Builder
- SqlSession Factory
- SqlSession
<img src="https://media.vlpt.us/images/changyeonyoo/post/677db703-72b7-40a8-9566-e27c9aa3e935/9919384D5C5D2CA30D.png" width="70%" height="70%">
출처:<a href="https://velog.io/@changyeonyoo/Mybatis%EB%9E%80-%EC%9E%A5%EC%A0%90-%ED%8A%B9%EC%A7%95-%EC%BB%B4%ED%8F%AC%EB%84%8C%ED%8A%B8">changyeonyoo.log</a>
- SqlSession Factory Builder가 Config File을 읽고 Factory 생성
- 개발자가 DB에 insert하거나 Read하는 메서드를 호출하면 SqlSession Factory가 SqlSession을 생성하고 Application 영역에 코드 반환

#### 역할
- SqlSessionFactoryBuilder : MyBatis설정 파일을 바탕으로 SqlSessionFactory 생성
- SqlSessionFactory : SqlSession 생성
- SqlSession : SQL실행

#### MyBatis *.xml 정리 (UserMapper09.xml)
* select 구문 (CRUD인 다른 구문도 동작하는 방식은 비슷하다.)
```
<select id="getUserList01" parameterType="mybatis.service.domain.Search" resultMap="userSelectMap">
  SELECT
  user_id, user_name
  FORM user
  <where>
    <if test="userId.size()!=0">
      user_id IN
      <foreach item="value" collection="userId" open="(" separator="," close=")">
      #{value}
      </foreach>     </if>   </where> </select>
```
- select구문은 myBatis에서 흔히 사용하는 element.
- 해당 구문의 이름은 getUserList01로 select문 내의 SQL문을 사용하고자 할때 id이름을 사용
- parameterType : 해당 속성에 지정한 객체의 프로퍼티값이 SQL문의 입력 파라미터에 지정 해당 코드는 Search 도메인으로 지정
- resultMap : select문 실행 결과를 담을 객체를 resultMap으로 지정 resultType과 resultMap중 하나를 택하여 설정
- foreach 문 내의 userId 는 Search에 ListArray[]로 datetype이 지정되어 있으며 Enhanced for문으로 userId의 값 하나씩 value값으로 저장되어 출력


#### resultMap & \<resultMap>엘리먼트
```
<resultMap id = "userSelectMap" type="user">
  <result property="userId" column="user_id" jdbcType="VARCHAR"/>
~~~~
```
* resultMap 속성과 <resultMap> 엘리먼트
  - resultType속성을 사용하면 setter과 매칭되지 않는 경우 각 컬럼마다 alias를 붙여야 한다. 하지만 <resultMap>에 컬럼과 매칭되는 setter메소드를 지정하면 alias를 붙히지 않아도 된다.
  - 위 코드에 기술된 property 와 column명처럼 기술하면 됨
* property = field name

### interface처리한 userDao
* 데이터베이스와 직접적인 통신을 담당하는 퍼시스턴스 계층을 담당할 인터페이스
```
  public interface userDao{
    public int addUser(user user) throws Exception;
  ~~~
  }
```
- userDao를 interface처리함으로써 myBatis에 기술된  SQL를 가져오겠다는 의지
  
### UserService
* 회원관리 서비스 비지니스 로직을 추상화한 interface
* Component : interface로 Encapsulation된 재사용가능한 lib
```
public interface UserService{
public int addUser(user user) throw Excpetion
~~~
}
```
### commonservice13.xml
- connection pool 기술
  * myBatis-spring 1.3.1 classpath
  + common dbcp 1.4 & common pool 1.6 classpath
  
### Annotation
- Spring xml 만을 독립적으로 사용할 경우 때때로 방대하고 복잡한 속성 파일들로 인해 시스템 개발 및 유지 보수의 지연 가능
- 이러한 문제점을 해결하기 위해 spring에서는 별도 XML정의 없이도 사용가능한 Annotation 지원에 주력
- 구성
  @Transactional, @Service, @Controller, @Repository, @inject등
- 일반적인 정의
  -@Component 
- 레이어별로 구분하여 상세 정의
  - @Service
    - Business Layer를 구성하는 서비스 클래스 대상
  - @Controller
    - Presentation Layer를 구성하는 Controller클래스 대상
  - @Repository
    - Data Access Layer를 구성하는 클래스 대상
  - @Inject
  - @Named
  
