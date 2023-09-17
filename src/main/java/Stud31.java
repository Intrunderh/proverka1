import java.util.Scanner;

public class Stud31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = sc.nextInt();
        System.out.print("Введите число y: ");
        int y = sc.nextInt();
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
        System.out.print("Числа изменены местами: " + x + ", " + y);
    }
}
