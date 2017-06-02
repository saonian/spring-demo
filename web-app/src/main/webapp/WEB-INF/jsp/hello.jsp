<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Hello Spring MVC</title>
</head>
<body>
<a href="add">添加</a>
<ul>
    <c:forEach items="${list}" var="i">
        <li><c:out value="${i.title}"/> [<a href="edit/<c:out value='${i.id}'/>">编辑</a>]  [<a href="delete/<c:out value='${i.id}'/>">删除</a>]</li>
    </c:forEach>
</ul>
</body>
</html>