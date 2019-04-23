<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%@ page import="basic05.*" %>
<%
BbsDAO bDao = new BbsDAO();
List<BbsDTO> list = bDao.
bDao.close();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
		td, th { text-align: center; }
		.button {
			font-weight: bold; font-size: 9pt;
			border: 1px solid powderblue;
		}
		input[type=submit] {
			width: 5em; height: 2.5em;
			font-weight: bold; font-size: 10pt;
		}
	</style>
</head>
<body>
<center>
	<h3>회원 명단</h3>
	<hr>
	<%=(String)session.getAttribute("memberId")%> 회원님 반갑습니다.
	<a href="content_List.jsp">글쓰기</a>&nbsp;&nbsp;&nbsp;
	<a href="/jspbook/bbs/bbsProcServlet?action=logout">로그아웃</a>
	<hr>
	<table border="1" style="border-collapse:collapse;" height=300, width=600>
	<tr bgcolor="pink"><th>글넘버</th><th>아이디</th><th>제목</th><th>날짜</th><th>글</th></tr>
	<%
	for (BbsDTO member: list) {
	%>
		<tr><td><%=member.getId()%></td>
		<td><%=member.getTitle()%></td>
		<td><%=member.getDate()%></td>
		<td><%=member.getContent()%></td>
		<%
			String updateUri = "memberProcServlet?action=update&id=" + member.getId();
			String deleteUri = "memberProcServlet?action=delete&id=" + member.getId();
		%>
		<td>&nbsp;<button onclick="location.href='<%=updateUri%>'">수정</button>&nbsp;
			<button onclick="location.href='<%=deleteUri%>'">삭제</button>&nbsp;</td></tr>
	<%
	}
	%>
	</table>
	</center>
</body>
</html>