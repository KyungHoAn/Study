package sql_JDBC.day0313;
import java.io.PrintWriter;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoGet {
	//init() == �ݹ����� mehtod oberriding no need
	// service() ==> method overriding ����
	
	//doGet() method Overrriding
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("::servlet doGet() ����");
		System.out.println("Request Client IP :"+req.getRemoteAddr());
		
		//�ѱ� ó��
		res.setContentType("text/html;charset=EUC_KR");
		
		//printWriter �ν��Ͻ� ������ Encapsulation ��API��� Stream����
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English: HelloServlet");
		out.println("<p>");
		out.println("Koread: ��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::servlet doGet()���� \n");
	}
}
