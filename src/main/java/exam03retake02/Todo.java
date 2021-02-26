package exam03retake02;

import java.util.Comparator;

public class Todo implements Comparator<Todo>{

    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        if(priority  > 5 || priority < 1){
            throw new IllegalArgumentException("Invalid");
        }
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public void complete(){
        this.state = State.COMPLETED;
    }

    @Override
    public String toString() {
        return  text;
    }

    @Override
    public int compare(Todo o1, Todo o2) {
        return o1.getPriority() - o2.getPriority();
    }
}
