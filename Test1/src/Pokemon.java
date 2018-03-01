import java.util.ArrayList;

public class Pokemon {
	public static String getType(){
		 String type;
		int i = (int) (Math.random()*(3));
			if(i == 0) {
				type = "Water";
}
			else if(i == 1) {
				type = "Fire";
	}
			else {
				type = "Grass";

	}
	
		return type;
	
}
	public static String pokemonName(String type) {
		ArrayList <String> name = new ArrayList<String>();
		ArrayList <String> name1 = new ArrayList<String>();
		ArrayList <String> name2 = new ArrayList<String>();
		int a = (int) (Math.random()*3);
		if(type.equals("Water")) {
			name.add("Squirtle");
			name.add("Psyduck");
			name.add("Poliwag");
			name.add("Tentacool");
			return name.get(a);
		}
		else if(type.equals("Fire")) {
			name1.add("Charmander");
			name1.add("Vulpix");
			name1.add("Growlithe");
			name1.add("Ponyta");
			return name1.get(a);
		}
		else if(type.equals("Grass")) {
			name2.add("Bulbasaur");
			name2.add("Oddish");
			name2.add("Paras");
			name2.add("Bellsprout");
			return name2.get(a);
		}
		return null;
		
	}
	public static String pokemonNameEvo1(String n,int evo) {
		if(evo==0) {
			if(n.equals("Squirtle")) {
				return "Wartortle";
			}else if(n.equals("Psyduck")) {
				return "Golduck";
			}else if(n.equals("Poliwag")) {
				return "Poliwhirl";
			}else if(n.equals("Tentacool")) {
				return "Tentacruel";
			}else if(n.equals("Charmander")) {
				return "Charmeleon";
			}else if(n.equals("Vulpix")) {
				return "Ninetales";
			}else if(n.equals("Growlithe")) {
				return "Arcanine";
			}else if(n.equals("Ponyta")) {
				return "Rapidash";
			}else if(n.equals("Bulbasaur")) {
				return "Ivysaur";
			}else if(n.equals("Oddish")) {
				return "Gloom";
			}else if(n.equals("Paras")) {
				return "Parasect";
			}else if(n.equals("Bellsprout")) {
				return "Weepinbell";
		}}else	if(evo==1) {
			if(n.equals("Wartortle")) {
				return "Blastoise";
			}else if(n.equals("Poliwhirl")) {
				return "Poliwrath";
			}else if(n.equals("Charmeleon")) {
				return "Charizard";
			}else if(n.equals("Ivysaur")) {
				return "Venusaur";
			}else if(n.equals("Gloom")) {
				return "Vileplume";
			}else if(n.equals("Weepinbell")) {
				return "Victreebel";
			}
		}
		System.out.println("Can't Evolotion pokemon");
		return n;
	
	}
	
		
}
