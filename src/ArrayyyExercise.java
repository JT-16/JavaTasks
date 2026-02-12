import java.util.*;

public class ArrayyyExercise {
    public static void main(String[] args) {
         // students subjects and marks
        // English = 77, Physics = 90, Further Mathematics = 95
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] figures = new int[size];

        // input
        for (int a = 0; a < size; a++) {
            figures[a] = sc.nextInt();
        }

        int b = sc.nextInt();

        // output
        for (int a = 0; a < figures.length; a++) {
            if (figures[a] == b) {
                System.out.println("b found at index : " + a);
            }
        }





    }
}
