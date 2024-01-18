package latihan3;

public class Player {
    String name;
    double health;

    Player (String name, double health) {
        this.name = name;
        this.health = health;
    }
    void show() {
        System.out.println("Nama : " + this.name);
        System.out.println("Health : " + this.health);
    }
}
