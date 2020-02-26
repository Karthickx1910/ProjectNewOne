<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table table-bordered">
				<thead>
		<form action="<%=request.getContextPath()%>/StudentList">
				<button class="btn btn-outline-success btn-rounded btn-sm my-0"
							type="submit">Search</button>		
						
					</form>
					<tr>
						<th>Studentid</th>
						<th>Name</th>
						<th>Marks</th>
						

					</tr>
				</thead>

				<tbody>

					<c:forEach var="stud" items="${list}">

						<tr>
							<td><c:out value="${stud.studentId}" /></td>
							<td><c:out value="${stud.studentName}" /></td>
							<td><c:out value="${stud.marks}" /></td>
							
							

						</tr>
					</c:forEach>
					
					</tbody>

			</table>

				</tbody>


</body>
</html>