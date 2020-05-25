package todoapp.domain;

import java.util.ArrayList;

public interface TodosInterface {

    void addTodo(String input);
    void removeTodo(int index);
    void setTodo(int index, String input);
    void changeTodoPriority(int fromIndex, int toIndex);
    void moveCompletedTodo(int index, Todos completedTodos);
    void add(Todo movedTodos);
    ArrayList<Todo> getAllTodos();
}

