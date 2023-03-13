import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Textbook> textbooks = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void addInstructors(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    public void addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + this.getCourseName() + '\n' +
                ", instructors=" + this.getInstructors() + '\n' +
                ", textbooks=" + this.getTextbooks() +
                '}';
    }
}
