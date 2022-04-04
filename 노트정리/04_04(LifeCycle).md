# Spring LifeCycle

#### Bean LifeCycle :: Container가 Wiring 작업을 통하여 instance생성, 소명시까지의 주기
<hr/>

### implements BeanNameAware
- Bean 내부에서 자신이 지정된 id, name을 확인 하는 경우에 사용
- BeanNameAware구현하고, setName()메서드, Override하는 경우 bean의 id, name이 매개변수로 전달
```
public class LifeCycle01 implements BeanNameAware {

	public LifeCycle01() {
		System.out.println("\n::"+getClass().getName()+"디폴트 생성자...");
	}
	
	public void setBeanName(String name) {
		System.out.println("::"+getClass().getName()+":steBeanName() start");
		System.out.println("xml에 정의돈 beanName:"+name);
		System.out.println("::"+getClass().getName()+":setBeanName(0 end...");
	}
	
	public void init() {
		System.out.println("::"+getClass().getName()+"init()");
	}   
	
	public void distory() {
		System.out.println("::"+getClass().getName()+"destory()");
	}
}
```
<br/>
* getClass() 과 getName()
  - getClass- 현재 참조하고 있는 클래스를 확인
  - getName - 각 패키지명이 포함된 클래스명
<br/>

### Singleton pattern
- Singleton : 어떤 클래스가 __최초 한번만__ 메모리를 할당하고(Static) 그 메모리에 객체를 만들어 사용하는 디자인 패턴
- 즉, 생성자의 호출이 반복적으로 이루어져도 실제로 생성되는 객체는 최초 생성된 객체를 반환 해주는 것
- 최초에 할당된 하나의 메모리를 계속 사용하는 방식
```
public class ExampleClass {
    //Instance
    private static ExampleClass instance = new ExampleClass();

    //private construct
    private ExampleClass() {}

    public static ExampleClass getInstance() {
        return instance;
    }
}
```
- instance라는 전역 변수를 선언하고 static을 줌으로써 인스턴스화 하지 않고 사용할 수 있게 하였지만 접근 제어자가 private로 되어 있어 직접적인 접근 불가
- 생성자 또한 private로 되어 있어 new를 통한 객체 생성 불가
- getInstance 메서드를 통해서 해당 인스턴스 사용 가능<br/>
참고: <a href="https://elfinlas.github.io/2019/09/23/java-singleton/">MHLab Blog</a>
- Singleton 사용이유
  - 객체 생성으로 재사용이 가능하기 때문에 메모리 낭비 x
  - 싱글톤으로 생성된 객체는 무조건 한번 생성으로 전역성을 띄기 때문에 다른 객체와 공유가 용이

### UserFactoryBean
```
@Override
public boolean isSingleton(){
  System.out.println("::"+getClass().getName()+".isSingleton()");
  return true;
  //return false;
}
```
- return 값을 true로 할 시 하나씩 Singleton 형식으로 만든다. 
-  return flase로 선언시 prototype형식으로 getBean할때마다 만들어준다(그때그때마다 만들어준다)
-  전체를 주석처리하면 default값인 true 주어 error가 나지 않는다.
* singleTon으로 할 시
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/1.png" width="50%" height="50%">
* prototype으로 할 시
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/1.png" width="50%" height="50%"><br/>

## mybatis
- 객체 지향 언어인 자바의 관계형 데이터베이스 프로그래밍을 좀 더 쉽게 할 수 있게 도와 주는 개발 프레임 워크로서 JDBC를 통해 데이터베이스에 엑세스하는 작업을 캡슐화하고 일반 SQL 쿼리, 저장 프로 시저 및 고급 매핑을 지원하며 모든 JDBC 코드 및 매개 변수의 중복작업을 제거 합니다. Mybatis에서는 프로그램에 있는 SQL쿼리들을 한 구성파일에 구성하여 프로그램 코드와 SQL을 분리할 수 있는 장점
- 특징
  - 복잡한 쿼리나 다이나믹한 쿠리에 강함 
- MyBatis는 자주사용/공통된 DataType은 내장된 Alias를 정의
	- string: java.lang.String
	- byte : java.lang.Byte
	- Primitive dataType: byte형태
	- object : java.lang.Object
	- hashmap : java.util.HashMap
	- arraylist; java.util.ArrayList
### MyBatis Connection POOL
- 커넥션 풀이란 최초 사용자의 요청이 있을 떼 DB에 연결하여 명령을 실행, 명령이 종료되어도 연결을 종료하지 않고 pool에 저장하여 요청이 올때마다 pool에서 커넥션을 꺼내 재사용하는 것
- JDBC DB연결 순서 (Connection -> Perparement -> ResultSet) 이것을 myBatis에서 .xml에 기술
```
* connection pool진행 과정
.xml
<environments default="development">
	<environment id="development">
	<transactionManager type="JDBC"/>
	<dataSource type="POOLED">
		<property name="driver" value="${driver}"/>
		<property name="url" value="${url}"/>
		<property name="username" value="${username}"/>
		<property name="password" value="${password}"/>
	</dataSource>
</encironment>
```
- dataSource를 POOLED로 변경하고 설정 추가
