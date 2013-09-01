<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" lang="en">

<head>
	<title>JSP Example</title>
	<meta charset="UTF-8"/>
	<link rel="icon" href="images/thymeleaf-logo.png"/>
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,400italic,700,700italic" media="screen"/>
	<link rel="stylesheet" href="styles/normalize.css" media="screen"/>
	<link rel="stylesheet/less" type="text/css" href="styles/example.less" media="screen"/>
	<script src="scripts/less-1.4.1.min.js"></script>
</head>

<body id="blog">

	<c:forEach var="post" items="${posts}">
		<section class="post">
			<header>
				<h1>${post.title}</h1>
			</header>
			<div class="info">
				<time datetime="<joda:format value="${post.date}" pattern="yyyy-MM-dd HH:mm:ssZ"/>">
					<joda:format value="${post.date}" pattern="EEEE, d MMMM yyyy"/>
				</time>
			</div>
			<div class="content">
				${post.content}
			</div>
			<footer>
				${post.author}
			</footer>
		</section>
	</c:forEach>

</body>

</html>
