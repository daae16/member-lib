<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/common/common.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
    <th>이름</th>
    <th>아이디</th>
    <th>패스워드</th>
    <th>가입일</th>
 </tr> 
<c:forEach items='${memberList}' var="member">
   <tr>
       <td>${member.m_name}</td>
       <td><a href="/member/view?m_num=${member.m_id}">${member.m_id}</a></td>
       <td>${member.m_pwd}</td>
       <td>${member.m_credat}</td>
    </tr>   
</c:forEach>
</table>
</body>
</html>