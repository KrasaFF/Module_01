package Git;
import java.lang.reflect.Array;
import java.util.*;

public class DZ_012 {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner arrayNumber = new Scanner(System.in);
        int y = 1;
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number " + y++ + ": ");
            if (arrayNumber.hasNextInt()) {
                number[i] = arrayNumber.nextInt();
                } else {
                System.out.println("Вы ввели не число");
            }
        }
        System.out.print("\n\nInitial array: ");
        for (int i = 0; i < number.length ; i++) {
            if (i == number.length -1) {
                System.out.print(number[i] + ". ");
            } else {
                System.out.print(number[i] + ", ");
            }
        }
        Arrays.sort(number);
        System.out.print("\nSorted array: ");
        for (int i = 0; i < number.length ; i++) {
            if (i == number.length -1) {
                System.out.print(number[i] + ". ");
            } else {
                System.out.print(number[i] + ", ");
            }
        }
    }
}
