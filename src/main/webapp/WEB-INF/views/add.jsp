<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h1>Add a task</h1>
		<form action= "addtask">
	ID: ${userid} <input type ="hidden" name = "userid" value ="${userid}">
	Task Name: <input type = "text" name = "taskname"> <br>
	DueDate: <input type = "text" name = "duedate" > <br>
	Completed: <input type = "text" name = "complete" value = "complete"> <br>
	<input type = "submit" class ="btn btn-primary" value ="Add">
	 </form>



</body>
</html>