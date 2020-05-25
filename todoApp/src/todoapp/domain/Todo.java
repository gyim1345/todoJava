package todoapp.domain;

public class Todo {
   private String title;


    public Todo(String input) {
        this.title = input;
    }

    public void changeTitle(String input) {
        this.title = input;
    }


    public String getTitle() {
        return this.title;
    }

}
