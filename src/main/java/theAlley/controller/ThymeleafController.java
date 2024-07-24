package theAlley.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import theAlley.db.UserRepo;
import theAlley.service.DarknessConstants;
import theAlley.service.EngineService;

//serves up thymeleaf assisted web pages
@Controller
public class ThymeleafController {

    UserRepo uRepo;

    EngineService methods;

    //default index/user creation page
    @GetMapping("/")
    public String index() {
        methods.initializeMapValues();
        methods.initializeItemValues();
        methods.initializeNpcValues();
        return "index";
    }

    // main home page template
    @GetMapping("/home")
    public String home(@RequestParam(name = "name", required = false) String name, Model model) {
        //model.addAttribute("name", uRepo.findByName(name).getName());
        model.addAttribute("mapInfo", DarknessConstants.map_0);
        model.addAttribute("npcInfo", DarknessConstants.npc_0);
        return "home";
    }

    //todo administration thymeleaf template
    @GetMapping("/template_1")
    public String template_1(@RequestParam(name = "name", required = true) String name, Model model) {
        //model.addAttribute("name", uRepo.findByName(name).getName());
        return "template_1";
    }
}