import java.util.Arrays;

public class Student {

    private String name;
    private int graduateYear;
    private int [] grades;

    public Student(String name, int graduateYear, int grades [] ){
//test comment
        this.name = name;
        this.graduateYear = graduateYear;
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Student" +
                "\nName= "+ name +
                "\nGraduateYear= " + graduateYear +
                "\nGrades= " + Arrays.toString(grades);
    }

    public int averageGrade(){

        int sum = (grades[0] + grades[1] +grades[2] + grades[3] +grades[4] + grades[5] + grades[6]) / 7;
        System.out.println("Average grade is: " + sum + "\n");
        return sum;
    }


}
