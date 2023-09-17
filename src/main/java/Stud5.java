import java.util.Arrays;

public class Stud5 {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, array.length / 2, valueStart);
            Arrays.fill(array, array.length / 2, array.length, valueEnd);
        }
        else {
            Arrays.fill(array, 0, array.length / 2 + 1, valueStart);
            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
            System.out.println("Количество элементов массива: [" + array.length + "]");

            System.out.println("Массив: " + Arrays.toString(array));
            System.out.println();
            int count10 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 10) {
                    count10++;
                }
            }
            System.out.println("Количество цифр 10 в массиве = [" + count10 + "]");
            int count13 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 13) {
                    count13++;
                }
            }
            System.out.println("Количество цифр 13 в массиве = [" + count13 + "]");
        }
    }
}