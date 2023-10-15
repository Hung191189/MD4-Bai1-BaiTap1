<%--
  Created by IntelliJ IDEA.
  User: Le Khanh
  Date: 10/13/2023
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="usd" placeholder="USD">
    <input type="number" name="rate" placeholder="Rate">
    <input type="submit" value="Change">
</form>
${change}
</body>
</html>
