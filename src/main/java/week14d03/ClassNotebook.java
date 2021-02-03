package week14d03;


import java.util.Set;
import java.util.TreeSet;

public class ClassNotebook {

   Set<Student> students = new TreeSet<>();

    public ClassNotebook(Set<Student> students) {
        this.students = students;
    }

    public TreeSet<Student> sortNotebook() {
        return (TreeSet<Student>) students;

    }

}
