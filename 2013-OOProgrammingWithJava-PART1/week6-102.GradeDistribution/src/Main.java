import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeDistribution grades = new GradeDistribution();
        grades.start(reader);
        grades.printResult();
    }
}
       