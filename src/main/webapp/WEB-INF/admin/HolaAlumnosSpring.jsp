<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/estilo.css">
</head>
<body>
    Hola ${param.nombreAlumno}. Bienvenido men

    <p><br>
    <h2>Atencion a todos</h2>

    ${mensajeClaro}
    </p>

    <img alt="foto" src="${pageContext.request.contextPath}/recursos/imgs/images.jpg">
</body>

</html>