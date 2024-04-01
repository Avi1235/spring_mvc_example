package jd.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HolaAlumnosControlador {

    @RequestMapping("/muestraHoli")
    public String muestraFormulario() {
        //regresa el formulario
        return "HolaAlumnosFormulario";
    }

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario() {
        return "HolaAlumnosSpring";
    }

    @RequestMapping("procesarFormulario2")
    //public String otroProcesarFormulario(HttpServletRequest request, Model model) {
    public String otroProcesarFormulario(@RequestParam("nombreAlumno") String nombre, Model model) {
        //String nombre = request.getParameter("nombreAlumno");
        nombre += " es el mejor alumno";

        String mensajeFinal = "Quien es el mejor alumno? " + nombre;

        //agregando info al model
        model.addAttribute("mensajeClaro", mensajeFinal);
        return "HolaAlumnosSpring";
    }
}
