import java.util.Arrays;

public class Stud6 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int firstPart = 0;

        if (array.length % 2 == 0){
            firstPart = array.length / 2;
        }
        else{
            firstPart = array.length / 2 + 1;
        }
        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
