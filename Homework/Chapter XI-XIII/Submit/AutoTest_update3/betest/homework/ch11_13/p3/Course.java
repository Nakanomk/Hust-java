package homework.ch11_13.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Course class.
 */
public class Course implements Cloneable {
    private String courseName;
    private List<Person> students;
    private Person teacher;

    public Course(String courseName, Person teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void register(Person s) {
        if (s == null) {
            return;
        }
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Person> getStudents() {
        return students;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void unregister(Person s) {
        students.remove(s);
    }

    public int getNumberOfStudent() {
        return students.size();
    }

    @Override
    public Object clone() {
        Person clonedTeacher = teacher == null ? null : (Person) teacher.clone();
        String clonedCourseName = courseName == null ? null : new String(courseName);
        Course copy = new Course(clonedCourseName, clonedTeacher);
        for (Person p : students) {
            copy.students.add((Person) p.clone());
        }
        return copy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{courseName='").append(courseName).append("', teacher=").append(teacher)
                .append(", students=[");
        for (int i = 0; i < students.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(students.get(i));
        }
        sb.append("]}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Course other = (Course) obj;
        if (!Objects.equals(courseName, other.courseName)) {
            return false;
        }
        if (!Objects.equals(teacher, other.teacher)) {
            return false;
        }
        return students.size() == other.students.size()
                && students.containsAll(other.students)
                && other.students.containsAll(students);
    }
}
