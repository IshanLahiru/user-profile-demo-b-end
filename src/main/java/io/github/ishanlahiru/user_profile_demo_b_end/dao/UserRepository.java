package io.github.ishanlahiru.user_profile_demo_b_end.dao;

import io.github.ishanlahiru.user_profile_demo_b_end.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUName(String uName);
}
