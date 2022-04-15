package spring.model2.control;

import spring.model2.service.user.view.HomeController;
import spring.model2.service.user.view.LogonActionController;
import spring.model2.service.user.view.LogonController;

// FileName : ControllerMapping.java
// Cliend Request(�䱸����, command)�� ó��, Controller  ���� ����
// Command Factory Pattern

public class ControllerMapping {
	
	///Field
	private static ControllerMapping controllerMapping;
	
	///Constructor
	private ControllerMapping() {
		
	}
	
	/// Method
	// ������ �ڽ��� �ν��Ͻ��� return �ϴ� static Method
	public static ControllerMapping getInstance() {
		if(controllerMapping == null) {
			controllerMapping = new ControllerMapping();
		}
		return controllerMapping;
	}
	
	// Cliend Request Page(actionPage)�� �޾� Request ó�� Controller ���� return
	public Controller getController(String actionPage) {
		
		System.out.println("\n[ ControllerMapping.getController() start.........");
		
		Controller controller = null;
		
		if(actionPage.equals("logon")) {
			controller = new LogonController();
		}else if(actionPage.equals("logonAction"))	{
			controller = new LogonActionController();
		}else if(actionPage.equals("home")) {
			controller = new HomeController();
		}
		//==> �߰������� �߻��Ѵٸ� �Ʒ��� ���� �߰��ϸ� �ȴ�
		
		/*
		 }else if(actionPage.equals("member")){
		 	action = new MemberAction();
	 	}else if(actionPage.equals("logout")){
	 		action = new LogoutAction();
 		}
		 */
		
		System.out.println("[ ControllerMapping.getController() end.........");
		
		return controller;
	}
}//end of class
