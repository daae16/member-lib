<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/book/update" id="frm">
<input type="hidden" 

</form>
<table border="1">
  <tr>
    <th>도서번호</th>
    <td>%{}</td>
  </tr>
  <tr>
    <th>도서명</th>
    <td>%{}</td>
  </tr>
  <tr>
    <th>저자</th>
    <td>%{}</td>
  </tr>
  <tr>
    <th>출판일</th>
    <td>%{book.b_credat}</td>
  </tr>
<c:forEach

</body>
</html>