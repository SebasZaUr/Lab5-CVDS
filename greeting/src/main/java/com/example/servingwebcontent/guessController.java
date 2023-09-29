package com.example.servingwebcontent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class guessController {

    @GetMapping("/guess")
    public ModelAndView greeting(Model model) {
        Guess juego = new Guess();
        ModelAndView modelAndView = new ModelAndView("guess");
        modelAndView.addObject("juego", juego);
        return modelAndView;
    }
}
