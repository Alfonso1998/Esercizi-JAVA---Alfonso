import java.rmi.server.SkeletonMismatchException;
import java.util.Random;

public class MatriceRandom {
    public static void main(String[] args){
matriceRandom();
    }

public static void matriceRandom(){
    int[][] matrix= new int[4][3];
    Random generaN= new Random();
    int number;
    int sommaRiga=0;
    for(int i=0;i<matrix.length;i++){
        sommaRiga=0;
            for(int k=0;k<3;k++){ 
            number=generaN.nextInt(9)+1;
             matrix[i][k]=number;  
             sommaRiga=sommaRiga+matrix[i][k];
             System.out.print(matrix[i][k] + "  ");
           
             }
             System.out.println("" + "| " + sommaRiga);  
         }
          
    }
}








