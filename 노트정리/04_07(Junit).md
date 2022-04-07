# Junit
- Junit이란 java의 단위 테스팅 도구, 하나의 jar파일로 되었어 Testing결과를 단순히 문서로 남기는 것이 아닌 Test Class를 그대로 남김으로써 개발자에게 테스트 방법 및 클래스의 History를 넘길 수 있다.
- 특징 : 단위 테스트 Framework중 하나
- 단정문으로 테스트 케이스의 수행 결과를 판별
- Annotation(@)으로 간결하게 사용 가능 

#### annotation
1. 초기화
```
@Before
public void set(){}
```
- @BeforeClass annotation을 사용하면 메소드들이 몇번 실행되건 테스트전 해당 클래스에서 한번만 실행하도록 할 수 있다.
2. 해제
```
@After
public void tearDown(){}
```
- @After annotation 메소드 위에 선언한다면 테스트 클래스 안의 메소드들이 테스트 후 실행할 코드를 정의할 수 있다.


3. 테스트 메소드 정하기<br/>
```
@Test
public void testAddUser() throws Exception{}
  ~~~testing
```
- @Tset annotation을 메소드 위에 선언 시, 밀리 초 단위로 메소드의 수행시간을 제한하여 테스트 가능<br/>
참조: <a href="https://galid1.tistory.com/476">진짜 개발자 Tstory</a>

#### UserServiceTest
```
@RunWith(SpringJUnit4ClassRunner.class)
```
* @SpringBootTest를 사용하면 application context를 전부 로딩해서 프로젝트가 무거워짐
* BUT. Junit4에서 지원하는 RunWith(SpringRunner.class)를 사용하면 @Autowired @MockBean에 해당되는 것들에만 application context를 로딩하게 되므로 필요한 조건에 맞춰 사용
* __SpringRunner에 대한 별칭으로 SpringJUnit4ClassRunner, JUnit테스트 라이브러리를 SpringTestContext Framework와 결함 결함한 것을 @RunWith(SpringRunner.class)라고 한다.__

```
@ContextConfiguration(location={"~.xml"})
```
* 자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일 위치 설정

```
@Autowired
```
* 스프링 DI에 사용되는 특별한 annotation
* Autowired가 붙은 인스턴스 변수가 있으면, 테스트 컨텍스트 프레임워크는 변수 타입과 일치하는 빈을 찾는다.

```
@Qualifier("~")
```
* Spring에서는 @Autowired를 사용하여 의존송을 주입한다.
* 동일한 타입을 가진 bean객체가 두개가 있다면 스프링이 어떤 빈을 주입해야 할 지 알 수 없어 스프링 컨테이너를 초기화하는 과정에서 Exception발생
* 이런 문제를 해결

#### junit-4.13.2 build path
1. Junit.org이동
2. download할 버전 찾고 download
3. .jar build path잡아줌

## 04.Model2MVCShope(Business Logic,MyBatis Spring) 분석
* userServiceTest
```
Assert.assertEquals("~",~);

Assert.assertFalse(x)
Assert.assertTrue(x)
```
- assertEquals(x,y) : 객체 x와 y의 일치함을 확인, x와 y가 같으면 테스트 통과
- Assert.assertFalse : x가 false인지 확인
- Assert.assertTrue : x가 true인지 확인

* @Repository는 DB에 접근하는 코드를 모아둠
* Service는 DB에 직접적으로 접근하는것을 Repository에 맡겨 비즈니스 로직에 집중
* 비즈니스 로직은 데이터베이스와 유제 인터페이스간의 정보 교환을 다루는 알고리즘

