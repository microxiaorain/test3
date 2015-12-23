<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rules</title>
</head>
<body>
<table border="1">
    <tr>
        <th>NO.</th>
        <th>Site</th>
        <th>PID</th>
        <th>SN</th>
        <th>Image URL</th>
        <th>CLI</th>
        <th>Config URL</th>
    </tr>
	<c:forEach items="${rules}" var="rule" varStatus="vs">
			<tr>
				 <td>
					<s:property value="#vs.index+1"/>
				 </td>
				 <td align = "center">${rule.siteId}</td>
				 <td align = "center">${rule.productId}</td>
				 <td align = "center">${rule.serialNumber}</td>
				 <td align = "center">${rule.imageUrl}</td>
				 <td align = "center">${rule.cliCommands}</td>
                 <td align = "center">${rule.configUrl}</td>
			 </tr>
	</c:forEach>
</table>
</body>
</html>