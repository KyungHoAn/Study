package sql_JDBC.day0313;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoPost extends HttpServlet{
	//init() ==>  �ݹ� ���� method Overridding no need
	//service() ==> mehtod overriding ����
	
	//doPost() mehtod Overriding
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("::servlet do Post() ����");
		System.out.println("Request Client Ip:"+req.getRemoteAddr());
		
		//�ѱ� ó��
		res.setContentType("text/html;charset=EUC_KR");
		
		//PrintWriter �ν��Ͻ� ������  Encapsulation �� API	��� stream ����
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("English: HelloServlet");
		out.println("<p>");
		out.println("Korea: ��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::serclet doPost() ����");
	}
}
