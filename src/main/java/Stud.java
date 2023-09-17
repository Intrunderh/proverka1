import java.util.Arrays;
import java.util.Scanner;

public class Stud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int N = sc.nextInt();
        int[][] multiArray = new int[N][];
        int count = 0;

        for (int i = 0; i < multiArray.length; i++) {
            System.out.print("Введите длинну " + (++count) + " строки: ");
            int z = sc.nextInt();
            multiArray[i] = new int[z];
        }
        System.out.println();
        System.out.println("Результат: ");
        System.out.println();
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                String skobki = Arrays.toString(multiArray);
                skobki = "[]";
                System.out.print(skobki + " ");
            }
            System.out.println();
        }
    }
}
