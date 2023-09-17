public class Stud38 {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
//               4  +    4 * 4

        System.out.println(b);
    }
}
