import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : MultiCheck01.java
 */
//@WebServlet("/MultiCheck02")
public class Homework02 extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String sex = req.getParameter("sex");
		String birth = req.getParameter("year");
		String job = req.getParameter("job");
		String phone = req.getParameter("phone");
		
		//UserVO instance���� �� Client form data ����
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setId(id);
		userVO.setSex(sex);
		userVO.setYear(birth);
		userVO.setJob(job);
		userVO.setPhone(phone);
		
		//DB���� Data�˻� �� UserVO active true/false����
		UserDao Dsd = new UserDao();
		Dsd.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Loginȭ��<h2>");
		
		if(userVO.isActive()) {
			out.println(userVO.getName()+"�� ȯ���մϴ�.");
			req.getSession(true).setAttribute("userVO", userVO);
		}else {
			out.println("Login����");
		}
		out.println("<p><p><a href='id.html'>ȸ����������</a>");
		out.println("<p><p><a href='/homework02/FindId'>session��������</a>");
		out.println("</body>");
		out.println("</html>");
	}

}//end of class