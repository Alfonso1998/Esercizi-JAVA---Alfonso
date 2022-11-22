public class MatriceDiagonale {
    
    public static void main(String[] args){
        matrice('A',51);
    }

    public static void matrice(char carattere, int grandezza){
        char num='0';
        char letter=carattere;
        char[][] matrix = new char[grandezza][grandezza];
        for(int i=0;i<matrix.length;i++){
           for(int k=0;k<grandezza;k++){ 
            matrix[i][k]=num;
            matrix[i][i]=letter; 
            matrix[i][grandezza-1-i]=letter;                 
            }
            System.out.println(matrix[i]);
        }
    }









}
