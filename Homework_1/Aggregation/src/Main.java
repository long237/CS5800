import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {

        Course ourCourse = new Course("CS5800");
        Instructor ourInstructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook ourTextbook = new Textbook("Clean Code", "Robert.C.Martin", "Prentice Hall");

        ourCourse.addInstructors(ourInstructor);
        ourCourse.addTextbook(ourTextbook);

        System.out.println("Information about our course: ");
        System.out.println(ourCourse);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("Adding new Instructor and Textbook to our course");
        Instructor randomInstructor = new Instructor("Jon", "Snow", "3-2345");
        Textbook randomTextbook = new Textbook("The Road to Unfreedom", "Timothy Snyder", "Tim Duggan Book");
        ourCourse.addInstructors(randomInstructor);
        ourCourse.addTextbook(randomTextbook);
        System.out.println("Our course after adding new Instructor and textbook");
        System.out.println(ourCourse);
    }
}