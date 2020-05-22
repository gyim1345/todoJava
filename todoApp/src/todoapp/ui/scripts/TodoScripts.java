package todoapp.ui.scripts;

import todoapp.domain.Todo;

import java.util.ArrayList;

public class TodoScripts {


    public static void printTodo(int count, String todoTitle) {
            System.out.println(count+ ": " + todoTitle);
    }

    public static void printEmpty() {
        System.out.println("<Empty>");
    }
}
