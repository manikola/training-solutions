package week14d03;

import java.util.*;

public class Student implements Comparable<Student>{

    private String studentName;
    private Map<Subject, List<Integer>> checkBook= new TreeMap<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public Map<Subject, List<Integer>> getCheckBook() {
        return checkBook;
    }

    public void addNote(Subject subject, int note){

        if(checkBook.containsKey(subject)){
            List<Integer> notes = checkBook.get(subject);
            notes.add(note);
            checkBook.put(subject,notes);
        }
        else{
            List<Integer> notes2 = new ArrayList<>();
            notes2.add(note);
            checkBook.put(subject,notes2);
        }
    }
    @Override
    public int compareTo(Student o) {
        return studentName.compareTo(o.studentName);
    }

    @Override
    public String toString() {
        return studentName + " " + checkBook;
    }

    }



