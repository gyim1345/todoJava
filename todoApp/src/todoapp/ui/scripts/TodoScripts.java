package todoapp.ui.scripts;

import todoapp.domain.Todo;

import java.util.ArrayList;

public class TodoScripts {


    public static void printAllTodo(ArrayList<Todo> todos) {
        int count = 0;
        for(Todo todo: todos){
            System.out.println(count+ ": " + todo.getTitle());
            count += 1;
        }
    }

    public static void printEmpty() {
        System.out.println("<Empty>");
    }
}
