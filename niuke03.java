import java.util.ArrayList;
import java.util.Scanner;

public class niuke03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        int num = 2;
        while (integers.size() < end) {
            if (isPrime(num)) {
                integers.add(num);
            }
            num++;
        }
        for (int i = start - 1; i < end; i++) {
            System.out.print(integers.get(i));
            if ((i - start + 2) % 10 == 0 || i == end - 1){
                System.out.println();
            } else {
                System.out.print(" ");
            }

        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
