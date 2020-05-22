package todoapp;

import todoapp.domain.Todos;
import todoapp.ui.Listener;
import todoapp.ui.Scripts;


public class Selector {

    public static void Choices(int todoChoice, Todos newTodos, Todos completedTodos, int depthNumber) {



        if (depthNumber == 1) {
            if (todoChoice == 1) {
                Scripts.printBeforeAddScript();
                String input = Listener.awaitStringInput();
                newTodos.addTodo(input);
                Scripts.printAfterAddScript(input);
            }
            if (todoChoice == 2) {
                Scripts.printBeforeListAllTodosScript();
                newTodos.getAllTodos();
            }
            if (todoChoice == 3) {
                Scripts.printBeforeCompleteScript();
                int index = Listener.awaitIntInput();
                newTodos.moveCompletedTodo(index, completedTodos);
            }
            if (todoChoice == 4) {
                Scripts.printBeforeDeleteScript();
                int index = Listener.awaitIntInput();
                newTodos.removeTodo(index);
            }
            if (todoChoice == 5) {
                Scripts.printBeforeChangePriorityScript();
                int index = Listener.awaitIntInput();
                Scripts.printAfterPriorityScript();
                int index2 = Listener.awaitIntInput();
                newTodos.changeTodoPriority(index, index2);
            }
            if (todoChoice == 6) {
                Scripts.printTargetEditScript();
                int index = Listener.awaitIntInput();
                Scripts.printModifyToEditScript();
                String input = Listener.awaitStringInput();
                newTodos.setTodo(index, input);
            }
        }
        if (depthNumber == 2) {

            if (todoChoice == 1) {
                Scripts.printBeforeListAllCompletedTodoScript();
                completedTodos.getAllTodos();
            }

            if (todoChoice == 2) {
                Scripts.printBeforeRemoveCompletedTodoScript();
                int index = Listener.awaitIntInput();
                completedTodos.removeTodo(index);
            }
        }

        if ((todoChoice > 6 && depthNumber == 1) || (todoChoice>2 && depthNumber ==2)){
            Scripts.printErrorScript();
        }

    }
}
