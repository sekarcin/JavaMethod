package latihan3;

public class Armor {
    String namaSenjata;
    double defence;

    Armor (String namaSenjata, double defence) {
        this.namaSenjata = namaSenjata;
        this.defence = defence;
    }
    void show() {
        System.out.print("Armor : " + this.namaSenjata + " , " + "Defence : " + this.defence);
    }
}
