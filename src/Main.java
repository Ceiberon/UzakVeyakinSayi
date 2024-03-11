import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Arrays.sort(list);

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        int i = input.nextInt();

        int min = list[0];
        int max = list[0];

        for (int num : list) {
            if (num < i) {
                min = num;
            }  if (num > i) {
                max = num;
                break;
            }
        }

        System.out.println("En yakın küçük: " + min);
        System.out.println("En yakın büyük: " + max);

        System.out.println(Arrays.toString(list));
    }
}



