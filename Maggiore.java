import java.util.Scanner;
public class Maggiore {



    public static void maggiore(){
        System.out.println("---MAGGIORE---\n");
        System.out.println("Quanti numeri?");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int max=0;
        for(int i=0;i<num;i++){
            System.out.println("Dammi un numero:  ");
            Scanner scan1=new Scanner(System.in);
            int x=scan1.nextInt();
            if(x>max){
                max=x;
               
            }
        }
        System.out.println("Il massimo e': " + " " + max);
    }
    public static void main(String[] args){
        maggiore();
    }
}
