public class MaxNume {
    
   
public static void main(String[] args) {

    MaxNume.numeroMax(2, 3);
    MaxNume.numeroMax(3, 3);
    MaxNume.numeroMax(4, 3);


}   
     static void numeroMax(int x, int y) {
      if (x > y) {
      System.out.println(x);
     } else if (y > x) {
     System.out.println(y);
     } else {
     System.out.println("I numeri sono uguali");
     }
     }
}
