package model;

import java.sql.SQLOutput;

public class Charmer extends Pokemon implements IEfire{
    public Charmer() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Charmander attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Charmander attack Scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Bulbasor attack bite");
    }

    @Override
    public void attackFireFist() {
        System.out.println("fire");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("flame");
    }
}
