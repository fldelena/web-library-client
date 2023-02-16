<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Add new Book</h2>
<br>
<form:form action="saveBook" modelAttribute="newBook">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Author <form:input path="author"/>
    <br><br>
    Category <form:input path="category"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>