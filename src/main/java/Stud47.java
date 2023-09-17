import java.util.StringTokenizer;

public class Stud47 {
    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
