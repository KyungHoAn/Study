package sql_JDBC.day0313;
import java.io.PrintWriter;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoGet {
	//init() == 금번예제 mehtod oberriding no need
	// service() ==> method overriding 않음
	
	//doGet() method Overrriding
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("::servlet doGet() 시작");
		System.out.println("Request Client IP :"+req.getRemoteAddr());
		
		//한글 처리
		res.setContentType("text/html;charset=EUC_KR");
		
		//printWriter 인스턴스 생성을 Encapsulation 한API사용 Stream생성
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English: HelloServlet");
		out.println("<p>");
		out.println("Koread: 헬로 서블릿");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::servlet doGet()종료 \n");
	}
}
