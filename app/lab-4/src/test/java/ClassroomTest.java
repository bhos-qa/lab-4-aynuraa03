import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassroomTest {

    @Test
    public void testMethodOne() {
        Classroom classroom = new Classroom();

        // Redirect standard output to capture printed statements
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodOne();

        String expectedOutput = "Adding a new student to the classroom.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodTwo() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodTwo();

        String expectedOutput = "Removing a student from the classroom.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodThree() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodThree();

        String expectedOutput = "Listing all students in the classroom.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodFour() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodFour();

        String expectedOutput = "Assigning homework to the class.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodFive() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodFive();

        String expectedOutput = "Grading homework for the students.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Add more tests for methods six to ten similarly...

    @Test
    public void testMethodSix() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodSix();

        String expectedOutput = "Conducting a test for the students.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodSeven() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodSeven();

        String expectedOutput = "Calculating average grade of the class.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodEight() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodEight();

        String expectedOutput = "Scheduling a new class.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodNine() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodNine();

        String expectedOutput = "Notifying parents about the class activities.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMethodTen() {
        Classroom classroom = new Classroom();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        classroom.methodTen();

        String expectedOutput = "Providing feedback to students.\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
