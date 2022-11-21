import java.util.Scanner;
public class Compreso {
    
    public static void compreso(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Dammi il primo numero");
        int a=scan.nextInt();
        System.out.println("Dammi il secondo numero");
        int b=scan.nextInt();
        System.out.println("Dammi il terzo numero");
        int c=scan.nextInt();
        if(b>a && b<c){
            System.out.println("Il numero" + " " + b + " " + "e' compreso tra i numeri" + " " + a + " "+ "e" + " " + c);
        }else{
            System.out.println("Il numero non e' compreso");
        }
    }

    public static void main(String[] args){
        Compreso.compreso();
    }
}
