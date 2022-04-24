import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <=0) {
            System.out.println ("sorry błędna liczba");
            sc.close();
            System.exit(1);
        }

        for (int row = 0; row < n; row++){
            int chars = row * 2 + 1;
            int spaces = n - 1;

            for (int tmp = 0; tmp < spaces; tmp ++) {
                System.out.print(" ");
            }

            for (int tmp = 0; tmp < chars; tmp++) {
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();
    }
}
