
import java.util.Scanner;
public class Decrescente {

    public static void decrescente(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Dammi un numero a 5 cifre");
        int x=scan.nextInt();
if(x>9999){
 for(int i=0;i<x; i+=2){
    int n=x-i;
   
    if(n==150 || n<150){
        break;
    }
    System.out.println(n);
 }
}else{
    System.out.println("ERRORE");
}
    }

    public static void main(String[] args){
        decrescente();
    }
}
