package model;

import java.sql.SQLOutput;

public class Bulbasor extends Pokemon implements Iplant{
    public Bulbasor() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Bulbasor attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Bulbasor attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Bulbasor attack bite");
    }

    @Override
    public void attackPlant() {
        System.out.println("plant");
    }

    @Override
    public void attackNature() {
        System.out.println("nature");
    }
}
