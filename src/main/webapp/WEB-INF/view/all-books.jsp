<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Employees</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Author</th>
        <th>Category</th>
    </tr>
    <c:forEach var="book" items="${allBooks}">

        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.category}</td>
        </tr>
    </c:forEach>

</table>
<br>

<input type="button" value="add"
    onclick="window.location.href='addEmployee'"/>

</body>
</html>