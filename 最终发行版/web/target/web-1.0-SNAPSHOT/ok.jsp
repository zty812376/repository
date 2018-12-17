<%--
  Created by IntelliJ IDEA.
  User: zty
  Date: 2018/12/16
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="all">
    ${all[0].id}
    ${all[0].name}
    ${all[0].pic}
    ${all[0].price}
    ${all[0].detail}
</c:forEach>
</body>
</html>
