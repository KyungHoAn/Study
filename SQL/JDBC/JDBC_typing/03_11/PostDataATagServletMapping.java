package sql_JDBC.day0313;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PostDataATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		//Client Form Data�ѱ� ���ڵ�
		req.setCharacterEncoding("EUC_KR");
		
		//Servlet���� client�� Html ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form dataó��
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//Client Form Dtaaó�� ��� Ȯ��
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li> �̸�:"+clientName);
		out.println("<li> �ּ�:"+clientAddr);
		
		out.println("<p><p><a href='/edu/jw02/poatDataATagServletMapping.html'>�ڷ�</a>");
		
		out.println("<p><p><a=gref='/edu/PostDataATagServletMapping?name=ȫ�浿&addr=����'?>"+"�ڱ��ڽ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
