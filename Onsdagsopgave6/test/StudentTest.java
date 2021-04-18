import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void averageGrade() {
        Student student = new Student("John",2000,new int[] {4,7,10,12,2,7,10});
        assertEquals(7,student.averageGrade());
    }
}