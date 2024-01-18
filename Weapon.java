package latihan3;

public class Weapon {
    String weapon;
    double attack;

    Weapon (String weapon, double attack) {
        this.weapon = weapon;
        this.attack = attack;
    }
    void show() {
        System.out.println("Weapon : " + this.weapon + " , " + "Attack : " + this.attack);
    }
}
