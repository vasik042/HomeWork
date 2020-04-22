<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">
<head>
    <title>new</title>
    <meta charset="utf-8">
</head>
<body>
    <form action="/demo/create" method="post">
         <label for="Name">Name:</label> <input type="text" id="name" name="name" value="${participant.name}">
         <label for="Email">Email:</label> <input type="text" id="email" name="email" value="${participant.email}">
         <label for="Level">Level:</label> <input type="text" id="level" name="level" value="${participant.level}">
         <label for="Primary skill">Primary skill:</label> <input type="text" id="primarySkill" name="primarySkill" value="${participant.primarySkill}">
        <input type="submit" value="create">
    </form>
</body>
</html>