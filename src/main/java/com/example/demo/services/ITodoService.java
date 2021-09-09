package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Todo;

public interface ITodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
