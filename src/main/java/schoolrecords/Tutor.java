package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }
    public boolean tutorTeachingSubject(Subject subject) {
        boolean teaching = false;
        for (Subject sub : taughtSubjects) {
            if (sub.getSubjectName().equals(subject.getSubjectName())) {
                teaching = true;
                break;
            }
        }
        return teaching;
    }

}
