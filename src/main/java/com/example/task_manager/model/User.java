package com.example.task_manager.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) //cascade = CascadeType.ALL This means that if we delete the user, the tasks associated with him will be automatically deleted.
    private List<Task> tasks;
}
