<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" lang="en">

<head>
	<title>My website</title>
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,400italic,700,700italic" media="screen"/>
	<link rel="stylesheet" href="styles/normalize.css" media="screen"/>
	<link rel="stylesheet" href="styles/example.css" media="screen"/>
</head>

<body id="blog">

	<c:forEach var="post" items="${blog.posts}">
		<section id="${post.id}" class="post">
			<header class="post-title">
				<h1>${post.title}</h1>
			</header>
			<div class="post-info">
				<time datetime="<joda:format value="${post.date}" pattern="yyyy-MM-dd HH:mm:ssZ"/>">
					<joda:format value="${post.date}" pattern="EEEE, d MMMM yyyy"/>
				</time>
			</div>
			<div class="post-content">
				${post.content}
			</div>
			<footer class="post-footer">
				${post.author}
			</footer>
		</section>
	</c:forEach>

</body>

</html>
