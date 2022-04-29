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

<h3> Product Successfully Added </h3>
<a href="welcomeEshop">Log Out</a><br><br>
<a href=addProductPage>Add Product</a><br><br>


<h3 style="color:blue; text-align: center">Products Details</h3>
<hr>

<center>
	<table>
		<thead>
			<tr>
				<td style="color:red;">Product Id :</td>
				<td style="color:red;">Product Name :</td>
				<td style="color:red;">Product Price :</td>
				<td style="color:red;">Product Description :</td>
				<td style="color:red;">Product Catagory :</td>
				<td style="color:red;">Product MFG Date :</td>
				<td style="color:red;">Product EXP Date :</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="l">
			<tr>
				<td style="text-align:center">${l.productId}</td>
				<td style="text-align:center">${l.productName }</td>
				<td style="text-align:center">${l.productPrice }</td>
				<td style="text-align:center">${l.productDescription }</td>
				<td style="text-align:center">${l.productCategory }</td>
				<td style="text-align:center">${l.manufacturingDate }</td>
				<td style="text-align:center">${l.expirationDate }</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
	</center>
<hr>

</body>
</html>