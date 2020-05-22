package todoapp.domain;

import java.util.ArrayList;

public class Todos {
    private ArrayList<Todo> todos = new ArrayList<>();
    public ArrayList<Todo> getTodo() {
        return this.todos;
    }

    public void addTodo(String input) {
        this.todos.add(new Todo(input));
    }

    public void removeTodo(int index) {
        if(index < this.todos.size()) {
            this.todos.remove(index);
        }
    }

    public void setTodo(int index, String input) {
        if(index < this.todos.size()) {
            this.todos.get(index).changeTitle(input);
        }
    }

    public void changeTodoPriority(int fromIndex, int toIndex) {
        if (fromIndex < this.todos.size() && toIndex < this.todos.size()) {
            Todo temp = this.todos.get(toIndex);
            this.todos.set(toIndex, this.todos.get(fromIndex));
            this.todos.set(fromIndex, temp);

        }
    }

    public void moveCompletedTodo(int index, Todos completedTodos) {
        if(index < this.todos.size()) {
            completedTodos.add(this.todos.remove(index));
        }
    }

    private void add(Todo movedTodos) {
        todos.add(movedTodos);
    }

    public ArrayList<Todo> getAllTodos() {
        return this.todos;
    }
}
