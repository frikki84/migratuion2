<%@ page language="java" contentType="text/html; UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contexPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <body>
        <h2>Home page</h2>
<%--        <a href="${linkTo[CompanyController].companies}">Companies</a>--%>
        <a href="${contexPath}">${contexPath}</a>
    </body>
</html>
