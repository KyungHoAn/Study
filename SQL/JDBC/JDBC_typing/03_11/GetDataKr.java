package sql_JDBC.day0313;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GetDataKr extends HttpServlet{
	//1.Client Get방식으로 Request:: do Get() method O/R
	//2.service() O/R기능
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		
		//아래의 두 실행문은 servlet에서 client로 Html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out= res.getWriter();
		
		//client form data(QueryString::name=value)처리(API확인)
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");
		
		//client form data출력(출력은??)
		System.out.println(clientName+":"+clientAddr);
		
		/*
		//한글깨짐 해결방법
	 * */
		
		out.println("<html>");
		out.println("<head><title>GetDataKr.java</title></head>");
		out.println("<body>");
		
		out.println("<h2>Get testKr<li2>");
		out.println("<li>이름:"+clientName);
		out.println("<li>주소:"+clientAddr);
		
		out.println("<p><p><a href='edu/getDataKr.html'>뒤로</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
