package pl.piotrdawidziuk.roundone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.piotrdawidziuk.roundone.model.User;
import pl.piotrdawidziuk.roundone.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/newuser")
    String newUser (Model model) {
        model.addAttribute("user", new User());

        return "form/newuser";
    }


}
