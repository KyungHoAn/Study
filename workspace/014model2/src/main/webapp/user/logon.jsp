<%@ page contentType="text/html; charset=EUC-KR" %>

<!-- ///////////////////////// ����� �κ� ///////////////////////////
	- Model2 Web Arch. ���� �� :: JSP�� View ����
	- Work Flow Control�� Controller ���
	- �Ʒ��� �ּ� : Controller ����ϴ� ControlServlet ���� ó��
	////////////////////////////////////////////////////////////////-->

<%
	//UserVO userVO = (UserVO)session.getAttribute("userVO");
%>

<html>
	<head></head>	
	<body>
	
		<% //if(userVO == null || userVO.isActive() != true) {%>
		
		<!-- ///////////////////////////////����� �κ�/////////////////////////////// -->
		<!--  <form id="login" method="post	action="/012model2/logonAction.do"> -->
		<!--  //////////////////////////////////////////////////////////////////////// -->
	   <form id="login" method="post" action="/014model2/user/logonAction.do">
				
				�� �� �� : <input id="userId" type="text" name="userId" value=""><br/><br/>
				�н����� : <input id="userId" type="text" name="userPasswd" value=""><br/><br/>
				<input id="submit" type="submit" name="submit" value="Enter"/>
				
			</form>

		<%//else{ %>
			<%-- <%= userVO.getUserId() ���� �̹� �α��� �ϼ̽��ϴ�.--%>
		<%//} %>

			<br/><br/>
			<hr/>
			::info <%=request.getAttribute("info")%>
			<hr/>
	
	</body>
</html>