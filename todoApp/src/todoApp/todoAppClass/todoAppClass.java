package todoApp.todoAppClass;

import todoApp.Choice.Choice;
import todoApp.Commands.Commands;
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
            Commands.printCommand(1,0);
            choice = scanner.nextInt();

            if(choice == 1) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Commands.printCommand(1,1);
                    todoChoice = scanner.nextInt();
                    Choice.Choices(todoChoice, newTodos, completedTodos, 1);
                }
            }

            if(choice == 2) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Commands.printCommand(1,2);
                    todoChoice = scanner.nextInt();
                    Choice.Choices(todoChoice, newTodos, completedTodos, 2);
                }
            }

            if(choice == 0) {
                System.out.println("\nBye Bye");
            }
        }
    }
}

