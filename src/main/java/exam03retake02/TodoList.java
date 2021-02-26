package exam03retake02;

import java.util.*;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return new ArrayList<>(todos);
    }

    public void addTodo(Todo item) {
        todos.add(item);
    }

    public int getNumberOfItemsLeft(){
        int counter= 0;
        for(Todo item : todos){
            if(item.getState() == State.NON_COMPLETED){
                counter++;
            }
        }return counter;

    }

    public List<String> getMostImportantTodosText() {
        List<String> mostImportant = new ArrayList<>();
        todos.sort(Comparator.comparing(Todo::getPriority));
        int min = todos.get(0).getPriority();
        for (Todo t : todos) {
            if (t.getPriority() == min) {
                mostImportant .add(t.getText());
            }
        }
        return mostImportant;
    }





    public void deleteCompleted(){
        for (Iterator<Todo> iter = todos.iterator(); iter.hasNext();) {
            Todo todo = iter.next();
            if (todo.getState() == State.COMPLETED) {
                iter.remove();
            }
        }
    }
}
