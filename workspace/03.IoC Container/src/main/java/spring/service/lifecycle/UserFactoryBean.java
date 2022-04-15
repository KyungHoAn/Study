package spring.service.lifecycle;

import org.springframework.beans.factory.FactoryBean;

import spring.service.domain.User;

public class UserFactoryBean implements FactoryBean{
	//field
	//constructor
	public UserFactoryBean() {
		System.out.println("::"+getClass().getName()+"����Ʈ ������");
	}
	
	@Override
	public User getObject() {
		System.out.println("::"+getClass().getName()+".getObject");
		return new User();
	}
	
	@Override
	public Class getObjectType() {
		System.out.println("::"+getClass().getName()+".getObjecttype()");
		return User.class;
		
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("::"+getClass().getName()+".isSin");
		return true;
//		return false;
	}
	
}
