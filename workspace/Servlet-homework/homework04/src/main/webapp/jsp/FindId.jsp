<%@page import="jw.services.user.vo.UserVO.UserVO"%>
<%@page import="jw.services.user.dao.UserDAO.UserDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	
	String id = request.getParameter("id");
		
	if(id == null){
		//==>  Session에 저장된 userVO instance 의 id 사용
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
<h2>====회원정보====</h2>
<% if(userVO!=null) {%>
name:<%=userVO.getName() %>&nbsp;
sex:<%=userVO.getSex() %>&nbsp;
age:<%=userVO.getYear() %>&nbsp;
직업:<%=userVO.getJob() %>&nbsp;
번호:<%=userVO.getPhone() %>&nbsp;
<%} else{ %>
회원정보없음
<%} %>
</body>
</html>
