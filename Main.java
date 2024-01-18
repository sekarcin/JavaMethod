package latihan3;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("sekar", 90.0);
        Player player2 = new Player("hetta", 80.0);

        Weapon weapon1 = new Weapon("Scar", 180.0);
        Weapon weapon2 = new Weapon("AWM", 300.0);

        Armor armor1 = new Armor("Vest", 100.0);
        Armor armor2 = new Armor("Vest", 100.0);


        player1.show();
        weapon1.show();
        armor1.show();

        System.out.println("\n");

        player2.show();
        weapon2.show();
        armor2.show();
    }
}
