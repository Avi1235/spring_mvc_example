package jd.spring.mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMexicoValidacion implements ConstraintValidator<CPostalMexico, String> {

    private String prefijoCodigoMexico;

    @Override
    public void initialize(CPostalMexico defaultValue) {
        prefijoCodigoMexico = defaultValue.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value!=null)
            return value.startsWith(prefijoCodigoMexico);
        else
            return true;
    }
}
