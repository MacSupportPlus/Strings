<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
<div class="container">
	<div class="col-6 offset-3 border border-dark mt-3">
	<h1><u>Count:</u> Submitted: <c:out value="${counter}"/> times.</h1>
	<h1>welcome, <c:out value="${dojoName}"/></h1>
    <div class="form-group row">
    <div class="col-sm-3 offset-sm-9">
      <a href="/home" class="btn btn-primary btn-block">Count</a>
    </div>
  </div>
 	
 	</div>
 </div>

</body>
</html>