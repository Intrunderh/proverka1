import java.util.Scanner;

public class Stud42 {
    /*
    Публичный статический метод toOctal(int) должен
    переводить целое число, полученное в качестве входящего параметра,
    из десятичной системы счисления в восьмеричную. А публичный статический
    метод toDecimal(int) наоборот — из восьмеричной в десятичную.
    Методы работают только с положительными числами.
    Если входящий параметр меньше или равен 0, методы возвращают 0.
    Твоя задача — реализовать эти методы.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int decimalNumber = sc.nextInt();
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        System.out.print("Введите второе число: ");
        int octalNumber = sc.nextInt();
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        if (decimalNumber == toDecimal(octalNumber) && octalNumber == toOctal(decimalNumber)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) {
            return 0;
        }

        int octal = 0;
        int i = 0;

        while (decimalNumber != 0) {
            octal = octal + (decimalNumber % 8) * (int) (Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }

        return octal;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) {
            return 0;
        }

        int decimal = 0;
        int i = 0;

        while (octalNumber != 0) {
            decimal = decimal + (octalNumber % 10) * (int) (Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return decimal;
    }
}
