package spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;
import spring.service.user.impl.UserDAO;

/*
 * fileName : user004 Controller.java
 * -Controller Coding Policy
 * :return type:mdoelAndView����
 * :Method parameter
 * -client dAta : @ModelAttrivbute / @ Requets Param ������ ���
 * - �ʿ�� Servlet API ���
 */
@Controller
public class User004Controller {

	//Field
	
	//Contructor
	public User004Controller() {
		System.out.println("==>User004 Controller default Constructor call......");
		// TODO Auto-generated constructor stub
	}
	
	/////////////////////////////////////////////////////////////////////
	//LogonCheckInterceptor ������� �α��� ���� Ȯ���ϴ� logon() ����
	//==> �ܼ� Navigation
	@RequestMapping("/logon.do")
	public ModelAndView logon() {
		
		System.out.println("[logon() start.....]");//=> ������
		
		//=-=> client�� ������ Message ����
		String message = "[logon()] ���̵� �н����� 3���̻� �Է��ϼ���";
		
		//=> model(data) / View(jsp) ������ ���� ModelAndView����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user002/logon.jsp");
		modelAndView.addObject("message",message);
		
		System.out.println("[logon() end....]\n");
		
		return modelAndView;
	}
////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
	//LogonCheckInterceptor ������� �α��� ���� Ȯ���ϴ� home() ����
	//==> �ܼ� Navigation
	@RequestMapping("/home.do")
	public ModelAndView home(HttpSession session) {
		System.out.println("[home() start....]"); //<==������
		String message ="[home()] WELCOME";
		
		//==> Model(data) / View(jsp) ������ ���� ModelAndView ����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user002/home.jsp");
		modelAndView.addObject("message",message);
		
		System.out.println("[home() end....]\n");
		
		return modelAndView;
	}
	
////////////////////////////////////////////////////////////////////////
	
	//�ܼ� Navigation
	@RequestMapping(value = "/logonAction.do", method=RequestMethod.GET)
	public ModelAndView logonAction() {
		
		System.out.println("[logonAction() method =RequestMethod.GET start....]");
		
		//==> Model(data) / View(jsp) ������ ����  ModelAndView ����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/logon.do");
		
		System.out.println("[logonAction() method =RequestMethod.GET end....]\n");
		
		return modelAndView;
	}
	
	//Business Logic ���� / Navigation
	@RequestMapping(value="/logonAction.do",method=RequestMethod.POST)
	public ModelAndView logonAction(@ModelAttribute("user") User user, HttpSession session) {
		System.out.println("[logonAction() method = RequestMehtod.POST start.....]");
		
		String viewName = "/user002/logon.jsp";
		
		//=>CONTROLLER: Business logicó��
		//==> Business Layer �� DAO���� �� Mehtodȣ��
		UserDAO userDAO = new UserDAO();
		userDAO.getUser(user);
		
		if(user.isActive()) {
			viewName = "/user002/home.jsp";
			session.setAttribute("sessionUser", user);
		}
		
		System.out.println("[action: "+viewName+"]"); //<==������
		
		//==> Client�� ������ Message ����
		String message = null;
		if(viewName.equals("/user002/home.jsp")) {
			message = "[LogonAction()] WELCOME";
		}else {
			message ="[LogonAction()] ���̵� �н����� 3���̻� �Է��ϼ���";
		}
		
		//==> Model(data) /View(jsp)���θ� ���� ModelAndView����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName(viewName);
		modelAndView.addObject("message",message);
		
		System.out.println("[logonAction() method =RequestMethod.POST end...]\n");
		
		return modelAndView;
	}
////////////////////////////////////////////////////////////////////////
	
	//����(logon��������) Ȯ�� /navigation
	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		System.out.println("[Logout() start...]"); //<==������
		
		//==> logon ��������
		session.removeAttribute("sessionUser");
		
		//==> client�� ������ Message����
		String message = "[Logout()] ���̵� , �н����� 3���̻� �Է��ϼ���";
		
		//==> Model(data) / view(jsp) ������ ���� ModelAndView ����
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user002/logon.jsp");
		modelAndView.addObject("message",message);
		
		System.out.println("[Logout() end....]\n");
		
		return modelAndView;
	}
}
