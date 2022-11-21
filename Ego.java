import java.util.Scanner;
public class Ego {

public static void ego(){
    System.out.println("---EGO---\n");
    System.out.println("Scrivi il tuo nome:" + " ");
    Scanner scan=new Scanner(System.in);
    String nome=scan.nextLine();
    System.out.println("+ - - - - - - +");
    System.out.println("|" + "   " + nome + "   "  + "|");
    System.out.println("+ - - - - - - +");

}



    public static void main(String[] args){
        ego();
    }
}
