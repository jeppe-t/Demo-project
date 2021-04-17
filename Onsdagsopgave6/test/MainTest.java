import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void averageGrade() {

        //Arrange

        Student student3 = new Student("Magnus" ,2024, new int[] {4, 0, 0, 10, 7, 0, 7});
        int expected = 4;

        //Act
        int actual = student3.averageGrade();

        //Assert

        assertEquals(expected, actual);


    }
}