package todoApp.Script;

public class printScriptCommands {
    private int depthOne;
    private int depthTwo;

    public static void printCommand(int depthOne, int depthTwo) {
        if (depthOne == 1 && depthTwo == 0) {
            System.out.println("\n----------------------");
            System.out.println("1. todo 조작");
            System.out.println("2. Completed todo 조작");
            System.out.println("0. App 종지");
            System.out.println("----------------------\n");
            System.out.print("\n Input command number: ");
        }

        if (depthOne == 1 && depthTwo == 1) {
            System.out.println("\n----------------------");
            System.out.println("1. todo 등록");
            System.out.println("2. todo 출력");
            System.out.println("3. todo 완료");
            System.out.println("4. todo 삭제");
            System.out.println("5. todo 우선 순위 바꾸기");
            System.out.println("6. todo 제목 바꾸기");
            System.out.println("0. 되돌아가기");
            System.out.println("----------------------\n");
            System.out.print("\n Input command number: ");
        }

        if (depthOne == 1 && depthTwo == 2) {
            System.out.println("\n----------------------");
            System.out.println("1. completedTodo 출력");
            System.out.println("2. completedTodo 삭제");
            System.out.println("0. 되돌아가기");
            System.out.println("----------------------\n");
            System.out.print("\n Input command number: ");
        }

    }


    public static void entryScript() {
        System.out.println("\n----------------------");
        System.out.println("1. todo 조작");
        System.out.println("2. Completed todo 조작");
        System.out.println("0. App 종지");
        System.out.println("----------------------\n");
        System.out.print("\n Input command number: ");
    }

    public static void todoScript() {
        System.out.println("\n----------------------");
        System.out.println("1. todo 등록");
        System.out.println("2. todo 출력");
        System.out.println("3. todo 완료");
        System.out.println("4. todo 삭제");
        System.out.println("5. todo 우선 순위 바꾸기");
        System.out.println("6. todo 제목 바꾸기");
        System.out.println("0. 되돌아가기");
        System.out.println("----------------------\n");
        System.out.print("\n Input command number: ");
    }

    public static void completedTodoScript() {
        System.out.println("\n----------------------");
        System.out.println("1. completedTodo 출력");
        System.out.println("2. completedTodo 삭제");
        System.out.println("0. 되돌아가기");
        System.out.println("----------------------\n");
        System.out.print("\n Input command number: ");
    }

    public static void exitScript() {
        System.out.println("\nBye Bye");
    }





}
