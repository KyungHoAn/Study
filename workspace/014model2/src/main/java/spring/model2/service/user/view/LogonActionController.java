package spring.model2.service.user.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.control.Controller;
import spring.model2.control.ModelAndView;
import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

public class LogonActionController implements Controller{
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("[LogonActionController.execute() start....]");
		
		HttpSession session = req.getSession(true);
		
		//==>Controller :����/���� ó��
		//==>session ObjectScope����� UserVO��ü �̿� ����
		//==>���1: session ObjectScope�� userVO�ν��Ͻ� ���� �� ����
		if(session.isNew()||session.getAttribute("userVO")==null) {
			session.setAttribute("userVO",new UserVO());
		}
		
		//==> ��� 2: session ObjectScope userVO����
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		//==>controller: Navigation(forward/sendRedirect view page����)
		//navigation ����Ʈ ������ ����
		String requestPage = "/user/logon.jsp";
		
		//==>UserVO.active �̿� �α��� ���� �Ǵ�
		if(userVO.isActive()) {
			requestPage ="/user/home.jsp";
		}
		//==> �α����� ȸ���� �ƴ϶��
		else {
			//client form dataó��
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			//controller: model�� view�� ���� binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
		
		
		//controller: business logicó��
		UserDao userDao = new UserDao();
		userDao.getUser(userVO);
		
		//controller navigation
		if(userVO.isActive()) {
			requestPage="/user/home.jsp";
		}
	}
		
	System.out.println("[LogonActionController.execute() end....]");
	
	return new ModelAndView(requestPage,"info","[LogonActionController Message] :: Welcome");
	}
}




