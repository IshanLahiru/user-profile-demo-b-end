package io.github.ishanlahiru.user_profile_demo_b_end.rest;

import io.github.ishanlahiru.user_profile_demo_b_end.entity.User;
import io.github.ishanlahiru.user_profile_demo_b_end.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{userName}")
    public User getUser(@PathVariable String userName){
        User theUser = userService.findByName(userName);
        return null;
    }

}
