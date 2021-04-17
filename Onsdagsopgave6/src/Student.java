import java.util.Arrays;

public class Student {

    private String name;
    private int graduateYear;
    private int [] grades;

    public Student(String name, int graduateYear, int grades [] ){

        this.name = name;
        this.graduateYear = graduateYear;
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student" +
                "\nName= "+ name +
                "\nGraduateYear= " + graduateYear +
                "\nGrades= " + Arrays.toString(grades) + "\n\n";
    }
}
