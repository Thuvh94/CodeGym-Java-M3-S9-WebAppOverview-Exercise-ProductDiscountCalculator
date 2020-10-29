<%--
  Created by IntelliJ IDEA.
  User: thu
  Date: 10/29/2020
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ProductDiscountCalculator</title>
<%--    Ứng dụng Product Discount Calculator được sử dụng để tính chiết khấu cho sản phẩm khi mua hàng online.--%>
</head>
<body>
<form method="post"action="/display-discount">
<label for="description">Product Description</label>
<input type="text" name = "productDes" id="description" placeholder="Product Description"><br><br>
<label for="price">List Price</label>
<input type="text" name = "listPrice" id="price" placeholder="List Price"><br><br>
<label for="percent">Discount percentage</label>
<input type="text" name="discountPercent"id="percent" placeholder="Discount Percent"><br><br>
    <input type="submit" id = "submit" value = "Calculate">
</form>
</body>
</html>
