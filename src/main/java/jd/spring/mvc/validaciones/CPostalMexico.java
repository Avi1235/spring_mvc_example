package jd.spring.mvc.validaciones;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CPostalMexicoValidacion.class) //La clase que contendra la logica de la validacion
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalMexico {

    //definir el c postal por defecto
    String value() default "80";

    //definir el mensaje de error por defecto
    String message() default "El codigo postal debe conmenzar con 80";

    //definir los grupos
    Class<?> [] groups() default {};

    //definir los payloads
    Class<? extends Payload> [] payload() default  {};
}
