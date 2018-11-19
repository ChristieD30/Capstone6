<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/lux/bootstrap.min.css" rel="stylesheet">
<title>Your task list</title>
</head>
<body>
<nav class="navbar navbar-light bg-light float-right">
        
        <a href = "register" class = "navbar-brand">Register</a>
        <a href="tasklist" class = "navbar-brand">Task Manager</a>
        <a href = "signin" class = "navbar-brand">Sign In</a>
        <form class="form-inline"></form>
    </nav>
	<div class="container">
	<div class = "container">
	<h1>List of Current Tasks</h1>
	
	<table class = "table">
	<thead>
		<tr>
	
		<td>Task Name</td>
		<td>Due Date</td>
		<td>Completed?</td>
	
		</tr>
		</thead>
	<c:forEach var ="p" items="${tasklist}">
	
		
		<tr>
		<td>${p.taskname}</td>
		<td>${p.duedate}</td>
		<td>${p.complete}</td>
	
		<td><a class ="btn btn-primary" href = "/update?userid=${p.userid}">Edit</a></td>
		<td><a class ="btn btn-primary" href = "/delete?userid=${p.userid}">Remove</a></td>
		</tr>
	
	</c:forEach>
	
	</table>
	
	
	</div>
	
	<a href = "/add" class = "btn btn-primary">Add</a>
	
	
	
	</div>


</body>
</html>