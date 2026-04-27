package homework.ch11_13.p3;

/**
 * Manual test entry for Programming Problem 2.
 */
public class CourseTest {
    public static void main(String[] args) {
        Faculty teacher = new Faculty("Dr. Zhang", 45, 1001, "Professor", "zhang@hust.edu.cn");

        Course javaCourse = new Course("Java Programming", teacher);
        Course dsCourse = new Course("Data Structure", new Faculty("Dr. Li", 50, 1002, "Professor", "li@hust.edu.cn"));

        Student s1 = new Student("Alice", 20, 2023001, "CS", "CS2301");
        Student s2 = new Student("Bob", 21, 2023002, "CS", "CS2301");
        Student s3 = new Student("Carol", 20, 2023003, "SE", "SE2302");
        Student s4 = new Student("David", 22, 2023004, "AI", "AI2301");

        javaCourse.register(s1);
        javaCourse.register(s2);
        javaCourse.register(s3);
        javaCourse.register(s1);

        dsCourse.register(s2);
        dsCourse.register(s3);
        dsCourse.register(s4);

        Course[] courses = {javaCourse, dsCourse};
        for (Course c : courses) {
            System.out.println(c);
        }

        Person pClone = (Person) s1.clone();
        System.out.println("Student clone equals original: " + pClone.equals(s1));
        System.out.println("Student clone same ref: " + (pClone == s1));

        Course cClone = (Course) javaCourse.clone();
        System.out.println("Course clone equals original: " + cClone.equals(javaCourse));
        System.out.println("Course clone same ref: " + (cClone == javaCourse));
        System.out.println("Teacher same ref after clone: " + (cClone.getTeacher() == javaCourse.getTeacher()));
        System.out.println("Students list same ref after clone: " + (cClone.getStudents() == javaCourse.getStudents()));
    }
}
