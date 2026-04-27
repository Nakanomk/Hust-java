package homework.ch11_13.p3;

import java.util.Objects;

/**
 * Faculty class.
 */
public class Faculty extends Person {
    private int facultyId;
    private String title;
    private String email;

    public Faculty() {
    }

    public Faculty(String name, int age, int facultyId, String title, String email) {
        super(name, age);
        this.facultyId = facultyId;
        this.title = title;
        this.email = email;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", facultyId=" + facultyId +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Faculty)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Faculty other = (Faculty) obj;
        return facultyId == other.facultyId
                && Objects.equals(title, other.title)
                && Objects.equals(email, other.email);
    }

    @Override
    public Object clone() {
        String clonedName = getName() == null ? null : new String(getName());
        String clonedTitle = title == null ? null : new String(title);
        String clonedEmail = email == null ? null : new String(email);
        return new Faculty(clonedName, getAge(), facultyId, clonedTitle, clonedEmail);
    }
}
