<%--
  Created by IntelliJ IDEA.
  User: pan
  Date: 2019/1/24
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>展示是否能跑通</title>
</head>
<body>
    <table>
        <tr>
            <td>用户名</td>
            <td>密码</td>
            <td>类型</td>
            <td>状态</td>
        </tr>
        <c:forEach var="row" items="${user}" >
            <tr>
                <td>${row.uName}</td>
                <td>${row.password}</td>
                <td>${row.uType}</td>
                <td>${row.uStates}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
