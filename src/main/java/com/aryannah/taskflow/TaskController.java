package com.aryannah.taskflow;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks") //sets the url to 8081
public class TaskController {

    private final TaskRepository repository;

    //links controller to repository
    public TaskController(TaskRepository repository)
    {
        this.repository = repository;
    }

    //handles GET requests (viewing data)
    @GetMapping
    public List<Task> getAllTasks()
    {
        return repository.findAll();
    }

    //handles POST requests (adding data)
    @PostMapping
    public Task createTask(@RequestBody Task task)
    {
        return repository.save(task);
    }


}
