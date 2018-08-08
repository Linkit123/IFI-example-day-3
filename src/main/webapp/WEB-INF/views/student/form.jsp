<%--
  Created by IntelliJ IDEA.
  User: trinhngoclinh
  Date: 8/8/2018
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Student</title>
</head>
<body>
<h2>Sinh viên poly</h2>
<form action="save-data.htm" method="post">
    <div>Họ và tên </div>
    <input name="name"/>

    <div>Điểm trung bình</div>
    <input name="mark">

    <div>Chuyên nghành</div>
    <label>
        <input type="radio" name="major" value="APP">
        Ứng dụng phần mềm
        <input type="radio" name="major" value="WEB">
        Thiết kế trang web
    </label>

    <hr>
    <button>Lưu</button>
</form>
</body>
</html>
