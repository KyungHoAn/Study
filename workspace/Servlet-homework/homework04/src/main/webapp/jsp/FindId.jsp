<%@page import="jw.services.user.vo.UserVO.UserVO"%>
<%@page import="jw.services.user.dao.UserDAO.UserDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	
	String id = request.getParameter("id");
		
	if(id == null){
		//==>  Session�� ����� userVO instance �� id ���
		//HttpSession session = request.getSession(true);
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
%>
<html>
<head></head>
<body>
<h2>====ȸ������====</h2>
<% if(userVO!=null) {%>
name:<%=userVO.getName() %>&nbsp;
sex:<%=userVO.getSex() %>&nbsp;
age:<%=userVO.getYear() %>&nbsp;
����:<%=userVO.getJob() %>&nbsp;
��ȣ:<%=userVO.getPhone() %>&nbsp;
<%} else{ %>
ȸ����������
<%} %>
</body>
</html>
