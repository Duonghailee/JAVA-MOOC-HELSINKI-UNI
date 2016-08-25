public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0){
            System.out.print("*");
            amount--;
          }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = size-1;
        int j = 1;
       
        while(j<=size){
            printWhitespaces(i);
            printStars(j);
            i--;
            j++;
        }
            
       
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = height-1;
        int j = 1;
        while(j<2*height){
            printWhitespaces(i);
            printStars(j);
            i--;
            j+=2;
        }
        int k=1;
        while(k<3){
            printWhitespaces(height-2);
            printStars(3);
            k++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
