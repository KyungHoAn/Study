import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FindId extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");

		
		if(id == null){
			//==>  Session�� ����� userVO instance �� id ���
			HttpSession session = req.getSession(true);
			id=( (UserVO)session.getAttribute("userVO")).getId();
		}
		
		UserDao ud = new UserDao();
		UserVO userVO = ud.findId(id);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("userVO", userVO);
//		String name = userVO.getName();
//		String sex = userVO.getSex();
//		String birth = userVO.getYear();
//		String job = userVO.getJob();
//		String phone = userVO.getPhone();
		 
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>===ȸ������===<h2>");
		
		if(userVO!=null) {
			out.println("name:"+userVO.getName()+" sex: "+userVO.getSex()
			+"����: "+userVO.getYear()+" ����: "+userVO.getJob()
			+"��ȣ: "+userVO.getPhone());
		}else {
			out.println("ȸ����������");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
