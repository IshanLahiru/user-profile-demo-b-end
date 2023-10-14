package io.github.ishanlahiru.user_profile_demo_b_end.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "user_d")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String uName;
    @Column(name = "f_name")
    private String fName;
    @Column(name = "l_name")
    private String lName;
    @Column(name = "email")
    private String email;
    @Column(name = "contact")
    private String contact;
    @Column(name = "profilePicture")
    private String proPic;
}
