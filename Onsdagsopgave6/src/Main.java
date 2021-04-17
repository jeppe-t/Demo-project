public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run(){

        //Hardcoded characters.

        Student student1 = new Student("Henrik", 2022, new int[] {2, 2, 12, 10, 7, 4, 5});
        Student student2 = new Student("Lars", 2023, new int[] {2, 4, 0, 10, 7, 7, 2});
        Student student3 = new Student("Magnus" ,2024, new int[] {4, 2, 12, 10, 7, 4, 7});

        System.out.println("This is a list of all three students and their grades: ");
        System.out.println(student1.toString().replace("[", "").replace("]", "")
                + student2.toString().replace("[", "").replace("]", "")
                + student3.toString().replace("[", "").replace("]", ""));

    }

}


