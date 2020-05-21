package todoApp.Todo;

import java.util.ArrayList;

public class Todo {
    private ArrayList<String> array = new ArrayList<>();


    public ArrayList<String> getTodo() {
        return this.array;
    }

    public void addTodo(String input) {
        this.array.add(input);
    }

    public String getTodo(int index) {
        if(index < this.array.size()) {
            return this.array.get(index);
        }
        return "not Available";
    }

    public void removeTodo(int index) {
        if(index < this.array.size()) {
            this.array.remove(index);
        }
    }

    public void setTodo(int index, String input) {
        if(index < this.array.size()) {
            this.array.set(index, input);
        }
    }

    public int getSize() {
        return this.array.size();
    }

    public void changeTodoPriority(int fromIndex, int toIndex) {
        if (fromIndex < this.array.size() && toIndex < this.array.size()) {
            String temp = this.array.get(toIndex);
            this.array.set(toIndex, this.array.get(fromIndex));
            this.array.set(fromIndex, temp);
        }
    }

    public void moveCompletedTodo(int index, Todo completedTodos) {
        if(index < this.array.size()) {
            completedTodos.addTodo(this.array.remove(index));
        }
    }
    
    public void getAllTodos() {
        if(this.array == null) {
            System.out.println("<Empty>");
        }
        if(this.array != null) {
            int count = 0;
                for(String todo: this.array){
                    System.out.println(count+ ": " + todo);
                    count += 1;
                }
        }
    }
}
