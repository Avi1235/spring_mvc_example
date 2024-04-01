package jd.spring.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @InitBinder
    public void miBinder(WebDataBinder binder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(Model model) {
        Alumno elAlumno = new Alumno();
        model.addAttribute("elAlumno", elAlumno);

        return "alumnoRegistroFormulario";
    }

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno elAlumno,
                                     BindingResult resultadoValidacion) {
        System.out.println("si entre xd");
        if(resultadoValidacion.hasErrors()) {
            return "alumnoRegistroFormulario";
        }

        return "confirmacionRegistroAlumno";
    }

}
