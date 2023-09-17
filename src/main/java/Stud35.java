import java.util.Scanner;

public class Stud35 {
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return ((number & (1 << flagPos)) == (1 << flagPos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chislo = sc.nextInt();
        System.out.print("Установите флаг: ");
        int flagPOOOS = sc.nextInt();
        System.out.println("Вывод:");
        System.out.println(setFlag(chislo, flagPOOOS));
        System.out.println(resetFlag(chislo, flagPOOOS));
        System.out.println(checkFlag(chislo, flagPOOOS));
    }
}
