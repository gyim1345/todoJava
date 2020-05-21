package todoApp.Choice;

import todoApp.Todo.Todo;

import java.util.Scanner;

public class Choice {

    public static void Choices(int todoChoice, Todo newTodos, Todo completedTodos, int depthNumber) {
        Scanner scanner = new Scanner(System.in);
        if (depthNumber == 1) {
            if (todoChoice == 1) {
                System.out.print("\ninput what you want to add: ");
                String input = scanner.next();
                newTodos.addTodo(input);
                System.out.println("added \"" + input + "\" to todo list");
            }
            if (todoChoice == 2) {
                System.out.println("\nAll todo lists");
                   newTodos.getAllTodos();
            }
            if (todoChoice == 3) {
                System.out.print("\n완료할 todo의 번호 입력: ");
                int index = scanner.nextInt();
                newTodos.moveCompletedTodo(index, completedTodos);
            }
            if (todoChoice == 4) {
                System.out.print("\nDelete the number of todo list");
                int index = scanner.nextInt();
                newTodos.removeTodo(index);
            }
            if (todoChoice == 5) {
                System.out.print("\nnumber of what you want to change priority: ");
                int index = scanner.nextInt();
                System.out.print("\nnumber of where you want to set priority: ");
                int index2 = scanner.nextInt();
                newTodos.changeTodoPriority(index, index2);
            }
            if (todoChoice == 6) {
                System.out.print("\n number of what you want to change title: ");
                int index = scanner.nextInt();
                System.out.print("\n what you want to edit to: ");
                String input = scanner.next();
                newTodos.setTodo(index, input);
            }
        }
        if (depthNumber == 2) {

            if (todoChoice == 1) {
                System.out.println("\nAll Complete todo lists");
                completedTodos.getAllTodos();
            }

            if (todoChoice == 2) {
                System.out.print("\nDelete the number of Complete todo list");
                int index = scanner.nextInt();
                completedTodos.removeTodo(index);
            }
        }



    }
}
