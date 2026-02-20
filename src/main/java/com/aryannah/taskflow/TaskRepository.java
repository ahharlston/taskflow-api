package com.aryannah.taskflow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //handles the database "save" and "find" logic
}
