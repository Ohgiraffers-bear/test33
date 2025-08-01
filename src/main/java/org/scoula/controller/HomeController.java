package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("name", "홍길동");
        log.info("==========> HomeController");
        return "index"; // view 이름
    }
}
