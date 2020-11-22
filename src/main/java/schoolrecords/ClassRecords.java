package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
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
        for (Student student1 : students) {
            if (student1.getName().equals(student.getName())) {
                return false;
            } else {
                students.add(student);
                return true;
            }
        }
    }

    public boolean removeStudent(Student student) {
        for (Student student1 : students) {
            if (student1.getName().equals(student.getName())) {
                students.remove(students);
            } else {
                return false;
            }
        }
    }


    public double calculateClassAverage() {
        double studentsSum = 0.0;
        int numberOfStudents = 0;
        for (Student student : students) {
            if (student.calculateAverage() > 0) {
               studentsSum += student.calculateAverage();
               numberOfStudents++;
            }
        }
        return Math.round((studentsSum / numberOfStudents) * 100) / 100.0;


    } //osztályátlagot számol, minden diákot figyelembe véve

    public double calculateClassAverageBySubject(Subject subject) {
        return 0;
    } //tantárgy szerinti osztályátlagot számol,
    // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye

    public Student findStudentByName(String name) {
        return 0;
    }// név szerint megkeres egy diákot az osztályban

    public Student repetition() {
        return 0;
    }//felelethez a listából random módon kiválaszt egy diákot

    public List<StudyResultByName> listStudyResults() {
        return 0;
    }//a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
    // és azok listáját adja vissza

    public String listStudentNames() {
        return 0;
    }//kilistázza a diákok neveit, vesszővel elválasztva





}
