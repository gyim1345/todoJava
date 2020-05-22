package todoApp;

import todoApp.Choice.Choice;
import todoApp.Script.printScriptCommands;
import todoApp.Todo.Todo;

import java.util.Scanner;

public class todoAppClass {
    public static void main(String[] args) {

        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        Todo newTodos = new Todo();
        newTodos.addTodo("first todo");
        newTodos.addTodo("second todo");
        newTodos.addTodo("third todo");

        Todo completedTodos = new Todo();

        while(choice != 0){
            printScriptCommands.entryScript();
            choice = scanner.nextInt();

            if(choice == 1) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    printScriptCommands.todoScript();
                    todoChoice = scanner.nextInt();
                    Choice.Choices(todoChoice, newTodos, completedTodos, 1);
                }
            }

            if(choice == 2) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    printScriptCommands.completedTodoScript();
                    todoChoice = scanner.nextInt();
                    Choice.Choices(todoChoice, newTodos, completedTodos, 2);
                }
            }

            if(choice == 0) {
                printScriptCommands.exitScript();
            }
        }
    }
}

