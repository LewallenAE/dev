import java.util.*;

public class Creature {

private String name;
private String type;
private String weakness;


public Creature(String name, String type, String weakness) {
this.name = name;
this.type = type;
this.weakness = weakness;
}

public void describe() {
	System.out.println(name + " is a " + type + " and has a weakness of " + weakness + "." + " It's best to consult and update the bestiary as you learn about more monsters!");
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getType() {
return type;
}

public void setType(String type){
this.type = type;
}

public String getWeakness(){
return weakness;
}

public void setWeakness(String weakness){
this.weakness = weakness;
}


public static void main(String[] args) {

Creature swampThing = new Creature("SwampThing", "Elemental", "SwampThing has no weaknesses.");
swampThing.describe();

ArrayList<Creature> beastiary = new ArrayList<>();
beastiary.add(new Creature("Gorefang", "Undead", "Holy Magic"));
beastiary.add(new Creature("Kyron", "Larksup Alien", "Larksup Alien's have no weaknesses."));
beastiary.add(new Creature("Krylar", "Space-Dragon", "Krylar has no weaknesses."));

for (int i = 0; i < beastiary.size(); i++) {
    Creature c = beastiary.get(i);
    c.describe();
    
    
}



}

}




