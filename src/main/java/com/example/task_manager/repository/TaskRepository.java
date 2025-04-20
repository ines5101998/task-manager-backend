package com.example.task_manager.repository;

import com.example.task_manager.model.Task;
import com.example.task_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
