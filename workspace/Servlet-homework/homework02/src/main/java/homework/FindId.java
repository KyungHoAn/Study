package homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindId extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
				
		UserDao ud = new UserDao();
		UserVO userVO = ud.findId(name);
		
		String name1 = userVO.getName();
		String sex = userVO.getSex();
		String birth = userVO.getYear();
		String job = userVO.getJob();
		String phone = userVO.getPhone();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>===회원정보===<h2>");
		
		if(userVO!=null) {
			out.println("name:"+userVO.getName()+" : "+userVO.getSex()+" : "+birth+" : "+job+" : "+phone);
		}else {
			out.println("회원정보없음");
		}
		out.println("</body>");
		out.println("</html>");		
	}
}
