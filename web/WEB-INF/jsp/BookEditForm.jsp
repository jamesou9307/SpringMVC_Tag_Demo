<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-10-26
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Book Form</title>
</head>
<body>
<div id="global">
    <form:form commandName="book" action="/book_update" method="post">
        <fieldset>
            <legend>Edit a book</legend>
            <form:hidden path="id"/>
            <p>
                <label for="category">Category:</label>
                <form:select id="category" path="category.id" items="${categories}"
                itemlabel="name" itemValue="id"/>
            </p>
            <p>
                <label for="title">Title:</label>
                <form:input id="title" path="title"/>
            </p>
            <p>
                <label for="author">Author:</label>
                <form:input id="author" path="author"/>
            </p>
            <p>
                <label for="isbn">ISBN:</label>
                <form:input id="isbn" path="isbn"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Update Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
