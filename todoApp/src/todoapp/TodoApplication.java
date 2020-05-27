package todoapp;

import todoapp.domain.Todo;
import todoapp.domain.Todos;
import todoapp.ui.*;

public class TodoApplication implements CommandNumbers {
    public static void main(String[] args) {

        int choice = 임의의_초기값;
        Todos newTodos = new Todos();
        newTodos.addTodo("first todo");
        newTodos.addTodo("second todo");
        newTodos.addTodo("third todo");

        Todos completedTodos = new Todos();

        while (choice != APP_중지) {
            UIServices.view("App 시작");

            choice = InputView.inputChoice();

            if (choice == APP_중지) {
                UIServices.view("App 중지");
            }

            if (choice > ENTRY_명령어_갯수) {
                UIServices.view("에러");
            }

//            if (choice == TODO_조작) {
                int todoChoice = 임의의_초기값;
                while (todoChoice != 되돌아가기 && choice == TODO_조작) {
                    UIServices.view("Todo 시작");
                    todoChoice = InputView.inputChoice();
//                    for (Commands cmd : Commands.values()) {
//                        if (cmd.getCommand() == todoChoice) {
//                            cmd.getScript(todoChoice);
//                        }
//                    }
                    if (todoChoice == TODO_등록) {
//                        view 안에서 실행 script가 노출 도ㅚ면 안도됨 . gui 로 바뀌면 여기서 다 터짐
//                        script를 짜라고 ㅗ하는게 아니라 todo add를 작업을 다 했다고만 알려주고 거기서 이것을 완료를 했으니깐 알맞은 처리를 거기서 작업을 하도록 하는게 좋다.
                        UIServices.view("Todo 등록 시작");
                        String userInput = InputView.inputWord();//
                        newTodos.addTodo(userInput);
                        UIServices.view("Todo 등록 종료");
                    }
                    if (todoChoice == TODO_출력) {
                        UIServices.view("Todo 출력 시작");
                        int count = 0;
                        for (Todo todo : newTodos.getAllTodos()) {
//                            UIServices.view("Todo 출력");
                            Scripts.printTodo(count, todo.getTitle());
                            count += 1;
                        }
                    }
                    if (todoChoice == TODO_완료) {
                        UIServices.view("Todo 완료 하기 시작");
                        Scripts.printBeforeCompleteScript();
                        int commandNumber = InputView.inputChoice();
                        newTodos.moveCompletedTodo(commandNumber, completedTodos);

                    }
                    if (todoChoice == TODO_삭제) {
                        UIServices.view("Todo 삭제 하기 시작");
                        int commandNumber = InputView.inputChoice();
                        newTodos.removeTodo(commandNumber);
                    }
                    if (todoChoice == TODO_우선_순위_변경) {
                        UIServices.view("Todo 우선 순위 변경 시작");
                        int fromNumber = InputView.inputChoice();
                        UIServices.view("Todo 우선 순위 두번째 입력값 받기 시작");
                        int toNumber = InputView.inputChoice();
                        newTodos.changeTodoPriority(fromNumber, toNumber);
                    }
                    if (todoChoice == TODO_제목_바꾸기) {
                        UIServices.view("Todo 제목 바꾸기 시작");
                        int commandNumber = InputView.inputChoice();
                        UIServices.view("Todo 제목 바꾸기 두번째 입력값 받기");
                        String newTitle = InputView.inputWord();
                        newTodos.setTodo(commandNumber, newTitle);
                    }
                    if ((todoChoice > TODO_명령어_갯수)) {
                        Scripts.printErrorScript();
                    }
                }
//            }

//            if (choice == COMPLETED_TODO_조작) {
                while (todoChoice != 되돌아가기 && choice == COMPLETED_TODO_조작) {
                    UIServices.view("Completed Todo 시작");
                    todoChoice = InputView.inputChoice();

                    if (todoChoice == COMPLETE_TODO_출력) {
                        UIServices.view("Completed todo 출력");
                        int count = 0;
                        for (Todo todo : completedTodos.getAllTodos()) {
                            Scripts.printTodo(count, todo.getTitle());
                            count += 1;
                        }
                    }

                    if (todoChoice == COMPLETE_TODO_삭제) {
                        UIServices.view("Complete Todo 삭제 시작");
                        int commandNumber = InputView.inputChoice();
                        completedTodos.removeTodo(commandNumber);
                    }

                    if (todoChoice > COMPLETE_TODO_명령어_갯수) {
                        UIServices.view("에러");
                    }
//                }
            }
        }
    }
}



