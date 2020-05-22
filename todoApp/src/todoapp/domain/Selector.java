package todoapp.domain;

import todoapp.ui.Listener;
import todoapp.ui.scripts.ChoiceScripts;
import todoapp.ui.scripts.CommandScripts;


public class Selector {

    public static void Choices(int todoChoice, Todos newTodos, Todos completedTodos, int depthNumber) {


        if (depthNumber == 1) {
            if (todoChoice == 1) {
                ChoiceScripts.printBeforeAddScript();
                String input = Listener.awaitStringInput();
                newTodos.addTodo(input);
                ChoiceScripts.printAfterAddScript(input);
            }
            if (todoChoice == 2) {
                ChoiceScripts.printBeforeListAllTodosScript();
                newTodos.getAllTodos();
            }
            if (todoChoice == 3) {
                ChoiceScripts.printBeforeCompleteScript();
                int index = Listener.awaitIntInput();
                newTodos.moveCompletedTodo(index, completedTodos);
            }
            if (todoChoice == 4) {
                ChoiceScripts.printBeforeDeleteScript();
                int index = Listener.awaitIntInput();
                newTodos.removeTodo(index);
            }
            if (todoChoice == 5) {
                ChoiceScripts.printBeforeChangePriorityScript();
                int index = Listener.awaitIntInput();
                ChoiceScripts.printAfterPriorityScript();
                int index2 = Listener.awaitIntInput();
                newTodos.changeTodoPriority(index, index2);
            }
            if (todoChoice == 6) {
                ChoiceScripts.printTargetEditScript();
                int index = Listener.awaitIntInput();
                ChoiceScripts.printModifyToEditScript();
                String input = Listener.awaitStringInput();
                newTodos.setTodo(index, input);
            }
        }
        if (depthNumber == 2) {

            if (todoChoice == 1) {
                ChoiceScripts.printBeforeListAllCompletedTodoScript();
                completedTodos.getAllTodos();
            }

            if (todoChoice == 2) {
                ChoiceScripts.printBeforeRemoveCompletedTodoScript();
                int index = Listener.awaitIntInput();
                completedTodos.removeTodo(index);
            }
        }

        if ((todoChoice > 6 && depthNumber == 1) || (todoChoice>2 && depthNumber ==2)){
            CommandScripts.printErrorScript();
        }

    }
}
