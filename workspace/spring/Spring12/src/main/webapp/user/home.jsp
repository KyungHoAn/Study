<%@page import="spring.domain.User"%>
<%@ page contentType="text/html; charset=EUC-KR" %>


<!-- ///////////////////////// ����� �κ� ///////////////////////////
	- Model2 Web Arch. ���� �� :: JSP�� View ����
	- Work Flow Control�� Controller ���
	- �Ʒ��� �ּ� : Controller ����ϴ� ControlServlet ���� ó��
	////////////////////////////////////////////////////////////////-->
 
 <!-- #.��α����� ȸ���̸�...  -->
 <% User sessionUser = (User)session.getAttribute("sessionUser"); %>
 
 <% //if(user == null || !userVO.isActive()){ %>
 		<%--<jsp:forward page="logon.jsp"/>--%>
<%//} %>
 
<html>
	<head>Home Page</head>
	<body>
	
	<!-- ///// �߰��� �κ� ///// -->
	[��info��] :: ${requestScope.message}<br/><br/>
	
	<!-- ////////////////////////// -->
		<p>Simple Model2 Examples</p>
		<p>ȯ���մϴ�. : <%= sessionUser.getUserId() %>��</p>

		<br/><br/>
		<a href="logout">logout</a>
	</body>
</html>