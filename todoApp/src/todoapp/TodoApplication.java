package todoapp;

import todoapp.domain.Todos;
import todoapp.ui.Scripts;
import todoapp.ui.Listener;


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
            choice = Listener.awaitIntInput();

            if(choice == 1) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Scripts.printTodoScript();
                    todoChoice = Listener.awaitIntInput();
                    Selector.Choices(todoChoice, newTodos, completedTodos, choice);
                }
            }

            if(choice == 2) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    Scripts.printCompletedTodoScript();
                    todoChoice = Listener.awaitIntInput();
                    Selector.Choices(todoChoice, newTodos, completedTodos, choice);
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

