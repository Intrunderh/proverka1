public class Stud10 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] tmp = new int[array.length];
        for(int i = array.length-1; i >= 0; i--){
            tmp[(array.length - 1) - i] = array[i];
        }
        System.arraycopy(tmp, 0, array,0, tmp.length);

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
