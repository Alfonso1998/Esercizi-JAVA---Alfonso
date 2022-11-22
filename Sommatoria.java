import java.util.Scanner;
public class Sommatoria {


    public static void sommatrice(){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("----SOMMATRICE----:\n");
        System.out.print("Dammi un numero:");
        int y=scan.nextInt();
        int sum=0;
        
        while(y!=0){
         sum=sum+y;
         System.out.println("La somma e': " +" "+ sum);
         System.out.print("Dammi un numero:");
         y=scan.nextInt();
        }


    }
    public static void main(String[] args){
        sommatrice();
    }
}
