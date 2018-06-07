<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 07.06.18
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new user</title>
</head>
<body>
<p>Create a new user</p>

<form:form modelAttribute="user">
    <form:errors path="*"/>
    <p><label for="username"></label> </p>
    <p><form:input path="username" id="username"/></p>
    <p><form:errors path="username" cssClass="error"/><p/>


    <p><label for="email">E-Mail</label></p>
    <p><form:input path="email" id="email"/></p>
    <p><form:errors path="email" cssClass="error"/></p>


    <p><button class="button" type="submit">Continue</button></p>

</form:form>
</body>
</html>
