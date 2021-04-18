public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run(){

        //Hardcoded characters.

        Student student1 = new Student("Henrik", 2022, new double[] {2, 2, 12, 10, 7, 4, 7});
        Student student2 = new Student("Lars", 2023, new double[] {2, 4, 0, 12, 7, 7, 4});
        Student student3 = new Student("Magnus" ,2024, new double[] {4, 0, 0, 10, 7, 0, 7});

        System.out.println("This is a list of all three students and their grades: \n");

        System.out.println(student1.toString().replace("[", "").replace("]", ""));
        student1.averageGrade();

        System.out.println(student2.toString().replace("[", "").replace("]", ""));
        student2.averageGrade();

        System.out.println(student3.toString().replace("[", "").replace("]", ""));
        student3.averageGrade();


    }

}


