import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void averageGrade() {
        //Arrange
        Student student = new Student("John",2000,new double[] {4,7,10,12,2,7,10});
        double expected = 8.1;
        //Act
        double actual = student.averageGrade();
        //Assert

        assertEquals(expected,actual);
    }
}