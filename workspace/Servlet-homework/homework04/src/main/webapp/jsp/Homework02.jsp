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
	
	//UserVO instance���� �� Client form data ����
	UserVO userVO = new UserVO();
	userVO.setName(name);
	userVO.setId(id);
	userVO.setSex(sex);
	userVO.setYear(birth);
	userVO.setJob(job);
	userVO.setPhone(phone);
	
	//DB���� Data�˻� �� UserVO active true/false����
	UserDao Dsd = new UserDao();
	Dsd.getUser(userVO);
%>
<html>
<head></head>
<body>
<h2>�α���ȭ��</h2>
<%if(userVO.isActive()) {%>
<%=userVO.getName() %>�� ȯ���մϴ�.
<% request.getSession(true).setAttribute("userVO",userVO); %>
<%}else{ %>
�α��ν���
<%} %>
<p><p><a href='id.html'>ȸ����������</a>
<p><p><a href='/homework02/FindId.jsp'>session��������</a>
</body>
</html>
 