public class Esercizio {

    /*ESERCIZIO NUMERO MAX*/
   
     static void  numeroMax(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        } else {
            System.out.println("I numeri sono uguali");
        }
    }


     public static void main(String[] args) {
       
        Esercizio.numeroMax(2, 4);
        Esercizio.numeroMax(4, 4);
        Esercizio.numeroMax(4, 8);
     

    }
}

/*
 * ESERCIZIO 1
 * int n=0;
 * int n1=1;
 * int res=n+n1;
 * 
 * n=res;
 * 
 * for (int i=0; i<=5; i++){
 * n=res;
 * res=n+n1;
 * n1=res;
 * res=n+res;
 * System.out.println( n + " " + n1);
 * }
 * 
 */
