import model.Bulbasor;
import model.Charmer;
import model.Electric;
import model.Squirtle;

public class Main {
    public static void main(String[] args) {
        Bulbasor bulbasor = new Bulbasor();
        Charmer charmer = new Charmer();
        Squirtle squirtle = new Squirtle();
        Electric electric = new Electric();

        squirtle.attackAir();
        squirtle.attackWater();
        charmer.attackFireFist();
        charmer.attackFlamethrower();
    }
}