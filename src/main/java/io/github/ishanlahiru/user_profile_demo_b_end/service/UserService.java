package io.github.ishanlahiru.user_profile_demo_b_end.service;


import io.github.ishanlahiru.user_profile_demo_b_end.entity.User;

public interface UserService {
    User findByName(String name);
    User save(User theUser);
}
