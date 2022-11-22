import java.util.Scanner;;

public class MassimoInteroK {

    public static void massimoInteroK() {
        System.out.println("---MaxValueK");
        System.out.println("Dammi un numero maggiore di 0:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int k=0;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                if (sum <= n) {
                    sum+=i;
                    k++;
                    if (sum > n) {
                        break;
                    }
                    System.out.println(k-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        massimoInteroK();
    }
}
