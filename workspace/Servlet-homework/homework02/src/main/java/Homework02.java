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
		
		//UserVO instance생성 및 Client form data 전달
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setId(id);
		userVO.setSex(sex);
		userVO.setYear(birth);
		userVO.setJob(job);
		userVO.setPhone(phone);
		
		//DB접근 Data검색 비교 UserVO active true/false변경
		UserDao Dsd = new UserDao();
		Dsd.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login화면<h2>");
		
		if(userVO.isActive()) {
			out.println(userVO.getName()+"님 환영합니다.");
			req.getSession(true).setAttribute("userVO", userVO);
		}else {
			out.println("Login실패");
		}
		out.println("<p><p><a href='id.html'>회원정보보기</a>");
		out.println("<p><p><a href='/homework02/FindId'>session정보보기</a>");
		out.println("</body>");
		out.println("</html>");
	}

}//end of class