<%--
  Created by IntelliJ IDEA.
  User: khai trinh
  Date: 01/03/2021
  Time: 5:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<table>
    <form method="post">
        <tr>
            <th>ID</th>
            <td><input type="text" name="id" value="${customer.id}" disabled></td>
        </tr>
        <tr>
            <th>NAME</th>
            <td><input type="text" name="name" value="${customer.name}"></td>
        </tr>
        <tr>
            <th>EMAIL</th>
            <td><input type="text" name="email" value="${customer.email}"></td>
        </tr>
        <tr>
            <th>ADDRESS</th>
            <td><input type="text" name="address" value="${customer.address}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="EDIT"></td>
        </tr>
    </form>
</table>
</body>
</html>
