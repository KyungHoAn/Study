package sql_JDBC.day0313;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		
		//�Ʒ��� �� ���๮�� servlet���� cliet�� Html���۽� �ݵ�� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client���� ���۵Ǿ� ���� data(QueryString::name=value ó��)(apIȮ��)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//client�� ���� ���� Data�� ���
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetDataKrATag.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>�̸�:"+clientName);
		out.println("<li>�ּ�:"+clientAddr);
		
		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>�ڷ�</a>");
		
		//.==><a>�¤��׸� �̿��Ͽ� Query���ڿ� ����
		out.println("<p><a href='/edu.GetDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	}
}
