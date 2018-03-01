import java.util.Scanner;

public class PokemonGame extends Farm{
public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Farm farm = new Farm();
        String s ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to Pokemon Game !!!");
        System.out.print("Enter start : ");
        s = Sc.nextLine();
        if((s.equals("start"))||(s.equals("Start"))){
        	System.out.println("Start !!!");
        	farm.choose();
        }
        System.out.println("End Game.");
       
    }
		
}
