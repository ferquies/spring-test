<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<spring:message code="greeting"/>
	<c:choose>
		<c:when test="${name eq null}">
			<spring:message code="world"/>
		</c:when>
		<c:otherwise>
			${name}
		</c:otherwise>
	</c:choose>
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
