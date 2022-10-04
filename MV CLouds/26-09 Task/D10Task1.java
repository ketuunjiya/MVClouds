import java.util.*;

class OddElement {

    public class arraycheckodd {

        public static void main(String[] args) {

            int Ar[] = new int[4];

            Ar[0] = 3;
            Ar[1] = 4;
            Ar[2] = 5;
            Ar[3] = 16;

            for (int i = 0; i < Ar.length; i++) {
                if (Ar[i] % 3 == 0 || Ar[i] % 5 == 0) {
                    System.out.println("the array is an odd array");
                } else {
                    System.out.println("The array is an even array");
                }
            }
        }
    }
}