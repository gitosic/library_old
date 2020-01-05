<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
	<head>
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Hello World</title>
	</head>
	<body>
		<header>
			<h1>Title : ${title}</h1>
		</header>
		<section>
			<h1>Message : ${message}</h1>
		</section>
		<div>Get <a href="free">free</a> resource free.</div>
		<div>Get <a href="free2">free2</a> resource free2.</div>
		<div>Get <a href="bookslist">bookslist</a> resource ---> bookslist.</div>
		<div>Get <a href="protected">protected</a> resource for admin.</div>
		<div>Get <a href="confidential">confidential</a> resource for superadmin.</div>
		<footer>
			<div>Updated by Alex Art from <a href="https://in2circle.com" target="_blank">in2circle.com</a></div>
		</footer>
	</body>
</html>
