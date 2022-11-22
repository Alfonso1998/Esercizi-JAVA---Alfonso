
import java.util.Scanner;

public class Decrescente {

    public static void decrescente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dammi un numero a 5 cifre");
        int x = scan.nextInt();

        if (x > 9999 && x < 100000) {
            for (int i = 0; i < x; i += 2) {
                int n = x - i;

                if (n == 150 || n < 150) {
                    break;
                }
                System.out.println(n);
            }
        } else {
            System.out.println("ERRORE");
        }

        boolean flag = true;
        while (flag) {
            System.out.println("Dammi un numero a 5 cifre");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            if (x > 9999 && x < 100000) {
                flag = false;
                for (int i = 0; i < x; i += 2) {
                    int n = x - i;

                    if (n == 150 || n < 150) {
                       
                        break;
                    }else {
            System.out.println("ERRORE");
        }
        System.out.println(n);

                }
            }
        }

    }

    public static void main(String[] args) {
        decrescente();
    }
}
