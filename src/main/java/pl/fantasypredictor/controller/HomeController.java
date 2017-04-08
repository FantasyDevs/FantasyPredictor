package pl.fantasypredictor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.fantasypredictor.dto.UserDto;
import pl.fantasypredictor.service.UserService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "HOme page";
    }

    @RequestMapping("/users/{login}")
    @ResponseBody
    public UserDto getUserByLogin(@PathVariable String login) {
        return userService.getUserByLogin(login);
    }


    @RequestMapping("/users/")
    @ResponseBody
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/add")
    @ResponseBody
    public UserDto addUser(@RequestParam(value = "id") Long id, @RequestParam(value = "login") String login) {
        UserDto u = new UserDto();
        u.setId(id);
        u.setLogin(login);
        u.setPassword("pass");
        return userService.createUser(u);
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name + "lll");
        return "hello";
    }


    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String login() {
        return "login";
    }
}
