import java.util.Scanner;

public class Stud14 {
    public static String multiple(String str, int times)
    {
        String result = "";
        for (int i = 0; i < times; i++)
            result = result + " "+ str;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.nextLine();
        System.out.print("Введите количество повторений: ");
        int times = sc.nextInt();
        System.out.println(multiple(word, times));
    }
}
