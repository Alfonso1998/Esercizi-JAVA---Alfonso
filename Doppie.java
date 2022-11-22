import java.util.Scanner;

public class Doppie {

    public static Boolean doppie() {
        System.out.println("Scrivi qualcosa e ti diro' se ci sono doppie");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            k++;
            if (str.charAt(i) == str.charAt(k)) {
                System.out.println("La frase ha almeno una doppia");
                return true;
            }
        }
        System.out.println("La frase non ha doppie");
        return false;

    }

    public static void main(String[] args) {
        doppie();
    }
}
