import java.util.ArrayList;
import java.util.Scanner;

public class comman extends Farm{
	
		private ArrayList <String> name = new ArrayList<String>();
		private ArrayList <String> pokemon = new ArrayList<String>();
		private ArrayList <String> type = new ArrayList<String>();
		private ArrayList <Float> Weight = new ArrayList<Float>();
		private ArrayList <Integer> Evo = new ArrayList<Integer>();
		public comman (){
        String s = new String();
       
       Scanner Sc = new Scanner(System.in);
       System.out.print("Num : ");
       int a = Sc.nextInt();
       s = Sc.nextLine();
       
       for(int i=0;i<a;i++){
           System.out.print((i+1)+":");
           s = Sc.nextLine();
           name.add(s);
           float wr = 5+(float)(Math.random()*(90));
           Weight.add(wr);
           type.add(getType());
           pokemon.add(pokemonName(type.get(i)));
           String ss = name.get(i);
           name.set(i,ss);    
           Evo.add(0);
       }
       
       }
     public void Remove(int i) {
    	 System.out.println("Remove "+name.get(i)+" complete.");
    	   	name.remove(i);
    	   	type.remove(i);
    	   	Weight.remove(i);
    	   	pokemon.remove(i);
    	    
       }
     public void LisePokemon() {
    	   for(int i=0;i<name.size();i++){
        	   System.out.println((i+1)+" "+name.get(i) + " ("+pokemon.get(i)+")"+"  Weight : "+Weight.get(i)+"  Type : "+type.get(i));
               }
       }
     public void LiseWeight() {
    	 for(int i=0;i<name.size();i++){
      	   System.out.println(name.get(i)+"  Weight : "+Weight.get(i));
             }
     }
     public void addPokemon() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Name : ");
    	 String s = sc.nextLine();
         name.add(s);
         float wr = 5+(float)(Math.random()*(90));
         Weight.add(wr);
         String Type = getType();
         type.add(Type);
         pokemon.add(pokemonName(Type));
         Evo.add(0);
     }
     public void getWeight(int i) {
    	 System.out.println(Weight.get(i));
     }
     public void Feed() 
     {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Select Pokemon is eat?");
    	for(int i=0;i<name.size();i++)
       	   System.out.println((i+1)+" "+name.get(i));
    	int a = sc.nextInt();
  	   float w = (float) (Weight.get(a-1)+0.7);
  	   Weight.set(a-1,w);
  	   System.out.println(name.get(a-1)+"is eating. Yum Yum.........(Weight +0.7)");
     }
     public void walkRun() 
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Select Pokemon is walk-Run?");
    	 for(int i=0;i<name.size();i++)
        System.out.println((i+1)+" "+name.get(i));  	  
    	 int a = sc.nextInt();
  	   float w = (float) (Weight.get(a-1)-0.6);
  	   Weight.set(a-1,w);
  	   System.out.println(name.get(a-1)+"is walking Run..........(Weight -0.6)");
     }
     public void evolution() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Select Pokemon is evolution!");
    	 for(int i=0;i<name.size();i++)
    	        System.out.println((i+1)+" "+name.get(i)+ " ("+pokemon.get(i)+")");
    	 int a = sc.nextInt();
    	 if(Evo.get(a-1)==0) {
    		 System.out.print(pokemon.get(a-1)+"......EVOLUTION!!!  ==>  ");
    		 String s = pokemonNameEvo1(pokemon.get(a-1),Evo.get(a-1));
    		 Evo.set(a-1, 1);
    		 pokemon.set(a-1, s);
    		 System.out.println(pokemon.get(a-1)+"!");
    	 }
    	 else if(Evo.get(a-1)==1) {
    		 System.out.print(pokemon.get(a-1)+"......MATRIX EVOLUTION!!!  ==>  ");
    		 String s = pokemonNameEvo1(pokemon.get(a-1),Evo.get(a-1));
    		 Evo.set(a-1, 1);
    		 pokemon.set(a-1, s);
    		 System.out.println(pokemon.get(a-1)+"!");
    	 }
    	 
     }
     public float pokeball() {
    	 int a;
    	 Scanner sc = new Scanner(System.in);
    	 do {
    	 System.out.print("Select PokeBall.\n1.PokeBall\n2.GreatBall\n3.UltraBall\n");
    	 a = sc.nextInt();
    	 switch(a) {
    	 case(1):return 0.8f;
    	 case(2):return 0.9f;
    	 case(3):return 1.0f;
    	 }}while(a==1||a==2||a==3);
    	 
    	 return 0.0f;
     }
     public void wildPokemon() {
    	 Scanner sc = new Scanner(System.in);
    	 String s = pokemonName(getType());
    	 System.out.println("Meet the Jungle Pokémon!! ==> "+s+"!!!\nCatch pokemon?\nN/Y");
    	 String ss = sc.nextLine();
    	 if(ss.equals("Y")||ss.equals("y")) {
    		 float Moot = (float) (Math.random()*1); 
    		 float a = Moot*pokeball();
    		 if(a>0.5f) {
    			 System.out.println("Catch Pokemon successfully");
    			 System.out.println("Keep in a bag\nN/Y");
    			 ss = sc.nextLine();
    	    	 if(ss.equals("Y")||ss.equals("y")) {
    	    		 System.out.print("Name : ");
    	        	 ss = sc.nextLine();
    	             name.add(ss);
    	             float wr = 5+(float)(Math.random()*(80));
    	             Weight.add(wr);
    	             String Type = getType();
    	             type.add(Type);
    	             pokemon.add(s);
    	             Evo.add(0);
    	    	 }
    			 
    		 }else System.out.println("Pokemon is run!!");
    		 
    	 }else System.out.println("Pokemon is run!!");
     }
     
}
       
       
   
   


