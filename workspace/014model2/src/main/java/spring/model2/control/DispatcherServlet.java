package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.view.ViewResolverComposite;

/*
 * FileName: DispatcherServlet.java
 * o ����������(Single Point of Entry)
 * o Client �䱸���� �Ǵ�
 * o ��ó��/ ����ó��
 * -work flow Control ::���� ������
 * -client form Data �ѱ� ó��
 * o Business logic ����(Bean Method Call)
 * o Model�� View����
 * -Business logic ����(Bean Method call)
 * o ó���� ����� ���� JSP�� forward/wendRedirect :Navigation
 */
public class DispatcherServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("\n[DispatcherServlet.service() start....]");
		
		//=>CONTROLLER::client�䱸���� �Ǵ�:URL/URI
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("::URI==>"+req.getRequestURI());
		System.out.println("::client�� �䱸������?=>"+actionPage);
		
		//=>CONTROLLER:��ó��/����ó�� ������ �ִٸ�
		//=>�� ������ : �ѱ�ó��
		req.setCharacterEncoding("euc_kr");
		
		//==>CONTROLLER: CLIENT�䱸���� ó�� �� Business logicó��
		//==>Business Logic �� ó���ϴ� Controller ����
		Controller controller =null;
		
		//==>client�� request�� �����ϴ� Controller instance����
		//==>controllerMapping �� ���� client Request�� ó���� Conrtroller instance����
		ControllerMapping cf = ControllerMapping.getInstance();
		controller = cf.getController(actionPage);
		
		//controller.execute(req,res);
		ModelAndView modelAndView = controller.execute(req,res);
		new ViewResolver().forward(req,res,modelAndView);
		
		System.out.println("[ DispatcherServlet.service() end....]");
	}
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf("/")+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start,end);
		return actionPage;
	}
	

}
