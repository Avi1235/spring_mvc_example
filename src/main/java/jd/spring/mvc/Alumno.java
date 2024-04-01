package jd.spring.mvc;

import jd.spring.mvc.validaciones.CPostalMexico;

import javax.validation.constraints.*;

public class Alumno {
    @NotNull
    @Size(min = 2, message = "Campo Requerido")
    private String nombre;
    @NotNull
    @Size(min = 2, message = "Campo Requerido")
    private String apellido;

    private String optativa;

    private String ciudad;

    private String idioma;

    @Min(value = 10, message = "No se permiten personas menores de 10 a\u00f1os")
    @Max(value = 100, message = "No se permiten personas mayores de 100 a\u00f1os")
    private int edad;

    @Email
    private String email;

    @Pattern(regexp = "[0-9]{5}", message = "Solo se permiten 5 valores numericos")
    @CPostalMexico
    private String codigoPostal;


    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOptativa() {
        return optativa;
    }

    public void setOptativa(String optativa) {
        this.optativa = optativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
