public class Gadget {

    


private String name;
private String material;
private String type;


public Gadget(String name, String material, String type) {
this.name = name;
this.material = material;
this.type = type;
}

public void useGadget() {
	System.out.println("This is a: " + name + " made from " + material + " and it is used for " + type + ".");
}

public String getName(){
return name;
}

public String getMaterial() {
return material;
}

public String getType() {
return type;
}

public void setName(String name) {
 this.name = name;
}

public void setMaterial(String material) {
 this.material = material;
}

public void setType(String type) {
 this.type = type;
}

public static void main(String[] args) {

Gadget g = new Gadget("Samoflange", "glass", "confusing the Thundercats, hoooooooooooooo!");
g.useGadget();

}

}
    

