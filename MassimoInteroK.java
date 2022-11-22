import java.util.Scanner;;
public class MassimoInteroK {

public static void massimoInteroK(){
    System.out.println("---MaxValueK");
    System.out.println("Dammi un numero maggiore di 0:  ");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int k=0;
    if(n>=0){
        for( int i=0;i<n;i++){
            if(k<=n){
                k=k+i;
                if(k>n){
                     break; 
                }
                System.out.println(k);
            }else{
                break;
            }
        }
    }
}






    public static void main(String[] args){
        massimoInteroK();
    }
}
