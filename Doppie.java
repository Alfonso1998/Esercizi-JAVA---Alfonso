import java.util.Scanner;
public class Doppie {
    
   
    public static void doppie(){
        System.out.println("Scrivi qualcosa e ti diro' se ci sono doppie");
        Scanner input=new Scanner(System.in);
        boolean res=false;
        String str=input.nextLine();
        int k=0;
        for(int i=0;i<str.length();i++){
            k++;
            if(str.charAt(k)==str.charAt(i)){
                res=true;
                System.out.println(res);
            }else{
                res=false;
                System.out.println(res);
            }
        }  
        
    }
    
    
    
    
    
    
    public static void main(String[] args){
        doppie();
    }
}
