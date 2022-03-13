package sql_JDBC.day0313;
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet {
	//init() ==> �ݹ� ���� method overriding no need
	
	//service() method Overriding
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println(":: servlet service() ����");
		System.out.println("Request Client IP :"+req.getRemoteAddr());
		
		//�ѱ� ó��
		res.setContentType("text/html");
		//res.setContentType("text/html;charset=EUC_KR");
		
		//1.client HTML Text �������� Stream�� ����
		//OutputStream outputStream = res.getOutputStream();
		//Writer wirter = new OutputStreamWriter(outputStream);
		//PrintWriter out = new PrintWriter(writer);
		
		//2.PrintWrtier �ν��Ͻ� ������ Encapsulation �� API��� Stream ����
		PrintWriter out = res.getWriter();
		
		out.println("<htlml>");
		out.println("<head><title>hello Serclet</title></head>");
		out.println("<body>");
		out.println("<p>");
		out.println("Korea: ��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::servlet service() ���� \n");
	}
	//destroy()==> �ݹ� ���� method overrideing no need
}
