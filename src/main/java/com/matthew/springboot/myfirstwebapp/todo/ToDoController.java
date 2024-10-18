package com.matthew.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ToDoController {

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    
    private ToDoService toDoService;

    @RequestMapping("/list-todos")
    public String listAllTodos(ModelMap model) {

        List<Todo> todos = toDoService.findByUsername("matthew");

        model.addAttribute("todos", todos);

        return "listTodos";
    }
}
