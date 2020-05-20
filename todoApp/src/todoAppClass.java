import java.util.ArrayList;
import java.util.Scanner;

public class todoAppClass {
    public static void main(String[] args) {

        int choice = 0;
        Scanner in = new Scanner(System.in);

//        System.out.println("1. todo 등록");
//        System.out.println("2. todo 출력");
//        System.out.println("3. todo 종");
        ArrayList<String> todos = new ArrayList<>();
        todos.add("first todo");
        todos.add("second todo");
        todos.add("third todo");
        ArrayList<String> completedTodos = new ArrayList<>();


        while(choice != 3){
            System.out.println("\n----------------------");
            System.out.println("1. todo 등록");
            System.out.println("2. todo 출력");
            System.out.println("3. todo 종지");
            System.out.println("4. todo 완료");
            System.out.println("5. completedTodo 출력");
            System.out.println("6. todo 삭제");
            System.out.println("7. completedTodo 삭제");
            System.out.println("8. todo 우선 순위 바꾸기");
            System.out.println("9. todo 제목 바꾸기");

            System.out.println("----------------------\n");

            System.out.print("\n Input command number: ");
            choice = in.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.print("\ninput what you want to add: ");
                    String input = in.next();
                    todos.add(input);
                    System.out.println("added \""+ input + "\" to todo list");
                    break;
                case 2:
                    System.out.println("\nAll todo lists");
                    for(int i =0; i<todos.size(); i++){
                        System.out.println(i + ": " + todos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\nBye Bye");
                    break;
                case 4:
                    System.out.print("\n완료할 todo의 번호 입력: ");
                    int index = in.nextInt();
                    completedTodos.add(todos.remove(index));
                    break;
                case 5:
                    System.out.print("\nAll Complete todo lists");
                    for(int i =0; i<completedTodos.size(); i++){
                        System.out.println(i + ": " + todos.get(i));
                    }
                    break;
                case 6:
                    System.out.print("\nDelete the number of todo list");
                    index = in.nextInt();
                    todos.remove(index);
                    break;
                case 7:
                    System.out.print("\nDelete the number of Complete todo list");
                    index = in.nextInt();
                    completedTodos.remove(index);
                    break;
                case 8:
                    System.out.print("\nnumber of what you want to change priority: ");
                    index = in.nextInt();
                    System.out.print("\nnumber of where you want to set priority: ");
                    int index2 = in.nextInt();
                    String temp = todos.get(index2);
                    todos.set(index2, todos.get(index));
                    todos.set(index, temp);
                    break;
                case 9:
                    System.out.print("\n number of what you want to change title: ");
                    index = in.nextInt();
                    System.out.print("\n what you want to edit to: ");
                    input = in.next();
                    todos.set(index, input);
                    break;
                default:
                    System.out.print("\n 장난하냐 다시해라\n");

            }

        }
    }
}
