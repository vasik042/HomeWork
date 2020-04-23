<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">
<head>
    <title>MainPage</title>
    <meta charset="utf-8">
</head>
<body>
    <h1>Hello,${student.surname} ${student.name}!</h1>

    <img src="/demo/download/${student.id}" width="200px" ></img>

    <h2>Look at this handsome guy! You dont look ${student.age} years old!</h2>

</body>
</html>