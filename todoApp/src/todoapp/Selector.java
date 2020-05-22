package todoapp;

import todoapp.domain.Todos;
import todoapp.ui.InputView;
import todoapp.ui.Scripts;


public class Selector {

    public static void Choices(int todoChoice, Todos newTodos, Todos completedTodos, int depthNumber) {



        if (depthNumber == 1) {
            if (todoChoice == 1) {
                Scripts.printBeforeAddScript();
                String input = InputView.inputWord();
                newTodos.addTodo(input);
                Scripts.printAfterAddScript(input);
            }
            if (todoChoice == 2) {
                Scripts.printBeforeListAllTodosScript();
                newTodos.getAllTodos();
            }
            if (todoChoice == 3) {
                Scripts.printBeforeCompleteScript();
                int index = InputView.inputChoice();
                newTodos.moveCompletedTodo(index, completedTodos);
            }
            if (todoChoice == 4) {
                Scripts.printBeforeDeleteScript();
                int index = InputView.inputChoice();
                newTodos.removeTodo(index);
            }
            if (todoChoice == 5) {
                Scripts.printBeforeChangePriorityScript();
                int index = InputView.inputChoice();
                Scripts.printAfterPriorityScript();
                int index2 = InputView.inputChoice();
                newTodos.changeTodoPriority(index, index2);
            }
            if (todoChoice == 6) {
                Scripts.printTargetEditScript();
                int index = InputView.inputChoice();
                Scripts.printModifyToEditScript();
                String input = InputView.inputWord();
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
                int index = InputView.inputChoice();
                completedTodos.removeTodo(index);
            }
        }

        if ((todoChoice > 6 && depthNumber == 1) || (todoChoice>2 && depthNumber ==2)){
            Scripts.printErrorScript();
        }

    }
}
