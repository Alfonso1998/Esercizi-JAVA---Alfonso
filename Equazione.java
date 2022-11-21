import java.math.*;
public class Equazione {
    static void equazioneSecondoGrado(int a, int b, int c) {
        int y = (b * b) - 4 * (a * c);
        if (y > 0) {
            int x1 = (int) (-b + Math.sqrt(y) / 2 * a);
            int x2 = (int) (-b - Math.sqrt(y) / 2 * a);
            System.out.println("Le radici sono" + " " + x1 + " " + x2);
      
        } else if (y == 0) {
            int x1 = -b / 2 * a;
            int x2 = x1;
            System.out.println(a*(x1*x1) + b*x1 + c);
            System.out.println("La radice e' " + " " + x1);
        } else {
            System.out.println("L'equazione non ha radici reali");
        }
}


public static void main(String[] args) {

    Equazione.equazioneSecondoGrado(3, 10, 4);

}

}