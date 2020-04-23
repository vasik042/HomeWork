<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">
<head>
    <title>new</title>
    <meta charset="utf-8">
</head>
<body>
    <form action="/demo/create" method="post" enctype="multipart/form-data">
         <label for="Name">Name:</label> <input type="text" id="name" name="name" value="${student.name}">
         <label for="Surname">Surname:</label> <input type="text" id="surname" name="surname" value="${student.surname}">
         <label for="Age">Age:</label> <input  type="range" id="age" name="age" min="0" max="127" step="1" id="age" name="level" value="${student.age}">
         <label for="Photo">Photo</label> <input id="photo" type="file" name="photo" value="">
        <input type="submit" value="create">
    </form>

</body>
</html>