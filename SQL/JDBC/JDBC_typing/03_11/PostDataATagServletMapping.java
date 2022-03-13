package sql_JDBC.day0313;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PostDataATagServletMapping extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		//Client Form Data한글 디코딩
		req.setCharacterEncoding("EUC_KR");
		
		//Servlet에서 client로 Html 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Client Form data처리
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//Client Form Dtaa처리 출력 확인
		System.out.println(clientName+":"+clientAddr);
		
		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get Test</h2>");
		out.println("<li> 이름:"+clientName);
		out.println("<li> 주소:"+clientAddr);
		
		out.println("<p><p><a href='/edu/jw02/poatDataATagServletMapping.html'>뒤로</a>");
		
		out.println("<p><p><a=gref='/edu/PostDataATagServletMapping?name=홍길동&addr=서울'?>"+"자기자신</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
