<%--
  Created by IntelliJ IDEA.
  User: administrator
  Date: 05.01.2020
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<#--Выводим список книг-->
<h1>Books list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Isbn</th>
        <th>Author</th>
    </tr>
    <#list books as book>
    <tr>
        <td><a href="/book/${book.id}">${book.id}</a></td>
        <td>${book.name}</td>
        <td>${book.isbn}</td>
        <td>${book.author}</td>
        <td><a href="/delete/${book.id}">Delete</a></td>
        <td><a href="/update/${book.id}">Update</a></td>
    </tr>
</#list>
</table>
<a href="/addBook">Create book</a>
</body>
</html>
