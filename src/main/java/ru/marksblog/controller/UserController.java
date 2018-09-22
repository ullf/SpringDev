package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.marksblog.model.User;
import ru.marksblog.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/user")
    public String company(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping(path = "/adduser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.persist(user);
        return "redirect:/user";
    }

    @PostMapping(path = "/deleteuser")
    public String deleteUser(@ModelAttribute("user") User user, HttpServletRequest req, HttpSession session) {
        userService.deleteByUsername(user.getUsername());
        session = req.getSession();
        session.removeAttribute("username");
        session.removeAttribute("password");
        return "redirect:/user";
    }

    @PostMapping(path = "/logout")
    public String logout(HttpServletRequest req, HttpSession session) {
        session = req.getSession();
        session.removeAttribute("username");
        session.removeAttribute("password");
        return "redirect:/user";
    }

    @PostMapping(path = "/authuser")
    public String authUser(@ModelAttribute("user") User user, HttpServletRequest req, HttpSession session) {
        userService.auth(user.getUsername(), user.getUserpassword());
        if (!user.getUserpassword().equals(null) && !user.getUsername().equals(null)) {
            session = req.getSession();
            session.setAttribute("username", user.getUsername());
            session.setAttribute("password", user.getUserpassword());
            return "success";
        } else {
            return "user";
        }
    }
}
