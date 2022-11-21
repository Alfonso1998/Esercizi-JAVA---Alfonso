public class Compreso {
    
    public static void Compreso(int a,int b,int c){
        if(b>a && b<c){
            System.out.println("Il numero" + " " + b + " " + "e' compreso tra i numeri" + " " + a + " "+ "e" + " " + c);
        }else{
            System.out.println("Il numero non e' compreso");
        }
    }

    public static void main(String[] args){
        Compreso.Compreso(1, 2, 60);
    }
}
