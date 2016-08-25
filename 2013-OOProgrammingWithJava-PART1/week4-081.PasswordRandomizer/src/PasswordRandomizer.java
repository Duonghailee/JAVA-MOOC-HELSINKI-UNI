import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random getPass;
    
    // Define the variables

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.getPass = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String source = "abcdefghijklmnopqrstuvxyz";
        String pass ="";
        for(int i=0;i<length;i++){
            pass += source.charAt(getPass.nextInt(25));
        }
        return pass;
    }
}
