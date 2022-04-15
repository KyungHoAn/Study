package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/*
 * FileName : TestAdvice.java :: �Ʒ��� 4EA Advice interface�� ����
 *  org.springframework.aop.MethodBeforeAdvice
 *  org.springframework.aop.AfterReturningAdvice
 *  org.springframework.aop.ThrowsAdvice
 *  org.aopalliance.intercept.MethodInterceptor
 * ======================================================================
 * AOP ������� :: TargetObject / Adivce / Join Point /Point Cut
 * ======================================================================
 */
public class TestAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor{
	//==> Target Object Method ȣ�� �� :: before() Method ����
	
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[before LOG]" + getClass()+".before() start......");
		System.out.println("[before LOG] tagetObjcet call Method : " + method );
		if(args.length != 0) {
			System.out.println("[before LOG] tagetOvject method ���� argument:"+args[0]);
		}
		System.out.println("[before LOG]" + getClass()+".before() end......");
			
	}
	
	//==> Target Object Method ȣ�� �� :: afterReturning() Method ����
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[after LOG]" + getClass()+".arterReturning() start......");
		System.out.println("[after LOG] tagetObect call Method : " + method);
		System.out.println("[after LOG] Ÿ�� ��ü�� ȣ���� return value : " + returnValue);
		System.out.println("[after LOG]" + getClass()+".arterReturning() end......");
	}
	
	//==> Target Object Method ȣ�� ��/�� :: invoke() Method ����
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[Around before]" + getClass()+".invoke() start......");
		System.out.println("[Around before] tagetObject call Method : " + invocation.getMethod());
		if(invocation.getArguments().length != 0) {
			System.out.println("[Around before] tagetOvject method ���� argument:" + invocation.getArguments()[0]);
		}
		//==>targetObject Method call
		Object obj = invocation.proceed();
		
		System.out.println("[Around after] Ÿ�� ��ü�� ȣ���� return value : "+obj);
		System.out.println("[Around after]" + getClass()+".invoke() end......");
		
		return obj;
	}
	
	//==> Target Object Method ȣ�� Exception �߻� : afterThrowing() method ����
	public void afterThrowing(Throwable throwable) {
		System.out.println("[exception]" + getClass()+".afterThrowing() start......");
		System.out.println("[exception] Exception �߻�.......");
		System.out.println("[exception] Exception Message : " + throwable.getMessage());
		System.out.println("[exception]" + getClass()+".afterThrowing() end......");
	}

}
