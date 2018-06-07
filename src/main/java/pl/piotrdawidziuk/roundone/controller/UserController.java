package pl.piotrdawidziuk.roundone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.piotrdawidziuk.roundone.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

}
