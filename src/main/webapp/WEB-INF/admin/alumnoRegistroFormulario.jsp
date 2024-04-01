<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Registro</title>
</head>
<body>

    <form:form action="procesarFormulario" modelAttribute="elAlumno">

        Nombre: <form:input path="nombre"/>
        <form:errors path="nombre" style="color:red;"/>
        <br/><br/>

        Apellido: <form:input path="apellido"/>
        <form:errors path="apellido" style="color:red;"/>
        <br/><br/>

        Edad: <form:input path="edad"/>
        <form:errors path="edad" style="color:red;"/>
        <br/><br/>

        Email: <form:input path="email"/>
        <form:errors path="email" style="color:red;"/>
        <br/><br/>

        CP: <form:input path="codigoPostal"/>
        <form:errors path="codigoPostal" style="color:red;"/>
        <br/><br/>

        Asignaturas optativas: <br/>
        <form:select path="optativa" multiple="true">
            <form:option value="karate" label="karate"/>
            <form:option value="comercio" label="comercio"/>
            <form:option value="danza" label="danza"/>
        </form:select>

        <br/><br/>

        <label>
            Culiacan
            <form:radiobutton path="ciudad" value="Culiacan"/>
        </label><br/>
        <label>
            Monterrrey
            <form:radiobutton path="ciudad" value="Monterrrey"/>
        </label><br/>
        <label>
            Mazatlan
            <form:radiobutton path="ciudad" value="Mazatlan"/>
        </label><br/>
        <label>
            Guadalajara
            <form:radiobutton path="ciudad" value="Guadalajara"/>
        </label><br/>

        <br/><br/>

        Ingles<form:checkbox path="idioma" value="ingles"/>
        Espanol<form:checkbox path="idioma" value="espanol"/>
        Frances<form:checkbox path="idioma" value="Frances"/>
        Italiano<form:checkbox path="idioma" value="Italiano"/>

        <br/><br/>
        <input type="submit" value="Enviar">

    </form:form>

</body>

</html>