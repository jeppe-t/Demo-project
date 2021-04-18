import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void averageGrade() {

        //Arrange

        Student student3 = new Student("Magnus" ,2024, new double[] {4, 0, 0, 10, 7, 0, 7});
        double expected = 4.21;

        //Act
        double actual = student3.averageGrade();

        //Assert

        assertEquals(expected, actual);


    }
}