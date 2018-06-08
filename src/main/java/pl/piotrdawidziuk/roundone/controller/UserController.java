package pl.piotrdawidziuk.roundone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.piotrdawidziuk.roundone.model.User;
import pl.piotrdawidziuk.roundone.repository.UserRepository;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/newuser")
    String newUserGet (Model model) {
        model.addAttribute("user", new User());

        return "form/newuser";
    }

    @PostMapping("/newuser")
    String newUserPost (@Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "form/newuser"; // add new user form
        }

        else {
            userRepository.save(user);
            long id = user.getId();
            return "redirect:/form/practice/"+id; //add JSP for adding practices and practice controller
        }
    }


}
