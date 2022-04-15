package homework;

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
public class Homework01 extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String birth = req.getParameter("year");
		String job = req.getParameter("job");
		String phone = req.getParameter("phone");
		
		//UserVO instance���� �� Client form data ����
		loginVO loginVO = new loginVO();
		loginVO.setName(name);
		loginVO.setSex(sex);
		loginVO.setYear(birth);
		loginVO.setJob(job);
		loginVO.setPhone(phone);
		
		//DB���� Data�˻� �� UserVO active true/false����
		DataSourceDao Dsd = new DataSourceDao();
		Dsd.getUser(loginVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Loginȭ��<h2>");
		
		if(loginVO.isActive()) {
			out.println(name+"�� ȯ���մϴ�.");
		}else {
			out.println("Login����");
		}
		out.println("<p><p><a href='./homework01/HW.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}

}//end of class