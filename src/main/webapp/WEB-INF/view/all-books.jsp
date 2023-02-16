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

        <c:url var="updateButton" value="/updateBook">
            <c:param name="bookId" value="${book.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteBook">
            <c:param name="bookId" value="${book.id}"/>
        </c:url>

        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.category}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>
<br>

<input type="button" value="add"
    onclick="window.location.href='addBook'"/>

</body>
</html>