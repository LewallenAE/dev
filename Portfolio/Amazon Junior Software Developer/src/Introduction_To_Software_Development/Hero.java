package Introduction_To_Software_Development;

public class Hero {


    String name = "Hero";
    int strength = 20;
    int health = 100;

    public int calculatePunchDamage() {
        return strength * 2;
    }

    public int calculateSpecialAttackDamage(String attackType) {
        int damage = strength;

        if(attackType.equals("Fire Punch")) {
            damage = damage * 3;
        } else if (attackType.equals("Ice Blast")) {
            damage = damage * 2;
        }
        return damage;
    }

}
