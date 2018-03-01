import java.util.Scanner;

public class Farm extends Pokemon{
	
	public void choose () {
		int n;
		comman c = new comman();
	    	   int a;
	    	do {
	    		 System.out.print("Choose 1.PokemonFarm 2.Walk-Run 3.Food 4.List Pokemon  5.Exit\n");
	    		 Scanner sc = new Scanner(System.in);
	    		 a = sc.nextInt();
	       if(a==1){
	    	   do {
	    			System.out.print("Choose 1.Add-Pokemon 2.Remove-Pokemon 3.Feed 4.Weight 5.Evolution 6.Exit\n ");
	    				n = sc.nextInt();
	    		    if(n==1){
	    		        c.addPokemon();
	    		    }
	    		    else if(n==2){
	    		    	c.LisePokemon();
	    		    	System.out.print("Add number for remove Pokemon : ");
	    		    	int i = sc.nextInt();
	    		        c.Remove(i-1);
	    		    }
	    		    else if(n==3){
	    		        c.Feed();
	    		    }
	    		    else if(n==4){
	    		    	c.LiseWeight();
	    		    }
	    		    else if(n==5) {
	    		    	 c.evolution();
	    		       }
	    			}while(n!=6);
	       }
	       else if(a==2){
	    	   c.walkRun();
	       }
	       else if(a==3){
	    	   c.Feed();
	       }
	       else if(a==4) {
	           c.LisePokemon();
	       }
	       
		
	} while(a!=5);}
	}
    

