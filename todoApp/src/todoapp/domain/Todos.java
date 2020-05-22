package todoapp.domain;

import todoapp.ui.Scripts;

import java.util.ArrayList;

public class Todos {
    private ArrayList<Todo> todos = new ArrayList<>();
    public ArrayList<Todo> getTodo() {
        return this.todos;
    }
    final static boolean SUCCESS = true;
    final static boolean FAILED = true;

    public void addTodo(String input) {
        this.todos.add(new Todo(input));
    }


    public boolean removeTodo(int index) {
        if(index < this.todos.size()) {
            this.todos.remove(index);
            return SUCCESS;
        }
        return FAILED;
    }

    public boolean setTodo(int index, String input) {
        if(index < this.todos.size()) {
            this.todos.get(index).changeTitle(input);
            return SUCCESS;

        }
        return FAILED;

    }

    public boolean changeTodoPriority(int fromIndex, int toIndex) {
        if (fromIndex < this.todos.size() && toIndex < this.todos.size()) {
            Todo temp = this.todos.get(toIndex);
            this.todos.set(toIndex, this.todos.get(fromIndex));
            this.todos.set(fromIndex, temp);
            return SUCCESS;

        }
        return FAILED;
    }

    public boolean moveCompletedTodo(int index, Todos completedTodos) {
        if(index < this.todos.size()) {
            completedTodos.add(this.todos.remove(index));
            return SUCCESS;
        }
        return FAILED;
    }

    private void add(Todo movedTodos) {
        todos.add(movedTodos);
    }

    public void getAllTodos() {
        if(this.todos.size() == 0) {
            Scripts.printEmpty();
        }
        if(this.todos != null) {

            int count = 0;
            for(Todo todo: this.todos){
                Scripts.printTodo(count, todo.getTitle());
                count += 1;
            }
        }
    }
}
