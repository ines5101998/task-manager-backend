package com.example.task_manager.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
