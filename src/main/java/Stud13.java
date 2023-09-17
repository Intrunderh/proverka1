import java.util.Arrays;

public class Stud13 {
    public static void main(String[] args) {
        int[] data = {1, 4, 5, 6, 7, 8, 11};
        int[] array = Arrays.copyOf(data, 4);
        System.out.println(Arrays.toString(array));
    }
}
