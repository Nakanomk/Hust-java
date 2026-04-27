package homework.ch11_13.p3;

import java.util.Objects;

/**
 * Student class.
 */
public class Student extends Person {
    private int studentId;
    private String department;
    private String classNo;

    public Student() {
    }

    public Student(String name, int age, int studentId, String department, String classNo) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
        this.classNo = classNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId=" + studentId +
                ", department='" + department + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Student other = (Student) obj;
        return studentId == other.studentId
                && Objects.equals(department, other.department)
                && Objects.equals(classNo, other.classNo);
    }

    @Override
    public Object clone() {
        String clonedName = getName() == null ? null : new String(getName());
        String clonedDepartment = department == null ? null : new String(department);
        String clonedClassNo = classNo == null ? null : new String(classNo);
        return new Student(clonedName, getAge(), studentId, clonedDepartment, clonedClassNo);
    }
}
