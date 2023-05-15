package model;

public class Squirtle extends Pokemon implements Iwater{
    public Squirtle() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Squitle attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Squitler attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("squirtle attack bite");
    }

    @Override
    public void attackWater() {
        System.out.println("agua");
    }

    @Override
    public void attackAir() {
        System.out.println("aire");
    }
}
