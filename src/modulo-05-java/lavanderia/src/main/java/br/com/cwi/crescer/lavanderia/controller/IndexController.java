package br.com.cwi.crescer.lavanderia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String Index(Model model) {
        String mensagem = "Lavanderia Crescer";
        
        model.addAttribute("mensagem", mensagem);
        return "/home/Index";
    }


}
