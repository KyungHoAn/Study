<%@page import="jw.services.user.dao.UserDAO.UserDao"%>
<%@page import="jw.services.user.vo.UserVO.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>	

<%
	request.setCharacterEncoding("EUC_KR");		
	
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String sex = request.getParameter("sex");
	String birth = request.getParameter("year");
	String job = request.getParameter("job");
	String phone = request.getParameter("phone");
	
	//UserVO instance생성 및 Client form data 전달
	UserVO userVO = new UserVO();
	userVO.setName(name);
	userVO.setId(id);
	userVO.setSex(sex);
	userVO.setYear(birth);
	userVO.setJob(job);
	userVO.setPhone(phone);
	
	//DB접근 Data검색 비교 UserVO active true/false변경
	UserDao Dsd = new UserDao();
	Dsd.getUser(userVO);
%>
<html>
<head></head>
<body>
<h2>로그인화면</h2>
<%if(userVO.isActive()) {%>
<%=userVO.getName() %>님 환영합니다.
<% request.getSession(true).setAttribute("userVO",userVO); %>
<%}else{ %>
로그인실패
<%} %>
<p><p><a href='id.html'>회원정보보기</a>
<p><p><a href='/homework02/FindId.jsp'>session정보보기</a>
</body>
</html>
 