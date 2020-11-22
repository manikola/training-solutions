package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (isEmpty(name)) {
            throw new NullPointerException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        double sumAverage = 0.0;
        for ( Mark mark : marks) {
            sumAverage += mark.getMarkType().getValue();
        }
       // return Double.parseDouble (String.format(Locale.US,"%.2f", sumAverage / marks.size()));
       return Math.round(sumAverage / marks.size() * 100) / 100.0;


    }

    public double calculateSubjectAverage(Subject subject) {
        double sumSubjectAverage = 0.0;
        int numberOfMarks = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sumSubjectAverage += mark.getMarkType().getValue();
                numberOfMarks++;
            }
        }
        return Math.round((sumSubjectAverage / numberOfMarks) * 100 / 100.0);


    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);

    }

    @Override
    public String toString() {
        String studentNotes = getName();
        for (int i = 0; i < marks.size(); i++) {
            studentNotes += " marks: " + marks.get(i).getSubject().getSubjectName() + ": "
                    + marks.get(i).getMarkType().getDescrpition() + " ( " + marks.get(i).getMarkType().getValue() + ")";

        }
        return studentNotes;
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }
}
