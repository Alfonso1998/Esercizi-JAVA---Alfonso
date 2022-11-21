import java.util.Scanner;
public class Paridispari {



    public static void pariDispari(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Dammi un numero:");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.println("Il numero" + " " + n + " " + "e' pari");
        }else{
            System.out.println("Il numero" + " " + n + " " + "e' dispari");
        }
    }
    public static void main(String[] args){
        pariDispari();

    }
}
