package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

  @GetMapping("")
  public ModelAndView index(){
    ModelAndView modelAndView = new ModelAndView("formular");
    modelAndView.addObject("registraceForm", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@ModelAttribute("registraceForm") @Valid RegistraceForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/formular";
    }
    return new
            ModelAndView("/formular");
//            .addObject("email", RegistraceForm.getEmail());


  }

}
