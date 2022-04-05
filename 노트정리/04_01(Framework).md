# Framework

#### AS-IS / TO-BE
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/4_1/1.png" width="50%" height="50%">

- 현재의 문제를 확인하고 해결하기 위해 현재의 상황(AS-IS)를 인식하고 현재의 상황과 이상적인 지향점(TO-BE)를 인식하고 이를 일치시키기 위한 일련의 전략적 사고 방식 AS-IS / TO-BE 분석기법
- AS-IS : 지금 현재의 있는 그대로를 의미
- TO-BE : 미래의 새로운 것을 의미
- 즉, AS-IS는 현상태, TO-BE는 만들어야 할 상태를 의미

#### Polymorphism ==> interface기반 Programming
```
interface Dice{
  public int getValue();
  
  //==> 주사위를 던저 선택되는 숫자를 생상
  public void selectedNumber();
 }
```

- spring Container => (Bean, Ioc) contaniner
- DI => Dependency Injection = ssetter, constructor
- wiring

#### IOC :: Inversion of Control(제어 역행
1. Dependency Injection :: 사용 인스턴스 주입
  - 의존관계 주입, Loose Coupling :: 인스턴스간 의존관계를 낮춤
  - Constructor Injection :: 생성자를 통한 사용 객체 주입
  - setter Injection :: setter method 를 사용한 사용한 사용객체 주입
2. Dependency LoopUp :: 사용객체를 찾는것...


#### .xml Code
```
	<property name="dice">
		<ref bean="diceA"/>
	</property></bean>
```
- property = field name
- ref = refernece :참조값(setter)

```
		<constructor-arg>
			<ref bean ="diceC"/>
		</constructor-arg>
```
- constructor-arg : 첫번째 매개변수를 가져온다.
- property 보다 더 알아보기 좋다
- property 와 constructor-arg 를 사용하는 것은 개발자가 알아서 정하여 사용 둘다 아무거나 사용해도 상관없음


#### BeanFactory 와 ApplicationContext
```
BeanFactory factory =
	new XmlBeanFactory( new FileSystemResource("./src/main/resources/config/userservice01.xml") );
```
```
ApplicationContext factory = new ClassPathXmlApplicationContext("/config/userservice01.xml");
```
- BeanFactory 는 현업에서 잘사용 하지 않음
- ApplicationContext를 자주 
