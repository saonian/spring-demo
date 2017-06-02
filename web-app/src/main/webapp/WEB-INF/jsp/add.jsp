<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Hello Spring MVC</title>
</head>
<body>
    <form:form method="POST" commandName="testDto" action="/test/save">
        <form:errors path="*" element="div" />
        <form:hidden path="id" />
        <table>
            <tr>
                <td><form:label path="title">标题：</form:label></td>
                <td><form:input path="title" /></td>
            </tr>
            <tr>
                <td><form:label path="contents">内容：</form:label></td>
                <td><form:input path="contents" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提 交"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>