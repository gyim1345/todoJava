package todoapp.domain;

import java.util.ArrayList;

import todoapp.ui.scripts.CommandScripts;
import todoapp.ui.scripts.TodoScripts;

public class Todos {
    private ArrayList<Todo> todos = new ArrayList<>();;
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
        if(index >= this.todos.size()) {
            CommandScripts.printErrorScript();
        }
    }

    public void setTodo(int index, String input) {
        if(index < this.todos.size()) {
            this.todos.set(index, new Todo(input));
        }
        if(index >= this.todos.size()) {
            CommandScripts.printErrorScript();
        }
    }

    public void changeTodoPriority(int fromIndex, int toIndex) {
        if (fromIndex < this.todos.size() && toIndex < this.todos.size()) {
            Todo temp = this.todos.get(toIndex);
            this.todos.set(toIndex, this.todos.get(fromIndex));
            this.todos.set(fromIndex, temp);
        }
        if (fromIndex >= this.todos.size() || toIndex >= this.todos.size()) {
            CommandScripts.printErrorScript();

        }
    }

    public void moveCompletedTodo(int index, Todos completedTodos) {
        if(index < this.todos.size()) {
            completedTodos.add(this.todos.remove(index));
        }
        if(index >= this.todos.size()) {
            CommandScripts.printErrorScript();
        }
    }

    private void add(Todo movedTodos) {
        todos.add(movedTodos);
    }

    public void getAllTodos() {
        if(this.todos.size() == 0) {
            TodoScripts.printEmpty();
        }
        if(this.todos != null) {
            TodoScripts.printAllTodo(this.todos);
        }
    }
}
