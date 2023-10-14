package io.github.ishanlahiru.user_profile_demo_b_end.service;

import io.github.ishanlahiru.user_profile_demo_b_end.dao.UserRepository;
import io.github.ishanlahiru.user_profile_demo_b_end.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String name) {
        Optional<User> result = Optional.ofNullable(userRepository.findByUName(name));
        User theUser = null;
        if(result.isPresent()){
            theUser = result.get();
        }else {
            throw new RuntimeException("Didn't find the user");
        }
        return theUser;

    }

    @Override
    public User save(User theUser) {
        return userRepository.save(theUser);
    }
}
