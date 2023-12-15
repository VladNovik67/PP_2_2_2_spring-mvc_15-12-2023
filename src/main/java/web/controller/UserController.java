package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    //    private List<User> userList;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping()
    public String showAll(ModelMap model) {
        model.addAttribute("userss", userService.getAllUsers());
        return "users/showAll";
    }

    @GetMapping("/")
    public String show(@RequestParam(value = "id", required = false) int id, Model model) {
        model.addAttribute("getUserId", userService.getUser(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "users/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user, Model model) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.getUser(id));
        return "users/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.updateUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.deleteUser(userService.getUser(id));
        return "redirect:/users";
    }

//    -------------------------------------------
//    @PostMapping("/")
//    public String processAddStudentForm(User student, @RequestParam("file") MultipartFile file, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "index";
//        }
//    }
//-----------------------------


    @GetMapping(value = "/get")
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    @ResponseBody
    public String getUser(ModelMap model) {
        model.addAttribute("student", new User());
        return "addUserGet";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        User studentResponse = (User) userService.saveUser(user);
        return studentResponse;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        User studentResponse = (User) userService.updateUser(user);
        return studentResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public User deleteUser(@RequestBody User user) {
        User studentResponse = (User) userService.deleteUser(user);
        return studentResponse;
    }


//    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public User getUser(@PathVariable int id) {
//
//        User studentResponse = (User) userService.getUser(id);
//        return studentResponse;
//    }

}
