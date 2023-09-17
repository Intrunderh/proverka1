import java.util.Arrays;

public class Stud7 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

        int [] sorted =Arrays.copyOf(array,array.length);
        Arrays.sort(sorted);

        if (Arrays.binarySearch(sorted, element) < 0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}