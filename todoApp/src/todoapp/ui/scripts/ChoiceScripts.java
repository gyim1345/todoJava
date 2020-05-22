package todoapp.ui.scripts;

public class ChoiceScripts {

    public static void printBeforeAddScript() {
        System.out.print("\ninput what you want to add: ");
    }

    public static void printAfterAddScript(String input) {
        System.out.println("added \"" + input + "\" to todo list");
    }

    public static void printBeforeListAllTodosScript() {
        System.out.println("\nAll todo lists");
    }

    public static void printBeforeCompleteScript() {
        System.out.print("\nnumber of what you want to complete: ");
    }

    public static void printBeforeDeleteScript() {
        System.out.print("\nnumber of what you want to delete: ");
    }

    public static void printBeforeChangePriorityScript() {
        System.out.print("\nnumber of what you want to change priority: ");
    }

    public static void printAfterPriorityScript() {
        System.out.print("\nnumber of where you want to set priority: ");
    }

    public static void printTargetEditScript() {
        System.out.print("\n number of what you want to change title: ");
    }

    public static void printModifyToEditScript() {
        System.out.print("\n what you want to edit to: ");
    }


    public static void printBeforeListAllCompletedTodoScript() {
        System.out.println("\nAll Complete todo lists");
    }

    public static void printBeforeRemoveCompletedTodoScript() {
        System.out.print("\nDelete the number of Complete todo list: ");
    }
}
