package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(ModelMap model) {return "My Users";}

//    private UserService userService;
//
//    public UserController(UserService carsService) {
//        this.userService = carsService;
//    }
//
//    @GetMapping("/users")
//    public String createTableUsers(@RequestParam(value = "count", required = false) Optional<Integer> count,
//                                  Model model) {
//        model.addAttribute("users", userService.getUsers(count.orElse(0)));
//        return "/users";
//    }
}
