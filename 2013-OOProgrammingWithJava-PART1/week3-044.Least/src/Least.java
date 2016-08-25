
public class Least {

    public static int least(int number1, int number2) {
        return (number1<=number2)? number1 : number2;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
