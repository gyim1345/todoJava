package todoapp;

import todoapp.domain.Todo;
import todoapp.domain.Todos;
import todoapp.ui.CommandNumbers;
import todoapp.ui.Commands;
import todoapp.ui.InputView;
import todoapp.ui.Scripts;

public class TodoApplication implements CommandNumbers {
    public static void main(String[] args) {

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
//                    for (Commands cmd : Commands.values()) {
//                        if (cmd.getCommand() == todoChoice) {
//                            cmd.getScript(todoChoice);
//                        }
                    }
                    if (todoChoice == TODO_등록) {
                        Scripts.printBeforeAddScript(); // view 안에서 실행 script가 노출 도ㅚ면 안도됨 . gui 로 바뀌면 여기서 다 터짐
                        String userInput = InputView.inputWord();//
                        newTodos.addTodo(userInput);
                        Scripts.printAfterAddScript(userInput);//script를 짜라고 ㅗ하는게 아니라 todo add를 작업을 다 했다고만 알려주고 거기서 이것을 완료를 했으니깐 알맞은 처리를 거기서 작업을 하도록 하는게 좋다.
                    }
                    if (todoChoice == TODO_출력) {
                        Scripts.printBeforeListAllTodosScript();
                        int count = 0;
                        for(Todo todo: newTodos.getAllTodos()){
                            Scripts.printTodo(count, todo.getTitle());
                            count += 1;
                        }
                    }
                    if (todoChoice == TODO_완료) {
                        Scripts.printBeforeCompleteScript();
                        int commandNumber = InputView.inputChoice();
                        newTodos.moveCompletedTodo(commandNumber, completedTodos);

                    }
                    if (todoChoice == TODO_삭제) {
                        Scripts.printBeforeDeleteScript();
                        int commandNumber = InputView.inputChoice();
                        newTodos.removeTodo(commandNumber);
                    }
                    if (todoChoice == TODO_우선_순위_변경) {
                        Scripts.printBeforeChangePriorityScript();
                        int fromNumber = InputView.inputChoice();
                        Scripts.printAfterPriorityScript();
                        int toNumber = InputView.inputChoice();
                        newTodos.changeTodoPriority(fromNumber, toNumber);
                    }
                    if (todoChoice == TODO_제목_바꾸기) {
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

