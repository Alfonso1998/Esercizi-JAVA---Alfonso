import java.util.Scanner;
public class ValoreAssoluto {

public static void valoreAssoluto(){
    System.out.println("---VALORE ASSOLUTO---\n");
    System.out.println("Dammi un numero: ");
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    if(x>=0){
        System.out.println("Il valore assoluto di | " + x + "| e': " + " " + x);
    }else{
        System.out.println("Il valore assoluto di |" + x + "| e': " + " " + -x);
    }
}


    public static void main(String[] args){
        valoreAssoluto();
    }
}
