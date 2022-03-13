package sql_JDBC.day0313;
import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet {
	//init() ==> 금번 예제 method overriding no need
	
	//service() method Overriding
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println(":: servlet service() 시작");
		System.out.println("Request Client IP :"+req.getRemoteAddr());
		
		//한글 처리
		res.setContentType("text/html");
		//res.setContentType("text/html;charset=EUC_KR");
		
		//1.client HTML Text 전송위한 Stream을 생성
		//OutputStream outputStream = res.getOutputStream();
		//Writer wirter = new OutputStreamWriter(outputStream);
		//PrintWriter out = new PrintWriter(writer);
		
		//2.PrintWrtier 인스턴스 생성을 Encapsulation 한 API사용 Stream 생성
		PrintWriter out = res.getWriter();
		
		out.println("<htlml>");
		out.println("<head><title>hello Serclet</title></head>");
		out.println("<body>");
		out.println("<p>");
		out.println("Korea: 헬로 서블릿");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		System.out.println("::servlet service() 종료 \n");
	}
	//destroy()==> 금번 예제 method overrideing no need
}
