package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/formular");
        modelAndView.addObject("registraceForm", new RegistraceForm());
        return modelAndView;
    }

    @PostMapping("")
    public Object form(@ModelAttribute("registraceForm") @Valid RegistraceForm form, BindingResult bindingResult)  throws ParseException {
        if (bindingResult.hasErrors()) {
            return "/formular";
        }

        if (form.getSport().size() < 2) {
            bindingResult.rejectValue("sport", "", "Je potřeba zadat alespoň 2 sporty.");
            return "/formular";
        }

        if (form.vypocetVeku() < 9 || form.vypocetVeku() > 15) {
            bindingResult.rejectValue("datumNarozeni", "", "Tábor je pouze pro děti ve věku od 9 do 15 let.");
            return "/formular";
        }

        return new ModelAndView("/objednano")
                .addObject("email", form.getEmail())
                .addObject("jmeno", form.getJmeno())
                .addObject("prijmeni", form.getPrijmeni())
                .addObject("datumNarozeni", form.getDatumNarozeni())
                .addObject("pohlavi", form.getPohlavi())
                .addObject("sport", form.getSport())
                .addObject("turnus", form.getTurnus())
                .addObject("telefon", form.getTelefon());


    }


}
