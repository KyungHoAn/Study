package spring.service.lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class LifeCycle01 implements BeanNameAware {

	public LifeCycle01() {
		// TODO Auto-generated constructor stub
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
