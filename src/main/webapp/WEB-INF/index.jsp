<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">
<head>
    <title>MainPage</title>
    <meta charset="utf-8">
</head>
<body>
    <h1>Hello, human!</h1>
    <h2>Do you want to add a new participant?</h2>
    <h3><a href="/demo/create">Yes<a></h3>



    <h3>Participants</h3>
    <table>
     <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Level</th>
        <th>Primary skill</th>
        <th>Delete</th>
     </tr>
     <c:forEach var="participant" items="${participants}">
        <tr>
            <td>${participant.id}</td>
            <td>${participant.name}</td>
            <td>${participant.email}</td>
            <td>${participant.level}</td>
            <td>${participant.primarySkill}</td>
            <td><a href="/demo/delete?id=${participant.id}">delete</a></td>
        </tr>
     </c:forEach>
     </table>
</body>
</html>
