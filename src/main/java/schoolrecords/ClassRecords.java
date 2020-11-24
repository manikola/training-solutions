package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();



    public ClassRecords(String className, Random rnd) {
        if (isEmpty(className)) {
            throw new IllegalArgumentException("Class name must not be empty!");
        }
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        if (isEmpty(className)) {
            throw new NullPointerException("Classname shouldn't be empty");
        }
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }

    public boolean addStudent(Student student) {
        for (Student item: students) {
            if (item.getName().equals(student.getName())) {
                return false;
            }
        }
                students.add(student);
                return true;
            }



    public boolean removeStudent(Student student) {
        if (student == null) {
            throw new NullPointerException("Student most be provided!");
        }
        boolean found = false;
        for (Student item: students) {
            if (item.getName().toLowerCase().equals(student.getName().toLowerCase())) {
                found = true;
                students.remove(item);
            break;
            }
        }
        return found;
    }


    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double studentsSum = 0.0;
        int numberOfStudents = 0;
        for (Student student : students) {
            if (student.calculateAverage() > 0) {
               studentsSum += student.calculateAverage();
               numberOfStudents++;
            } else {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        }
        return Math.round((studentsSum / numberOfStudents) * 100) / 100.0;


    }
    //osztályátlagot számol, minden diákot figyelembe véve

    public double calculateClassAverageBySubject(Subject subject) {
        double subjectSum = 0.0;
        int numberOfStudents = 0;
        for (Student item : students) {
            if (item.calculateSubjectAverage(subject) > 0) {
                subjectSum+= item.calculateSubjectAverage(subject);
                numberOfStudents++;
            }
        }

        return Math.round((subjectSum / numberOfStudents) * 100) / 100.0;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        Student foundStudent = null;
        for (Student item : students) {
            if (name.toLowerCase().equals(item.getName().toLowerCase())) {
                foundStudent = item;
                break;
            }

        }
        if (foundStudent == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        } else {
            return foundStudent;
        }
    }


    public Student repetition() {
        if (students.size() ==0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No student in the list!");
        }
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student item : students) {
            studyResultByNames.add(new StudyResultByName(item.getName(), item.calculateAverage()));
        }
        return studyResultByNames;
    }

    public String listStudentNames() {
        String names = "";
        for (Student item : students) {
            names+= item.getName() + ", ";
        }
        return names.substring(0, names.length() - 2);
    }





}
