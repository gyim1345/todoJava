package todoapp;

import todoapp.domain.Todos;
import todoapp.ui.scripts.CommandScripts;
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
            CommandScripts.printEntryScript();
            choice = Listener.awaitIntInput();

            if(choice == 1) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    CommandScripts.printTodoScript();
                    todoChoice = Listener.awaitIntInput();
                    Selector.Choices(todoChoice, newTodos, completedTodos, choice);
                }
            }

            if(choice == 2) {
                int todoChoice = -1;
                while (todoChoice != 0) {
                    CommandScripts.printCompletedTodoScript();
                    todoChoice = Listener.awaitIntInput();
                    Selector.Choices(todoChoice, newTodos, completedTodos, choice);
                }
            }

            if(choice == 0) {
                CommandScripts.printExitScript();
            }

            if(choice > 2){
                CommandScripts.printErrorScript();
            }

        }
    }
}

