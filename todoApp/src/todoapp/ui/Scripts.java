package todoapp.ui;

import todoapp.domain.Todos;

public class Scripts {

    public static void printBeforeAddScript() {
        System.out.print("input what you want to add: ");
    }

    public static void printAfterAddScript() {
        System.out.println("added to todo list");
    }

    public static void printBeforeListAllTodosScript() {
        System.out.println("All todo lists");
    }

    public static void printBeforeCompleteScript() {
        System.out.print("number of what you want to complete: ");
    }

    public static void printBeforeDeleteScript() {
        System.out.print("number of what you want to delete: ");
    }

    public static void printBeforeChangePriorityScript() {
        System.out.print("number of what you want to change priority: ");
    }

    public static void printAfterPriorityScript() {
        System.out.print("number of where you want to set priority: ");
    }

    public static void printTargetEditScript() {
        System.out.print("number of what you want to change title: ");
    }

    public static void printModifyToEditScript() {
        System.out.print("what you want to edit to: ");
    }


    public static void printBeforeListAllCompletedTodoScript() {
        System.out.println("All Complete todo lists");
    }

    public static void printBeforeRemoveCompletedTodoScript() {
        System.out.print("Delete the number of Complete todo list: ");
    }

    public static void printEntryScript() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("1. todo 조작");
        System.out.println("2. Completed todo 조작");
        System.out.println("0. App 종지");
        System.out.println("----------------------");
        System.out.println();
        System.out.print("Input command number: ");
    }

    public static void printTodoScript() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("1. todo 등록");
        System.out.println("2. todo 출력");
        System.out.println("3. todo 완료");
        System.out.println("4. todo 삭제");
        System.out.println("5. todo 우선 순위 바꾸기");
        System.out.println("6. todo 제목 바꾸기");
        System.out.println("0. 되돌아가기");
        System.out.println("----------------------");
        System.out.println();
        System.out.print(" Input command number: ");
    }

    public static void printCompletedTodoScript() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("1. completedTodo 출력");
        System.out.println("2. completedTodo 삭제");
        System.out.println("0. 되돌아가기");
        System.out.println("----------------------");
        System.out.println();
        System.out.print("Input command number: ");
    }

    public static void printExitScript() {
        System.out.println("Bye Bye");
    }

    public static void printErrorScript() {
        System.out.println("WRONG INPUT TRY AGAIN");
    }

    public static void printTodo(int count, String todoTitle) {
        System.out.println(count+ ": " + todoTitle);
    }


}
