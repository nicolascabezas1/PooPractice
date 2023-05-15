package model;

import java.sql.SQLOutput;

public class Electric extends Pokemon implements IEelectric{
    public Electric() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Electric attack tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Electric attack scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Electric attack bite");
    }

    @Override
    public void attackThunder() {
        System.out.println("drenaje");
    }

    @Override
    public void attackThunderFist() {
        System.out.println("paralizar");
    }
}
