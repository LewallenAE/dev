package Introduction_To_Software_Development;

public class HeroMain {

    public static void main(String[] args) {

        Hero fireFist = new Hero();
        fireFist.name = "Fire Fist";
        System.out.println("Name of the Hero: " + fireFist.name);

        int punchDamage1 = fireFist.calculatePunchDamage();
        System.out.println("Ouch, your punch caused " + punchDamage1 + " % damage.");

        Hero frostBlizzard = new Hero();
        frostBlizzard.name = "Frost Blizzard";
        frostBlizzard.strength = 35;
        System.out.println("Name of the Hero: " + frostBlizzard.name);

        int specialAttackDamage = frostBlizzard.calculateSpecialAttackDamage("Ice Blast");
        System.out.println("Your Ice Blast freezes for " + specialAttackDamage + "% damage");

        System.out.println("Fire Fist: " + fireFist);
        System.out.println("Frost Blizzard: " + frostBlizzard);


    } // end main
} // end class
