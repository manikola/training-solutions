package week14d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {


    Student student1 = new Student("Zsófi");
    Student student2 = new Student("Ákos");
    Student student3 = new Student("Anna");
    Student student4 = new Student("Irma");

    @BeforeEach
    public void setUp() {
        student1.addNote(Subject.MATEK, 5);
        student1.addNote(Subject.OLVASÁS, 5);
        student1.addNote(Subject.NYELVTAN, 5);
        student1.addNote(Subject.NYELVTAN, 2);

        student2.addNote(Subject.NYELVTAN, 5);
        student2.addNote(Subject.MATEK, 5);
        student2.addNote(Subject.MATEK, 4);
        student2.addNote(Subject.MATEK, 3);

        student3.addNote(Subject.MATEK, 2);
        student3.addNote(Subject.OLVASÁS, 3);
        student3.addNote(Subject.MATEK, 3);
        student3.addNote(Subject.MATEK, 2);

        student4.addNote(Subject.MATEK, 2);
        student4.addNote(Subject.OLVASÁS, 3);
        student4.addNote(Subject.MATEK, 3);
        student4.addNote(Subject.MATEK, 2);
    }

    @Test
    public void addNoteTest() {
        student1.addNote(Subject.MATEK, 1);
        student2.addNote(Subject.MATEK, 1);
        assertEquals("[5, 1]" ,(student1.getCheckBook().get(Subject.MATEK)).toString());
        assertEquals("[5, 4, 3, 1]" ,(student2.getCheckBook().get(Subject.MATEK)).toString());
    }

    @Test
    public void sortNotebookTest(){
        ClassNotebook cn = new ClassNotebook(new TreeSet<>(Arrays.asList(student1,student2,student3)));

        assertEquals("Anna {MATEK=[2, 3, 2], OLVASÁS=[3]}",cn.sortNotebook().first().toString());

        }

    }

