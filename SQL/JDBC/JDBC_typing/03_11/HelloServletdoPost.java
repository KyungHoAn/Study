package sql_JDBC.day0313;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletdoPost extends HttpServlet{
	//init() ==>  금번 예제 method Overridding no need
	//service() ==> mehtod overriding 않음
	
	//doPost() mehtod Overriding
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("::servlet do Post() 시작");
		System.out.println("Request Client Ip:"+req.getRemoteAddr());
		
		//한글 처리
		res.setContentType("text/html;charset=EUC_KR");
		
		//PrintWriter 인스턴스 생성을  Encapsulation 한 API	사용 stream 생성
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("English: HelloServlet");
		out.println("<p>");
		out.println("Korea: 헬로 서블릿");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::serclet doPost() 종료");
	}
}
