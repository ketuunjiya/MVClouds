import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter N : ");
            int n = sc.nextInt();
            // System.out.print("Enter Symbol : ");

            // char c = sc.next().charAt(0);

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)

                {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j % 2 == 0) {
                        System.out.print(i - 1);
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();

            }
        }
        System.out.println();
    }

}
