package sql_JDBC.day0313;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		
		//아래의 두 실행문은 servlet에서 cliet로 Html전송시 반드시 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//client에서 전송되어 오는 data(QueryString::name=value 처리)(apI확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//client로 부터 받은 Data를 출력
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetDataKrATag.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li>이름:"+clientName);
		out.println("<li>주소:"+clientAddr);
		
		out.println("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>뒤로</a>");
		
		//.==><a>태ㄱ그를 이용하여 Query문자열 전달
		out.println("<p><a href='/edu.GetDataKrATagServletMapping?name=홍길동&addr=서울'>"+"자기자신</a>");
		
		out.println("</body>");
		out.println("</html>");
	}
}
