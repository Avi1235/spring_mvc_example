package jd.spring.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping
    public String muestraPagina() {
      return "paginaEjemploa";
    }
}
