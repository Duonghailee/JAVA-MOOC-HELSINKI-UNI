
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array){
        int min = array[0];
        for(int i:array){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int index = 0;
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexNew = index;
        int min = array[index];
        for(int i=index;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                indexNew = i;
            }
        }
        return indexNew;
    }
    
    //swap method
    public static void swap(int[] array, int index1, int index2){
        int a = array[index1];
        array[index1] = array[index2];
        array[index2] = a;
        
    }
    
    // sorting method by selection algorithm
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            int index = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,index);
            System.out.println(Arrays.toString(array));
        }
    }
}
