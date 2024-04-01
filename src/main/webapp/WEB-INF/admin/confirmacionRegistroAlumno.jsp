<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Confirmacion Registro</title>
</head>
<body>

    El alumno con nombre <strong>${elAlumno.nombre}</strong> y apellido <strong>${elAlumno.apellido}</strong> de edad <strong>${elAlumno.edad}</strong> años se ha registrado con exito.
    <br/>
    El email de registro es el siguiente: <strong>${elAlumno.email}</strong>
    <br/>
    El codigo postal es: <strong>${elAlumno.codigoPostal}</strong>
    <br/>
    La asignatura escogida es: <strong>${elAlumno.optativa}</strong>
    <br/>
    La ciudad donde estudia el alumno es: <strong>${elAlumno.ciudad}</strong>
    <br/>
    Se registro para estudiar los siguientes idiomas: <strong>${elAlumno.idioma}</strong>

</body>

</html>