package com.matthew.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "matthew", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "matthew", "Learn Spring", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "matthew", "Learn to Dance", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
    
}
