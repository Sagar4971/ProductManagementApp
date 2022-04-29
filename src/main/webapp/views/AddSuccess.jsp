<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 style="color:blue;">USER DATA</h3>
<hr>


	<table>
	  	<thead>    
			<tr>
				<th style="color:red;">Product Id :</th>
				<th style="color:red;">Product Name :</th>
				<th style="color:red;">Product Price :</th>
				<th style="color:red;">Product Description :</th>
				<th style="color:red;">Product Category :</th>
				<th style="color:red;">Product MFG Date :</th>
				<th style="color:red;">Product EXP Date:</th>
			</tr>
		</thead>  
	  	<tbody>    
			<c:forEach items="${addProduct}" var="p"> 
			<tr>
				<td>${p.productId }</td>
				<td>${p.productName }</td>
				<td>${p.productPrice }</td>
				<td>${p.productDescription }</td>
				<td>${p.productCategory }</td>
				<td>${p.manufacturingDate }</td>
				<td>${p.expirationDate }</td>
				</tr>
	  	</c:forEach>   

	  	</tbody>    

	</table>
<hr>

</body>
</html>