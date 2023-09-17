import java.util.Random;

public class Stud29 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int x = random.nextInt(8);
            System.out.println(x);
        }
    }
}
