

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + original.toString());
        System.out.println( "copied: " + copied.toString());
    }
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[array.length-i-1];
        }
        return newArray;
    }
}
