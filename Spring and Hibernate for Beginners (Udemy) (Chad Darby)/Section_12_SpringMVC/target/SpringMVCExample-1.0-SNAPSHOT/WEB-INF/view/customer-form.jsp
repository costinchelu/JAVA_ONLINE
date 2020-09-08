<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet"
          type="text/css"
          href="${pageContext.request.contextPath}/resources/css/error.css"/>

    <title>Customer Registration Form</title>
</head>
<body>

<i>Customer Registration Form (last name field is mandatory)</i>
<br><br>

<%--@elvariable id="customer" type="ro"--%>
<form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>

    Last name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    <input type="submit" value="Submit"/>

</form:form>
</body>
</html>

