package todoapp;

import todoapp.domain.Todo;
import todoapp.domain.Todos;
import todoapp.ui.InputView;
import todoapp.ui.Scripts;


public class TodoApplication {
    public static void main(String[] args) {

        final int 임의의_초기값 = -1;
        final int 등록 = 1;
        final int 출력 = 2;
        final int 완료 = 3;
        final int 삭제 = 4;
        final int 우선_순위_변경 = 5;
        final int 제목_바꾸기 = 6;
        final int 되돌아가기 = 0;
        final int APP_중지 = 0;
        final int COMPLETE_TODO_출력 =1;
        final int COMPLETE_TODO_삭제 =2;
        final int TODO_조작 = 1;
        final int COMPLETED_TODO_조작 = 2;
        final int TODO_명령어_갯수 = 6;
        final int COMPLETE_TODO_명령어_갯수 = 2;
        final int ENTRY_명령어_갯수 = 2;

        int choice = 임의의_초기값;

        Todos newTodos = new Todos();
        newTodos.addTodo("first todo");
        newTodos.addTodo("second todo");
        newTodos.addTodo("third todo");

        Todos completedTodos = new Todos();

        while(choice != APP_중지){
            Scripts.printEntryScript();
            choice = InputView.inputChoice();

            if(choice == TODO_조작) {
                int todoChoice = 임의의_초기값;
                while (todoChoice != 되돌아가기) {
                    Scripts.printTodoScript();
                    todoChoice = InputView.inputChoice();
                    if (todoChoice == 등록) {
                        Scripts.printBeforeAddScript();
                        String userInput = InputView.inputWord();
                        newTodos.addTodo(userInput);
                        Scripts.printAfterAddScript(userInput);
                    }
                    if (todoChoice == 출력) {
                        Scripts.printBeforeListAllTodosScript();
                        int count = 0;
                        for(Todo todo: newTodos.getAllTodos()){
                            Scripts.printTodo(count, todo.getTitle());
                            count += 1;
                        }
                    }
                    if (todoChoice == 완료) {
                        Scripts.printBeforeCompleteScript();
                        int commandNumber = InputView.inputChoice();
                        newTodos.moveCompletedTodo(commandNumber, completedTodos);

                    }
                    if (todoChoice == 삭제) {
                        Scripts.printBeforeDeleteScript();
                        int commandNumber = InputView.inputChoice();
                        newTodos.removeTodo(commandNumber);
                    }
                    if (todoChoice == 우선_순위_변경) {
                        Scripts.printBeforeChangePriorityScript();
                        int fromNumber = InputView.inputChoice();
                        Scripts.printAfterPriorityScript();
                        int toNumber = InputView.inputChoice();
                        newTodos.changeTodoPriority(fromNumber, toNumber);
                    }
                    if (todoChoice == 제목_바꾸기) {
                        Scripts.printTargetEditScript();
                        int commandNumber = InputView.inputChoice();
                        Scripts.printModifyToEditScript();
                        String newTitle = InputView.inputWord();
                        newTodos.setTodo(commandNumber, newTitle);
                    }
                    if ((todoChoice > TODO_명령어_갯수) ){
                        Scripts.printErrorScript();
                    }
                }
            }

            if(choice == COMPLETED_TODO_조작) {
                int todoChoice = 임의의_초기값;
                while (todoChoice != 되돌아가기) {
                    Scripts.printCompletedTodoScript();
                    todoChoice = InputView.inputChoice();

                    if (todoChoice == COMPLETE_TODO_출력) {
                        Scripts.printBeforeListAllCompletedTodoScript();
                        int count = 0;
                        for(Todo todo: completedTodos.getAllTodos()){
                            Scripts.printTodo(count, todo.getTitle());
                            count += 1;
                        }
                    }

                    if (todoChoice == COMPLETE_TODO_삭제) {
                        Scripts.printBeforeRemoveCompletedTodoScript();
                        int commandNumber = InputView.inputChoice();
                        completedTodos.removeTodo(commandNumber);
                    }

                    if (todoChoice > COMPLETE_TODO_명령어_갯수){
                        Scripts.printErrorScript();
                    }
                }
            }

            if(choice == APP_중지) {
                Scripts.printExitScript();
            }

            if(choice > ENTRY_명령어_갯수){
                Scripts.printErrorScript();
            }

        }
    }
}

