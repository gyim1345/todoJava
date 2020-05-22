package todoapp;

import todoapp.domain.Todos;
import todoapp.ui.InputView;
import todoapp.ui.Scripts;


public class TodoApplication {
    public static void main(String[] args) {

        int choice = -1;

        Todos newTodos = new Todos();
        newTodos.addTodo("first todo");
        newTodos.addTodo("second todo");
        newTodos.addTodo("third todo");

        Todos completedTodos = new Todos();

        while(choice != 0){
            Scripts.printEntryScript();
            choice = InputView.inputChoice();

            if(choice == 1) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Scripts.printTodoScript();
                    todoChoice = InputView.inputChoice();
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
                    if ((todoChoice > 6) ){
                        Scripts.printErrorScript();
                    }
                }
            }

            if(choice == 2) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Scripts.printCompletedTodoScript();
                    todoChoice = InputView.inputChoice();

                    if (todoChoice == 1) {
                        Scripts.printBeforeListAllCompletedTodoScript();
                        completedTodos.getAllTodos();
                    }

                    if (todoChoice == 2) {
                        Scripts.printBeforeRemoveCompletedTodoScript();
                        int index = InputView.inputChoice();
                        completedTodos.removeTodo(index);
                    }

                    if (todoChoice > 2){
                        Scripts.printErrorScript();
                    }
                }
            }

            if(choice == 0) {
                Scripts.printExitScript();
            }

            if(choice > 2){
                Scripts.printErrorScript();
            }

        }
    }
}

