public class Esercizio {

 
    public static void main(String[] args) {
        int n=0;
        int n1=1;
        int res=n+n1;
        
        n=res;
        
        for (int i=0; i<=5; i++){
        n=res;
        res=n+n1;
        n1=res;
        res=n+res;
        System.out.println( n + " " + n1);
        }
       
    
    }
    }
 
 


 
  

