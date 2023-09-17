import java.util.Scanner;

public class Stud32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chislo = sc.nextInt();
        System.out.println("2 в степени " + "'" + chislo + "'" + " = "+ getPowerOfTwo(chislo));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        result = result << power - 1;
        return result;
    }

}
