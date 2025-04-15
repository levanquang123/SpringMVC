<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html>
 <head><title>User List</title></head>
 <body>
 <h2>Danh sách người dùng</h2>
 <table border="1">
     <tr><th>ID</th><th>Name</th><th>Email</th></tr>
     <c:forEach items="${users}" var="u">
         <tr>
             <td>${u.id}</td>
             <td>${u.name}</td>
             <td>${u.email}</td>
         </tr>
     </c:forEach>
 </table>
 </body>
 </html>
 
